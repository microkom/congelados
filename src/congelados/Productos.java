
package congelados;

import java.util.Calendar;


public class Productos {
    
    private String nombre;
    private Fecha fechaCad;
    private String lote;
    
    public Productos(String nombre, Fecha fechaCadu, String lote){
        this.nombre=nombre;
        this.fechaCad=fechaCadu;
        this.lote=lote;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public Fecha getFechaCad(){
        return this.fechaCad;
    }
    public String getLote(){
        return this.lote;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setFecha(Fecha fecha){
        this.fechaCad=fecha;
    }
    public void setLote(String lote){
        this.lote=lote;
    }
    Calendar cal = Calendar.getInstance();
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH) + 1;//hay que agregar 1 porque los meses van de 0 a 11.
        int anyo = cal.get(Calendar.YEAR);

        Fecha hoy = new Fecha(dia, mes, anyo);
        
    public String toString(){
        String texto="";
        texto+="\tNombre producto: "+this.nombre+"\n"+
                "\tFecha caducidad: ";
        if(fechaCad.menorQue(hoy)){
            texto+="PRODUCTO CADUCADO";
        }else{
            texto+=fechaCad.corta();
                };
        texto+="\n\tLote: "+lote+"\n";
                return texto;
    }
    /*
    Se plantea desarrollar un programa Java que permita la gestión de una
empresa que trabaja con tres tipos de productos alimentarios: productos
frescos, productos refrigerados y productos congelados:
Todos los productos llevan esta información común:
 Nombre de producto: String.
 Fecha de caducidad: Objeto de tipo fecha.
 Número de lote: String.
A su vez, cada tipo de producto lleva alguna información específica.

    
    
    */
}
