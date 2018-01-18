package congelados;

public class Refrigerados extends Productos {

    private String codigoOrg;

    public Refrigerados(String nombre, Fecha fechaCadu, String lote, String codigoOrg) {
        super(nombre, fechaCadu, lote);
        this.codigoOrg = codigoOrg;
    }

    public String getCodigoOrg() {
        return this.codigoOrg;
    }

    public void setCodigoOrg(String codigo) {
        this.codigoOrg = codigo;
    }

    public String toString() {
        String texto = super.toString();
        texto += "\tCódigo Organismo supervisor: " + this.codigoOrg + "\n";
        return texto;
    }
    /*
    Los productos refrigerados deben llevar:
 Código del organismo de supervisión alimentaria: String.

     */
}
