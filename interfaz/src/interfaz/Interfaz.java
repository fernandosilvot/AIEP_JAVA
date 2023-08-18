/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaz;

import javax.swing.JFrame;

/**
 *
 * @author Fernando Silva
 */
public class Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       formulario form = new formulario();
       form.setBounds(0, 0, 190, 220);
       form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       form.setVisible(true);
       form.setResizable(false);
       form.setLocationRelativeTo(null);
    }
    
}
