
package Clase.y.objetos;

import java.util.Scanner;


public class transaccionesBancarias {
        public static void main(String[] args) {
           
        cuentaBancaria cuenta=new cuentaBancaria();
        Scanner leer=new Scanner(System.in);
                
                String duiCliente, nombreCliente;
                long telefonoCliente;
                double abono,retiro;
         
            System.out.println("Ingresar los datos que se solicitan a continiacion.");
            System.out.println("Nombre del propietario: ");
            nombreCliente=leer.nextLine();
            
            System.out.println("Numero de DUI:");
            duiCliente=leer.nextLine();
            
            System.out.println("Telefono:");
            telefonoCliente=leer.nextLong();
            
               Cliente propietario=new Cliente(duiCliente,nombreCliente,telefonoCliente);
            cuenta.propietarioCuenta=propietario;
            
        System.out.println("Ingresar la cantidad a abonar:");
        cuenta.abonar(abono=leer.nextDouble());
        
        System.out.println("Ingresar cantidad a retirar:");
        cuenta.retirar(retiro=leer.nextDouble());
        
            System.out.println("----------------------------");
        System.out.println("Su saldo de la cuenta es:"+cuenta.saldoCuenta);
            System.out.println("Datos del propietario: \n"+cuenta.datosPropietarioCuenta());
        
        }   
        
}
