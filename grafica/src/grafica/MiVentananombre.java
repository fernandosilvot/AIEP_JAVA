/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafica;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Fernando Silva
 */
public class MiVentananombre extends JFrame{
    public MiVentananombre(){
        super("Titulo de Ventana");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        Container cp = getContentPane();
        cp.add(new JLabel("nombre :"));
        JTextField texto = new JTextField(20);
        cp.add(texto);
        JButton botonSaludo = new JButton("Saludar");
        cp.add(botonSaludo);
        botonSaludo.addActionListener(new EventoSaludo(texto));
    }
 }


