/*
 * Isak Ahlberg
 * Joline Hallberg
 */
import javax.swing.*;

public class Situation {
    State state = State.Input1;
    JLabel display;
    BinOpButton binaryOperator;
    int leftOperand;

    Situation(JLabel display){
        this.display = display;
    }

    public int getDisplay(){
        return Integer.parseInt(this.display.getText());
    }

    public void setDisplay(int value){
        this.display.setText(String.valueOf(value));
    }
}
