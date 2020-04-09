package passe_bem;
import Tipos.Tipos;

public class Passe_Bem {

    public static void main(String[] args) {
        
        String init = "PASSEBEM";
        System.out.println("Welcome to " + init);    
        
        Tipos Camisa = Tipos.CAMISA;
        String Result = Camisa.getDescricao();
        System.out.println(Result); 
        
        Tipos leg = Tipos.CALCA;
        String Resultado = leg.getDescricao();
        System.out.println(Resultado);
    }    
}
