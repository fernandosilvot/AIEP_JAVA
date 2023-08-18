/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package idiomas;
import javax.swing.*;

import javax.swing.event.*;

public class Formulario extends JFrame implements ChangeListener {
 
   
    private JCheckBox check1, check2, check3;
   
   
    public Formulario(){
       
       
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        check1 = new JCheckBox("Ingles");
        check1.setBounds(10,10,150,30);
        check1.addChangeListener(this);
        add(check1);
       
       
        check2 = new JCheckBox("Frances");
        check2.setBounds(10,50,150,30);
        check2.addChangeListener(this);
        add(check2);
       
       
        check3 = new JCheckBox("Aleman");
        check3.setBounds(10,90,150,30);
        check3.addChangeListener(this);
        add(check3);
       
       
       
    }
   public void stateChanged(ChangeEvent e){
       String cad="";
       
       
       if(check1.isSelected() == true){
           cad = cad + "Ingles-";
               
       }
       
       if(check2.isSelected() == true){
           cad = cad + "Frances-";
       }
       
       if(check3.isSelected() == true){
           cad = cad + "Aleman-";
       
       }
       setTitle(cad);
   }
   
}

