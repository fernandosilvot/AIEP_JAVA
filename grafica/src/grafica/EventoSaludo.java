/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafica;
import com.sun.javafx.embed.swing.Disposer;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Fernando Silva
 */
public class EventoSaludo  implements ActionListener{
    
            private JTextField cuadroTexto;
            public EventoSaludo(JTextField cuadroTexto){
                this.cuadroTexto= cuadroTexto;
                
            }
    
            public void actionPerformed(ActionEvent e){
                
                JOptionPane.showMessageDialog(null, "¡Hola,"+cuadroTexto.getText()+"!");
                
            }
}
