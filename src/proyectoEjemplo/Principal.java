package proyectoEjemplo;

import java.util.*;

public class Principal {
    public static String[] listaEquipos = new String[]{"Deportivo Alavés", "Athletic Club", "Atlético de Madrid", "FC Barcelona", "Real Betis", "Celta de Vigo", "Espanyol", "Getafe", "Girona", "Las Palmas", "Leganés", "Real Mallorca", "Osasuna", "Rayo Vallecano", "Real Madrid", "Real Sociedad", "Sevilla", "Valencia", "Valladolid", "Villarreal"};
    private  static String equipoFav="";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 0;
        while(op != 3){
            menu();
            op=sc.nextInt();
            sc.nextLine();
            if(op==1){
                seleccionafav();
            }
            if(op==2){
                sorteo();
            }
        }
        System.out.println("Bye Bye");
    }

    private static void sorteo() {
        List<Integer> listaNumEquipo = new ArrayList<>();
        for (int i = 0; i <= 19; i++) {
            listaNumEquipo.add(i);
        }
        Collections.shuffle(listaNumEquipo);
        for (int i = 0; i < listaEquipos.length; i += 2) {
            // Obtener los índices aleatorios de los equipos
            int index1 = listaNumEquipo.get(i);
            int index2 = listaNumEquipo.get(i + 1);

            // Mostrar el emparejamiento
            System.out.println(listaEquipos[index1] + " - " + listaEquipos[index2]);
        }
    }

    private static void seleccionafav() {
        int posFav=0;
        for(int i = 0; i< listaEquipos.length; i++){
            System.out.println(i+1+". "+ listaEquipos[i]);
        }
        System.out.print("Selecciona el número de tu equipo favorito: ");
        posFav = sc.nextInt();
        sc.nextLine();
        equipoFav = "** "+ listaEquipos[posFav - 1];
        listaEquipos[posFav - 1] = equipoFav;
        System.out.println("Seleccionado Correctamente.");
    }

    private static void menu() {
        System.out.println("1) Escoger Favorito");
        System.out.println("2) Realizar sorteo");
        System.out.println("3) Salir");
    }


}
