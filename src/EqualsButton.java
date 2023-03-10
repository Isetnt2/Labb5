/*
 * Isak Ahlberg
 * Joline Hallberg
 */
public class EqualsButton extends CalculatorButton{

    public EqualsButton(String label, Situation situation){
        super(label, situation);
    }
    @Override
    public void transition() {
        switch(this.situation.state) {
            case HasResult, Input1, OpReady:
                // Gör inget
                break;
            case Input2:
                // Gå till HasResult
                this.situation.state = State.HasResult;
                // Släck operatorn
                this.situation.binaryOperator.setColor(CalculatorButton.DEFAULT_COLOR);
                // Sätt displayen till det beräknade resultatet mha operatorn
                this.situation.setDisplay(
                        this.situation.binaryOperator.result(
                                this.situation.leftOperand,
                                this.situation.getDisplay()
                        )
                );
                break;
            default:
                break;
        }
    }
}
