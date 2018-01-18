package congelados;

public class Congelados extends Productos {

    private double tempCongRec;

    public Congelados(String nombre, Fecha fechaCadu, String lote, double tempCongRec) {
        super(nombre, fechaCadu, lote);
        this.tempCongRec = tempCongRec;
    }

    public Congelados(String nombre, Fecha fechaCadu, String lote) {
        super(nombre, fechaCadu, lote);
        this.tempCongRec = 0;
    }

    public double getTempCongRec() {
        return this.tempCongRec;
    }

    public void setTempCongRec(double temp) {
        this.tempCongRec = temp;
    }

    public String toString() {
        String texto = super.toString();
        texto += "\tTemperatura congelacion recomendada: " + this.tempCongRec + "\n";
        return texto;
    }
    /*
    Los productos congelados deben llevar:
 Temperatura de congelación recomendada: Número decimal
     */
}
