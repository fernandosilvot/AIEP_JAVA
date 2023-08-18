/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntos.pkg3d;
import java.awt.*;
/**
 *
 * @author Fernando Silva
 */
public class ComprobarPunto {
     public static void main(String[] args) {
         Point objeto1 = new Point(11 ,22);
         Puntos3D objeto2 = new Puntos3D(7,6,64) ;

         System.out.println("El punto 2D esta localizado en (" + objeto1.x
             + ", " + objeto1.y + ")");
         System.out.println("\tEsta siendo movido a (4, 13) ");
         objeto1.move(4, 13);
         System.out.println("El punto 2D esta ahora en (" + objeto1.x
             + ", " + objeto1.y + ")");
         System.out.println("\tEsta siendo movido -10 unidades tanto en el eje x "
             + "como en el eje y");
         objeto1.translate(-10,- 10) ;
         System.out.println("El punto 2D finaliza en (" + objeto1.x
             + " , " + objeto1.y + " ) \n") ;

         System.out.println("El punto 3D esta localizado en (" + objeto2.x
             + " , " + objeto2.y + " , " + objeto2.z + " ) ");
         System.out.println("\tEsta siendo movido a (10, 22, 71) " ) ;
         objeto2.move(10,22,71 ) ;
         System.out.println("El punto 3D esta ahora en (" + objeto2.x
             + " , " + objeto2.y + " , " + objeto2.z + " ) ");
         System.out.println("\tEsta siendo movido - 20 unidades en los ejes x, y "
             + " z");
         objeto2.translate(-20, -20, -20);
         System.out.println("El punto 3D finaliza en ( " + objeto2.x
             + " , " + objeto2.y + " , " + objeto2.z + " ) ");
     }
 }
