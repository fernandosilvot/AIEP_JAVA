/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package botones_interfaz;

import javax.swing.JFrame;


public class Botones_interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      formulario prueba = new formulario();
      prueba.setBounds(0, 0, 350, 230);
      prueba.setVisible(true);
      prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      prueba.setResizable(false);
      prueba.setLocationRelativeTo(prueba);
    }
    
}
