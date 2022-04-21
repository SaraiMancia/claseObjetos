
package Ejercicios;

import java.util.Scanner;

public class FormatoFecha {
 String fecha;

    public FormatoFecha() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    public String formato(String fecha) { //
        String fechaG ="";
        fechaG += fecha.substring(0, 2) + "-";
        fechaG += fecha.substring(2, 4) + "-";
        fechaG += fecha.substring(4, 8);
        
        return fechaG;
    }
    public String formato(int fecha) {
        String fecha1 = String.valueOf(fecha);
        String fechaP ="";
        fechaP += fecha1.substring(0, 2) + "/";
        fechaP+= fecha1.substring(2, 4) + "/";
        fechaP+= fecha1.substring(4, 8);
        
        
        return fechaP;
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
         FormatoFecha  formatoF = new FormatoFecha();
         
        System.out.println("Introduzca la fecha");
        String fecha = leer.nextLine();
        formatoF.setFecha(fecha);
        
        System.out.println("Formato de fecha con guiones: " +formatoF.formato(fecha));
        System.out.println("Formato de fecha con plecas: " +formatoF.formato(Integer.parseInt(fecha)));
    }
    
}

