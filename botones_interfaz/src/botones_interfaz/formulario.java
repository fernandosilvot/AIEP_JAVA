/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package botones_interfaz;
import javax.swing.*;
import javax.swing.event.*;

public class formulario extends JFrame implements ChangeListener
{
    private JCheckBox radio1, radio2, radio3,radiodefault;
    private ButtonGroup bg;
   
    public formulario()
    {
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        bg = new ButtonGroup();
        
        radiodefault = new JCheckBox("350*230");
        radiodefault.setBounds(10,20,100,30);
        radiodefault.addChangeListener(this);
        add(radiodefault);
        bg.add(radiodefault);
        
        radio1 = new JCheckBox("640*480");
        radio1.setBounds(10,70,100,30);
        radio1.addChangeListener(this);
        add(radio1);
        bg.add(radio1);
       
        radio2 = new JCheckBox("800*600");
        radio2.setBounds(10,120,100,30);
        radio2.addChangeListener(this);
        add(radio2);
        bg.add(radio2);
       
        radio3 = new JCheckBox("1024*768");
        radio3.setBounds(10,170,100,30);
        radio3.addChangeListener(this);
        add(radio3);
        bg.add(radio3);
    }
   
    public void stateChanged(ChangeEvent e)
    {
        if(radiodefault.isSelected()){
            setSize(350, 230);
        }
        if(radio1.isSelected())
        {
            setSize(640,480);
        }
       
        if(radio2.isSelected())
        {
            setSize(800,600);
        }
       
        if(radio3.isSelected())
        {
            setSize(1024,768);
        }
    }
}