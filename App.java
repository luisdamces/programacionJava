import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) throws Exception {
        //DECLARACION E INICIALIZACIÓN DE VARIABLES
        int op = 0;
        String sop = "";
        // IMPRIMO MENU Y ME GUARDO OPCION DEL USUARIO EN UNA VARIABLE
        op = menu();
        // SI PULSA SALIR, ANTES DE NADA PUES MENSAJE Y SE ACABO
        if (op==5){
            System.out.println("Gracias por usar la calculadora!");
        }
        //SI NO ES SALIR, MANDO A FUNCION OPERACIONES PARA QUE HAGA LA OPCIÓN QUE PIDAN 
        else{
            operacion(op);
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
    public static void operacion(int op){
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
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
        sc.close();
    }
}
