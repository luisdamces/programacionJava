package repaso;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arrays {
    public static int MAX=10;
    public static void main(String[] args) {
        String[] telefonos = new String[5];
        telefonos[0] = "976123456";
        //devuelve el dato guardado en esa posición
        System.out.println(telefonos[0]);
        //uso un bucle para escribir en telefonos
        for (int i = 0; i < telefonos.length; i++) {
            telefonos[i] = "97612345"+i;
        }
        //leer todo el array
        for (int i = 0; i < telefonos.length; i++) {
            System.out.println(telefonos[i]);
        }

        //Array con dimensión determinada
        double[] conjutoDatos = new double [10];
        for(int i =0;i<MAX;i++){
            conjutoDatos[i]=(i+1)/2;
        }
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] nombres = {"manzana", "pera", "uva", "higo", "naranja", "mandarina", "piña", "melocoton", "chirimolla", "kiwi"};
        String uno = nombres[5];
        System.out.println(nombres[nombres.length-1]); //última posicion
        System.out.println(String.join(" ", nombres)); // Array a String

        //ArrayList ya no son de longitud determinada
        ArrayList<String> names = new ArrayList<String>();
        names.add("Luis");
        //meto
        for(int i =0;i<20;i++){
            names.add("luis"+(i+1));
        }
        //saco
        for(int i =0;i<20;i++){
            System.out.println(names.get(i));
        }
        for (String nombreP: names) {
            System.out.println(nombreP);
        }

        //listas
        List<String> milista= new ArrayList<String>();
        milista.add("hola");
        milista.add("que");
        milista.add("tal");
        milista.add("estas");
        milista.add("hola");
        for (String cadena: milista) {
            System.out.println(cadena);
        }
        List<String> milista2= new LinkedList<String>();
        milista2.add("hola");
        milista2.add("que");
        milista2.add("tal");
        milista2.add("estas");
        milista2.add("hola");
        for (String cadena: milista2) {
            System.out.println(cadena);
        }
    }
}
