/*
 * Isak Ahlberg
 * Joline Hallberg
 */
public class CancelButton extends CalculatorButton{

    public CancelButton(String label, Situation situation){
        super(label, situation);
    }
    @Override
    public void transition() {
        switch(this.situation.state) {
            case HasResult:
                // Tillbaka till Input1 och nollställ displayen
                this.situation.state = State.Input1;
                this.situation.setDisplay(0);
                break;
            case Input1:
                // Sätt displaytexten till 0
                this.situation.setDisplay(0);
                break;
            case Input2, OpReady:
                // Tillbaka till Input1 och nollställ displayen
                this.situation.state = State.Input1;
                this.situation.setDisplay(0);
                // Samt släck den tända operatorn
                this.situation.binaryOperator.setColor(CalculatorButton.DEFAULT_COLOR);
                break;
            // Samt släck den tända operatorn
            default:
                break;
        }
    }
}
