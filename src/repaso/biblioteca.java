package repaso;

import java.util.Scanner;

public class biblioteca {
    public static String[] titulosLibros = {"Cien años de soledad", "Don Quijote de la Mancha", "Orgullo y prejuicio", "El gran Gatsby", "1984", "El principito", "Crónica de una muerte anunciada", "El amor en los tiempos del cólera", "La casa de los espíritus", "Fahrenheit 451", "En busca del tiempo perdido", "El túnel", "Rayuela", "Moby Dick", "Los miserables", "Cumbres borrascosas", "El retrato de Dorian Gray", "La sombra del viento", "Harry Potter y la piedra filosofal", "El Alquimista"};
    public static String[] estadoLibros = {"no prestado", "no prestado", "no prestado", "no prestado", "no prestado", "no prestado", "no prestado", "no prestado", "no prestado", "no prestado", "no prestado", "no prestado", "no prestado", "no prestado", "no prestado", "no prestado", "no prestado", "no prestado", "no prestado", "no prestado"};
    public static void main(String[] args) {
        //Declaración de variables
        int op = 0;
        Scanner sc = new Scanner(System.in);
        // Empieza el código de la función
        while (op!=4){
            imprimemenu();
            System.out.print("Elija una opción: ");
            op= sc.nextInt();
            sc.nextLine();
            // Condiciones de las opciones de menu
            if (op==1){
                Listalibros();
            }
            if (op==2){
                System.out.print("¿Que número de libro quieres? ");
                int numlib = sc.nextInt();
                sc.nextLine();
                Prestalibros(numlib);
            }
            if (op==3){
                System.out.print("¿Que número de libro quieres devolver? ");
                int numlib = sc.nextInt();
                sc.nextLine();
                Devuelvelibro(numlib);
            }
        }
        System.out.println("Gracias por usar.");
    }
    private static void Devuelvelibro(int numlib) {
        estadoLibros[numlib]="no prestado";
        System.out.println(titulosLibros[numlib]+" devuelto correctamente.");
    }
    private static void Prestalibros(int numlib) {
        if(numlib < titulosLibros.length && numlib >= 0) {
            // numLib es la posición de la lista del libro
            if (estadoLibros[numlib] == "prestado") {
                System.out.println("Este libro ya esta prestado.");
            } else {
                estadoLibros[numlib] = "prestado";
                System.out.println(titulosLibros[numlib] + " prestado correctamente.");
            }
        }
        else {
            System.out.println("Dame valores comprendidos entre el 0 y "+titulosLibros.length);
        }
    }
    private static void Listalibros() {
        for (int i = 0;i<titulosLibros.length;i++){
            System.out.print(i + " " +titulosLibros[i]+" - "+estadoLibros[i]);
        }
    }
    public static void imprimemenu() {
        System.out.println();
        System.out.println("+----------------------+");
        System.out.println("|  1. Lista libros.    |");
        System.out.println("|  2. Presta libro.    |");
        System.out.println("|  3. Devuelve libro.  |");
        System.out.println("|  4. Salir.           |");
        System.out.println("+----------------------+");
    }
}