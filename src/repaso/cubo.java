package repaso;

public class cubo {
    public static int H=10;
    public static void main(String[] args) {
        //Linea Arriba y Base
        pintaBaseArriba();
        //Bucle que hace el alto
        for (int i = 0; i < H; i++) {
            pintaLineaMedio();
        }
        pintaBaseArriba();
    }
    public static void pintaLineaMedio(){
        System.out.print("|");
        for (int i = 0; i < H*3; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
    public static void pintaBaseArriba(){
        System.out.print("+");
        for (int i = 0; i < H*3; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
