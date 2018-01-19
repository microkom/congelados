package congelados;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Productos[] item = new Productos[10];
        item[0] = new Congelados("pollo", new Fecha(1, 2, 1999), "2", -17);
        item[1] = new Congelados("pavo", new Fecha(1, 2, 2020), "73", -14);
        item[2] = new Congelados("Helado", new Fecha(1, 2, 2020), "44", -2);
        item[3] = new Refrigerados("Salchichon", new Fecha(1, 2, 1988), "2112", "S123");
        item[4] = new Refrigerados("Queso", new Fecha(1, 2, 2000), "1234213", "Q0DKS");
        item[5] = new Refrigerados("Pasta", new Fecha(1, 2, 2020), "1D2222", "P90DESW");
        item[6] = new Refrigerados("Mortadela", new Fecha(1, 2, 2020), "2211D", "M92WAS");
        item[7] = new Frescos("Zanahora", new Fecha(1, 2, 2020), "2FFFD", new Fecha(17, 1, 2018), "Namibia");
        item[8] = new Frescos("Berenjena", new Fecha(1, 2, 2020), "56565", new Fecha(17, 1, 2018), "España");
        item[9] = new Frescos("Lechuga", new Fecha(1, 2, 2020), "GG5", new Fecha(17, 1, 2018), "Italia");

        //Información de productos congelados
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (item[i] instanceof Congelados) {
                System.out.println(item[i].toString());
                contador++;
            }
        }
        System.out.println("\tProductos Congelados: " + contador + "\n");
        
        //Informacion de productos frescos
        contador = 0;
        int contador2 = 0;
        for (int i = 0; i < 10; i++) {
            if (item[i] instanceof Frescos) {
                System.out.println(item[i].toString());
                contador++;
                if (!(((Frescos) item[i]).getPaisOrigen().equalsIgnoreCase("España"))) {
                    contador2++;
                }
            }
        }
        System.out.println("\tProductos Frescos: " + contador + "\n");
        
        //Informacion de productos refrigerados
        contador = 0;
        for (int i = 0; i < 10; i++) {
            if (item[i] instanceof Frescos) {
                System.out.println(item[i].toString());
                contador++;
            }
        }
        System.out.println("\tProductos Refrigerados: " + contador + "\n");
        
        Calendar cal = Calendar.getInstance();
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH) + 1;//hay que agregar 1 porque los meses van de 0 a 11.
        int anyo = cal.get(Calendar.YEAR);

        Fecha hoy = new Fecha(dia, mes, anyo);
        Fecha antigua = null;
        Fecha reciente = null;
        
        Productos itemCaducado = null;
        Productos itemCaducado2 = null;
        contador = 0;
        
        for (int i = 0; i < item.length; i++) {
            //asignar fecha del primer item a variable antigua para comparar despues
            if (i == 0) {
                antigua = item[0].getFechaCad();
                reciente = antigua;
            }
            //comparacion de la primera fecha del vector con las demas para coger la mas antigua
            if (item[i].getFechaCad().menorQue(antigua)) {
                antigua = item[i].getFechaCad();
                itemCaducado = item[i];
            }
            //comparacion de la primera fecha del vector con las demas para coger la mas reciente
            if (item[i].getFechaCad().mayorQue(reciente) && item[i].getFechaCad().menorQue(hoy)) {
                reciente = item[i].getFechaCad();
                itemCaducado2 = item[i];
            }
            //conteo de productos caducados
            if (item[i].getFechaCad().menorQue(hoy)) {
                contador++;
            }

        }
        if (itemCaducado.getFechaCad().menorQue(hoy)) {
            System.out.println("\tEl primer producto caducado es: " + itemCaducado.getNombre() + " que caduca el " + itemCaducado.getFechaCad().corta());
            System.out.println("\tEl último producto caducado es: " + itemCaducado2.getNombre() + " que caduca el " + itemCaducado2.getFechaCad().corta());
            System.out.println("\tEn total hay " + contador + " productos caducados");
        } else {
            System.out.println("\tNo hay productos caducados");
        }
        if (contador2 > 0) {
            System.out.println("\tHay " + contador2 + " productos procedentes fuera de España");
        }

    }

}
