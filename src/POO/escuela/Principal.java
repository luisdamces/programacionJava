package POO.escuela;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        escuela CES = new escuela("Escuela Nacional Superior Técnica");
        // ejemplo de estudiantes
        estudiante alumno1 = new estudiante(1,"Juan", 20);
        estudiante alumno2 = new estudiante(2,"Maria", 19);
        Scanner sc = new Scanner(System.in);
        menu();
        int op = sc.nextInt();
        sc.nextLine();
        while (op!=5){
            if(op==1){
                int idm = CES.getEstudiantes().size()+1;
                System.out.println("Dame nombre: ");
                String nombre = sc.nextLine();
                System.out.println("Dame edad: ");
                int edad = sc.nextInt();
                sc.nextLine();
                estudiante nuevo = new estudiante(idm,nombre,edad);
                CES.agregarEstudiante(nuevo);
            }
            if(op==2){
                System.out.println("Dame id de matricula:");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Dame nombre: ");
                String nombre = sc.nextLine();
                System.out.println("Dame edad: ");
                int edad = sc.nextInt();
                sc.nextLine();
                CES.modificarEstudiante(id,nombre, edad);
            }
            if(op==3){
                System.out.println("Dame id de matricula:");
                int id = sc.nextInt();
                sc.nextLine();
                CES.eliminarEstudiante(id);
            }
            if(op==4){
                CES.imprimirEstudiantes();
            }
            menu();
            op = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Gracias");
    }
    public static void menu(){
        System.out.println("1. Añadir alumno");
        System.out.println("2. Modificar alumno");
        System.out.println("3. Eliminar alumno");
        System.out.println("4. Imprimir alumnos");
        System.out.println("5. Salir");
    }
}
