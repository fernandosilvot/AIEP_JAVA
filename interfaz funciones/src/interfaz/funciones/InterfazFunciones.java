package interfaz.funciones;
import java.util.*;
public class InterfazFunciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿La ropa es blanca o de color ?");
        System.out.println("Presiona 1 - Ropa Blanca / 2 - Ropa Color ");
        int tipoderopa = entrada.nextInt();
        
        System.out.println("¿Cuantos kilos de ropa?");
        int kilo = entrada.nextInt();
        
        ll_funciones mensajero = new ll_funciones(kilo, tipoderopa);
        mensajero.CicloFinalizado();
    }
    
}
