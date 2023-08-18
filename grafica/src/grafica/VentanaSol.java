package grafica;

import java.awt.*;
import javax.swing.*;

    

public class VentanaSol extends JFrame {
 public VentanaSol() {
     setSize(400,500);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     Container cp = getContentPane();
     cp.add(new PanelSol());
 }
}

