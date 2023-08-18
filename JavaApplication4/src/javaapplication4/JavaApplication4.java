
package javaapplication4;
import java.util.Scanner;
public class JavaApplication4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i,  resultado= 0;
        int[] num1 = new int [5];
         
         for (i=0; i < num1.length; i++) {
         System.out.println("ingrese el "+i+" numeros");
         num1[i] = sc.nextInt();
         
         resultado += num1[i];
        
    }
        
         System.out.println("los elemento ["+i+"]= "+ resultado); 
         
         
         
    }
    
}
