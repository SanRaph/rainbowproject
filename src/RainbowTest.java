import javax.swing.*;
import java.awt.*;


public class RainbowTest{
    public static void main(String[] args) {
        Rainbow rainbow = new Rainbow();

        JFrame app = new JFrame();
        app.setSize(400, 250);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
        app.add(rainbow);
    }

}
