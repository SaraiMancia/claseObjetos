
package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        FacturaElectrica fe=new FacturaElectrica();
        
        System.out.println("No Cuenta: ");
        fe.setNcuenta(leer.nextInt());
        System.out.println("Ingrese lectura actual: ");
        fe.setLecturaA(leer.nextDouble());
        System.out.println("Ingrese lectura anterior: ");
        fe.setLecturaM(leer.nextDouble());
        System.out.println("Ingrese multiplicador: ");
        fe.setMult(leer.nextDouble());
        
        System.out.println("--------------------------------");
        System.out.println("Lectura Anterior: ");
        System.out.println(fe.getLecturaA());
        System.out.println("Lectura Actual: ");
        System.out.println(fe.getLecturaM());
        System.out.println("Multiplicador: ");
        System.out.println(fe.getMult());
        System.out.println("Consumo mensual:");
        System.out.println(fe.consumoM());
        System.out.println("Consumo diario: ");
        System.out.println("Valor factura: ");
        System.out.println(fe.valorf(fe));
    }
}
