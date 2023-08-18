/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idiomas;

import javax.swing.JFrame;

/**
 *
 * @author Fernando Silva
 */
public class Idiomas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Formulario prueba = new Formulario();
      prueba.setBounds(0, 0, 300, 200);
      prueba.setVisible(true);
      prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      prueba.setResizable(false);
      prueba.setLocationRelativeTo(prueba);
    
}
}