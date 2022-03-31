import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JComponent {

    @Override
    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        graphics.setColor(Color.RED);
        graphics.drawOval(10,10,100,100);
    }


}
