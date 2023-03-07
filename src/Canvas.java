import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    public Canvas(){
        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gb);
    }
}

class display extends JTextField{
    public display(){
        super();
    }
}

class numPad extends JPanel{
    public numPad(){
        for (int i = 0; i < 16; i++) {

        }
    }
}
