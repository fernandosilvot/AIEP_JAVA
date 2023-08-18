/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafica;

import java.awt.*;
import javax.swing.*;


public class MiVentana extends JFrame{
    public MiVentana(){
        super("Saludar basico");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("Nombre: ");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("saludar");
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(boton);
    }
    
}
