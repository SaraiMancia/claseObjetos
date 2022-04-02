
package Ejercicios;

import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
         Estudiante e=new Estudiante();
         
         String nombre = null, carnet = null,codigo = null;
   
        for (int i=1; i<=5;i++){
         
         System.out.println("Ingrese nombre estudiante: "+i);
         e.setNombre(leer.nextLine());
         System.out.println("Ingrese numero de carnet: ");
         e.setCarnet(leer.nextLine());
         System.out.println("Ingrese el codigo de su carrera: ");
         e.setCodigo(leer.nextLine());
         
        
        }
        
          Hashtable<String,String> h= new Hashtable<String,String>();
        h.put("nombre:",nombre);
        h.put("Carnet: ", carnet);
        h.put("codigo:", codigo);
        System.out.println(h);
         h.put("nombre:",nombre);
        h.put("Carnet: ", carnet);
        h.put("codigo:", codigo);
        System.out.println(h);
         h.put("nombre:",nombre);
        h.put("Carnet: ", carnet);
        h.put("codigo:", codigo);
        System.out.println(h);
         h.put("nombre:",nombre);
        h.put("Carnet: ", carnet);
        h.put("codigo:", codigo);
        System.out.println(h);
         h.put("nombre:",nombre);
        h.put("Carnet: ", carnet);
        h.put("codigo:", codigo);
        System.out.println(h);
        
       
      
    }

}
