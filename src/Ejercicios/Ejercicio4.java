
package Ejercicios;
import java.util.Scanner;
public class Ejercicio4 {
    int bandera;
    
    public static void main(String[] args) {
        Empleado e=new Empleado();
        Scanner leer=new Scanner(System.in);
        Ejercicio4 b=new Ejercicio4();
        b.bandera();
        
        
        System.out.println("nombre empleado: ");
        e.setNombres(leer.nextLine());
        System.out.println("Apellido empleado: ");
        e.setApellidos(leer.nextLine());
        System.out.println("Direccion empleado: ");
        e.setDireccion(leer.nextLine());
        System.out.println("Numero de NIT: ");
        e.setNoNit(leer.nextInt());
        System.out.println("Ingrese 1 si es activo, 2 si es inactivo");
        b.bandera=leer.nextInt();
        System.out.println("Ingrese su salario devengado: ");
        e.setSalarioD(leer.nextDouble());
        
        System.out.println("----------------------------------");
        System.out.println("Nombre completo empleado:"+e.getNombres()+e.getApellidos());
        System.out.println("Direccion: "+e.getDireccion());
        System.out.println("NIT: "+e.getNoNit());
        System.out.println(b.bandera());
        System.out.println("Su salario con descuento es: "+e.calcularS(0));
        System.out.println("");
        
    }
   
            
            public int bandera(){
        if (bandera==1){
            System.out.println("Empleado Activo");
        }else if(bandera==2){
            System.out.println("Empleado Inactivo");
        }
        return bandera;
      }

    
}
