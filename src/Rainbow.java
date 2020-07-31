import javax.swing.*;
import java.awt.*;

public class Rainbow extends JPanel {

    private final static Color INDIGO = new Color(128, 0, 179);
    private final static Color VIOLET = new Color(78, 5, 50);


    private Color[] colors = {Color.WHITE, Color.WHITE, Color.RED, Color.ORANGE, Color.YELLOW,
                              Color.GREEN, Color.blue, INDIGO, VIOLET};


    public Rainbow(){
        setBackground(Color.WHITE);
    }


    public void paintComponent(Graphics graphics){

        int radius = 20;
        int centerX = getWidth()/2;
        int centerY = getHeight() - 10;

        for(int counter = colors.length; counter > 0; counter --){
            graphics.setColor(colors[counter - 1]);
            graphics.fillArc(centerX - counter * radius, centerY - counter * radius,
                              counter * radius * 2, counter * radius * 2, 0, 180);

        }

    }
}
