package interfaz.funciones;

public class ll_funciones {
    private int kilo = 0,llenadocompleto = 0, tipoderopa = 0,lavadocompleto=0,Secadocompleto = 0 ;
    
    public ll_funciones(int kilo,int tipoderopa){
        this.kilo = kilo;
        this.tipoderopa = tipoderopa;
    } 
    private  void Llenado(){
        if(kilo <= 12){
            llenadocompleto = 1;
            System.out.println("LLenando...");
            //esperar(5);
            System.out.println("LLenado Completo.");
            //esperar(10);
        }
        else {
            System.out.println("La carga de ropa es muy pesada, reduce la carga.");
        }
    }
    private void Lavado(){
        Llenado();
        if(llenadocompleto ==1){
            if(tipoderopa ==1){
                System.out.println("Ropa Blanca / Lavado Suave");
                //esperar(2);
                System.out.println("Lavando...");
                //esperar(10);
                lavadocompleto =1;
            }
            else if(tipoderopa == 2){
                System.out.println("Ropa de color / lavado Intenso");
                System.out.println("Lavando...");
                lavadocompleto = 1;
            }else{
                System.out.println("El tipo de ropa no esta disponible");
                System.out.println("SE lavara como ropa de color / lavado intenso");
                lavadocompleto = 1;
            }
        }
    }
    private void Secado(){
        Lavado();
        if(lavadocompleto==1){
            System.out.println("Secando...");
            //esperar(15);
            Secadocompleto =1;
        }
    }
    public void CicloFinalizado(){
        Secado();
        if(Secadocompleto==1){
            System.out.println("Tu ropa esta lista!.");
        }
    }
    public static void esperar(int segundos){
        try {
            Thread.sleep(segundos * 1000);
         } catch (Exception e) {
            System.out.println(e);
         }
    }   
    //Getter y Setter 
    public  int gettipoderopa(){
        return tipoderopa;
    }
    public void settipoderopa(int tipoderopa){
        this.tipoderopa = tipoderopa;
    }
}

