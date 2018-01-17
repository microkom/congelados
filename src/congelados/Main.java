
package congelados;

public class Main {

    public static void main(String[] args) {
        Productos[] item = new Productos[10];
        item[0] = new Congelados("pollo",new Fecha(1,2,2020),"2",-17);
        item[1] = new Congelados("pavo",new Fecha(1,2,2020),"73",-14);
        item[2] = new Congelados("Helado",new Fecha(1,2,2020),"44",-2);
        item[3] = new Refrigerados("Salchichon",new Fecha(1,2,2020),"2112","S123");
        item[4] = new Refrigerados("Queso",new Fecha(1,2,2020),"1234213","Q0DKS");
        item[5] = new Refrigerados("Pasta",new Fecha(1,2,2020),"1D2222","P90DESW");
        item[6] = new Refrigerados("Mortadela",new Fecha(1,2,2020),"2211D","M92WAS");
        item[7] = new Frescos("Zanahora",new Fecha(1,2,2020),"2FFFD",new Fecha(17,1,2018),"Namibia");
        item[8] = new Frescos("Berenjena",new Fecha(1,2,2020),"56565",new Fecha(17,1,2018),"Francia");
        item[9] = new Frescos("Lechuga",new Fecha(1,2,2020),"GG5",new Fecha(17,1,2018),"Italia");
    
        //Información de productos congelados
        int contador=0;
        for (int i = 0; i < item.length; i++) {
            if(item[i] instanceof Congelados){
               contador++;
            }
        }
        System.out.println("\tProductos Congelados: " + contador+"\n");
        for (int i = 0; i < 10; i++) {
            if(item[i] instanceof Congelados){
                System.out.println(item[i].toString());
            }
        }
        
        //Informacion de productos frescos
        contador=0;
        for (int i = 0; i < item.length; i++) {
            if(item[i] instanceof Frescos){
               contador++;
            }
        }
        System.out.println("\tProductos Frescos: " + contador+"\n");
        for (int i = 0; i < 10; i++) {
            if(item[i] instanceof Frescos){
                System.out.println(item[i].toString());
            }
        }
        //Informacion de productos refrigerados
        contador=0;
        for (int i = 0; i < item.length; i++) {
            if(item[i] instanceof Refrigerados){
               contador++;
            }
        }
        System.out.println("\tProductos Refrigerados: " + contador+"\n");
        for (int i = 0; i < 10; i++) {
            if(item[i] instanceof Refrigerados){
                System.out.println(item[i].toString());
            }
        }
        
    
    }
    
}
