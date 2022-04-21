
package Ejercicios;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        NumberFormat formato=new DecimalFormat("#0.00");
        FacturaElectrica fe=new FacturaElectrica();
        
        System.out.println("Ingrese No Cuenta: ");
        fe.setNcuenta(leer.nextInt());
 
        
        System.out.println("--------------------------------");
        System.out.println("Lectura Anterior: ");
        System.out.println(fe.getLecturaAA());
        System.out.println("Lectura Actual: ");
        System.out.println(fe.getLecturaA());
        System.out.println("Multiplicador: ");
        System.out.println(fe.getMult());
        System.out.println("Consumo mensual:");
        System.out.println(fe.consumoM()+("kwh"));
        System.out.println("Consumo diario: ");
        System.out.println(fe.consumoD()+("kwh"));
        System.out.println("Valor factura: ");
        System.out.println(formato.format(fe.valorF()));
    }
}
