
package Ejercicios;

import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
         Estudiante e=new Estudiante();
             Hashtable<String,String> h= new Hashtable<String,String>();
         String nombre = null, carnet = null,codigo = null;
   
        for (int i=1; i<=5;i++){
         
         System.out.println("Ingrese nombre estudiante: "+i);
         e.setNombre(leer.nextLine());
         System.out.println("Ingrese numero de carnet: ");
         e.setCarnet(leer.nextLine());
         System.out.println("Ingrese el codigo de su carrera: ");
         e.setCodigo(leer.nextLine());
         
        
        }
               
         for (int i= 1; i<=5; i++) {

        
        System.out.println("El nombre del estudiante es: "+e.getNombre());
        System.out.println("El cogigo de la carrera de el estudiante es: " +e.getCodigo());
        System.out.println("El carnet del estudiante es: " +e.getCarnet());
        Estudiante.put("a" +i,String.valueOf(h));
        
    }
      
    }

}
