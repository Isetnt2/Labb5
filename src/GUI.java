import javax.swing.*;

public class GUI extends JFrame {

    Canvas canvas;
    public GUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        canvas = new Canvas();
        setContentPane(canvas);
        setVisible(true);
    }

}
