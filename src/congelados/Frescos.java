package congelados;

public class Frescos extends Productos {

    private Fecha fechaEnv;
    private String paisOrigen;

    public Frescos(String nombre, Fecha fechaCadu, String lote, Fecha fechaEnv, String paisOrigen) {
        super(nombre, fechaCadu, lote);
        this.fechaEnv = fechaEnv;
        this.paisOrigen = paisOrigen;
    }

    public Fecha getFechaEnv() {
        return this.fechaEnv;
    }

    public String getPaisOrigen() {
        return this.paisOrigen;
    }

    public void setFechaEnv(Fecha fecha) {
        this.fechaEnv = fecha;
    }

    public void setPaisOrigen(String pais) {
        this.paisOrigen = pais;
    }

    public String toString() {
        String texto = super.toString();
        texto += "\tFecha Envasado: " + this.fechaEnv.corta() + "\n"
                + "\tPais origen: " + this.paisOrigen + "\n";
        return texto;
    }
    /*
    Los productos frescos deben llevar:
 Fecha de envasado: Objeto de tipo fecha
 País de origen: String
     */
}
