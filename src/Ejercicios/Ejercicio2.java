
package Ejercicios;
 import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        NumberFormat formato=new DecimalFormat("#0.00");
        calculoIva cv=new calculoIva();
        
        System.out.println("Ingrese el precio del articulo: ");
        cv.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el IVA del producto: ");
        cv.setPorIva(leer.nextDouble());
        System.out.println("Ingrese el segundo articulo con IVA: ");
        cv.setPrecio2(leer.nextDouble());
        System.out.println("Ingrese el porcentaje del IVA: ");
        cv.setPorIva2(leer.nextDouble());
        
        System.out.println("--------------------------------");
        System.out.println("El articulo con IVA es: $"+cv.calIva(cv));
            System.out.println("El segundo articulo sin IVA es: "+formato.format(cv.sinIva(cv)));
    }
}
