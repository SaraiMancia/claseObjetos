
package Ejercicios;

public class FacturaElectrica {
    int ncuenta;
    double lecturaA,lecturaM,mult,consumoM,consumoD,valorF;

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

    public double getLecturaM() {
        return lecturaM;
    }

    public void setLecturaM(double lecturaM) {
        this.lecturaM = lecturaM;
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
        double consumom;
        
        consumom=lecturaA-lecturaM*mult;
        return consumom;
    }
    public double consumoD(){
        return consumoD;
    }
    public double valorf(FacturaElectrica dato){
        double vf;
        double c;
        c=dato.consumoM();
        
        vf=c*0.20;
        return vf;
    }
}
