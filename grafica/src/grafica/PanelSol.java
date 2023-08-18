/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafica;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Fernando Silva
 */
public class PanelSol extends JPanel {
    public void paintComponent(Graphics g){
        g.setColor(Color.ORANGE);
        g.fillOval(100, 100, 200, 200);
        
        for (double d= 0; d < 2*Math.PI; d += 0.1){
            int xEnd = (int) (200+150*Math.cos(d));
            int yEnd = (int) (200+150*Math.sin(d));
            g.drawLine(200, 200, xEnd, yEnd);
        }
        g.setColor(Color.BLACK);
        g.drawArc(150, 150, 100, 100, 230, 80);
        g.fillOval(150, 150, 20, 20);
        g.fillOval(230, 150, 20, 20);
    }
}
