package ejercicio3;
import java.util.Scanner;

public class MusicaCDs {

    public static String titulo="";
    public static String[] cds = new String[50];
    public static int indice = 0;

    public static void main(String[] args) {
        //bloque de variables que necesita mi programa
        int op=0;
        Scanner sc = new Scanner(System.in);

        while(op!=3){
            menu();
            System.out.print("Seleccione un numero de operación: ");
            op=sc.nextInt();
            sc.nextLine();
            if(op==1){
                insertarCD();
            }
            if(op==2){
                colsultarCDs();
            }
        }
        System.out.println("Gracias por usar Music CDs");
    }

    private static void colsultarCDs() {
        System.out.println(" ------------------------- ");
        System.out.println("| Esta es tu lista de CDs: |");
        System.out.println(" ------------------------- ");
        for (int i = 0; i < cds.length; i++) {
            if(cds[i]!=null) {
                System.out.println(cds[i]);
            }
        }
    }

    private static void insertarCD() {
        System.out.print("Escribe el nuevo título del CD: ");
        Scanner sc = new Scanner(System.in);
        titulo = sc.nextLine();
        cds[indice]=titulo;
        indice++;
    }

    public static void menu(){
        System.out.println("1) Inserta CD");
        System.out.println("2) Consulatr CDs");
        System.out.println("3) Salir");

    }
}
