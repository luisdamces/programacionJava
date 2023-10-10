import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //DECLARACION E INICIALIZACIÓN DE VARIABLES
        int op = 0;
        String sop = "";
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        
        op = menu();

        System.out.println("Dame valor a: ");
        a = sc.nextInt();
        System.out.println("Dame valor b: ");
        b = sc.nextInt();
        

        //FUNCIONAMIENTO
        if(op == 1){
            System.out.println("1) SUMAR");
            System.out.println(a+b);
        }
        if(op == 2){
            System.out.println("2) RESTA");
            System.out.println(a-b);
        }
        if(op == 3){
            System.out.println("3) DIVIDE");
            System.out.println(a/b);
        }
        if(op == 4){
            System.out.println("4) MULTIPLICA");
            System.out.println(a*b);
        }
        else{
            System.out.println("Gracias por usar la calculadora!");
        }
    }
    public static int menu(){
        int op = 0;
        Scanner sc = new Scanner(System.in);
        // PANTALLA MENU 
        System.out.println("1) SUMAR");
        System.out.println("2) RESTAR");
        System.out.println("3) DIVIDIR");
        System.out.println("4) MULTIPLICAR");
        System.out.println("5) SALIR");
        System.out.println("¿Que operación quieres realizar[1,2,3,4o5]?: ");
        op = sc.nextInt();
        return op;
    }
}
