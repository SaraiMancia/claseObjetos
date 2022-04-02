
package Ejercicios;


public class Empleado {
    int NoNit,bandera;
    String Apellidos,Nombres,Direccion;
    double  salarioD;
    int banderaE;

    public int getNoNit() {
        return NoNit;
    }

    public void setNoNit(int NoNit) {
        this.NoNit = NoNit;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public double getSalarioD() {
        return salarioD;
    }

    public void setSalarioD(double salarioD) {
        this.salarioD = salarioD;
    }

    public int getBanderaE(){
        return banderaE;
    }

    public int setBanderaE(int banderaE) {
        this.banderaE = banderaE;
        return bandera;
    }
    
      public int bandera(){
        if (bandera==1){
            System.out.println("Empleado Activo");
        }else if(bandera==2){
            System.out.println("Empleado Inactivo");
        }
        return bandera;
      }
    
        
    public double calcularS(double salarioD){
        double renta=10;
        double r;
        
        renta=(this.salarioD*renta/100);
        r=(this.salarioD-renta);
        return r;
        
    }
    
}
        
