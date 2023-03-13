/*
 * Isak Ahlberg
 * Joline Hallberg
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public abstract class CalculatorButton extends JButton {
    static final Color DEFAULT_COLOR = Color.WHITE;
    static final Color HIGHLIGHT_COLOR = Color.RED;

    Situation situation;
    String label;

    public CalculatorButton(String label, Situation situation){
        super(label);
        this.label = label;
        this.situation = situation;

        this.setFont(new Font(this.getFont().getFontName(), Font.PLAIN, 40));
        this.setColor(DEFAULT_COLOR);
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transition();
            }
        });
    }

    public abstract void transition();

    public void setColor(Color c){
        this.setBackground(c);
    }

    public String toString(){
        return label;
    }

}
