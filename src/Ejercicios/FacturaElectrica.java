
package Ejercicios;

public class FacturaElectrica {
    int ncuenta;
    double lecturaA=9128.00,lecturaAA=8984.00,mult=1.000,consumoM,consumoD,valorF;

    public int getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(int ncuenta) {
        this.ncuenta = ncuenta;
    }

    public double getLecturaA() {
        return lecturaA;
    }

    public void setLecturaA(double lecturaA) {
        this.lecturaA = lecturaA;
    }

    public double getLecturaAA() {
        return lecturaAA;
    }

    public void setLecturaAA(double lecturaAA) {
        this.lecturaAA = lecturaAA;
    }

    public double getMult() {
        return mult;
    }

    public void setMult(double mult) {
        this.mult = mult;
    }

    public double getConsumoM() {
        return consumoM;
    }

    public void setConsumoM(double consumoM) {
        this.consumoM = consumoM;
    }

    public double getConsumoD() {
        return consumoD;
    }

    public void setConsumoD(double consumoD) {
        this.consumoD = consumoD;
    }

    public double getValorF() {
        return valorF;
    }

    public void setValorF(double valorF) {
        this.valorF = valorF;
    }
  
      
    public double consumoM(){
        double Consumo;
        double R;
        Consumo=(this.lecturaA - this.lecturaAA);
        R=(Consumo * this.mult);
        
        return R;
        
    }
    
    public double consumoD(){
        double ConsumoD;
        ConsumoD=(this.consumoM() / 30);
        
        return ConsumoD;
        
    }
    
    public double valorF(){
        double valor;
        valor=(this.consumoM() * 0.20);
        
        return valor;
    }
    
}
