
package Ejercicios;

import java.util.Hashtable;

public class Estudiante {
    String nombre, carnet,codigo;

    public Estudiante() {
    }

    public Estudiante(String nombre, String carnet, String codigo) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.codigo = codigo;
     
            Hashtable<String,String> h= new Hashtable<String,String>();
        h.put("nombre:",nombre);
        h.put("Carnet: ", carnet);
        h.put("codigo:", codigo);
        System.out.println(h);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
         
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
        
    }
}

    

