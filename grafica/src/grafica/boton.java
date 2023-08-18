/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafica;
import javax.swing.*;
import java.awt.*;
public class boton  extends JFrame{
    public boton() {
        super("boton");
        setSize(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JButton boton = new JButton("Pulsame");
        boton.addActionListener(new EventoBotonPulsado());
        cp.add(boton);
    }
    
}
