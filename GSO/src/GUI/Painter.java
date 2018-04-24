package GUI;

import javax.swing.*;
import java.awt.*;

public class Painter extends JPanel {

	public Painter(){

    }

    
    public void paint(Graphics g){
        g.drawLine(0, 200, 700, 200);
        //g.drawLine(20, 200, 140, 200);
    }
}
