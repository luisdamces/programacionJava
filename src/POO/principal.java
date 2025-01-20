package POO;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] potenciaPika={50,40,80,15};
        String[] ataquePika={"ImpactTrueno","Rayo","Trueno","Curacion"};
        pokemon pikachu=new pokemon("Pikachu","Electrico",100, potenciaPika, ataquePika,"amarillo");

        int[] potenciaSquirtle={45,30,70,25};
        String[] ataqueSquirtle={"PistolaAgua","Acuajet","Acuacola","Curacion"};
        pokemon Squirtle=new pokemon("Squirtle","Agua",100, potenciaSquirtle, ataqueSquirtle,"azul");

        System.out.println(pikachu.getNombre()+" VS "+Squirtle.getNombre());

        if(pikachu.getPotecnia()[0]<Squirtle.getPotecnia()[0]){
            pikachu.setVida(pikachu.getVida()-(Squirtle.getPotecnia()[0]-pikachu.getPotecnia()[0]));
        }else {
            Squirtle.setVida(Squirtle.getVida()-(pikachu.getPotecnia()[0]-Squirtle.getPotecnia()[0]));
        }
        System.out.println(Squirtle.getNombre()+":"+Squirtle.getVida());
        System.out.println(pikachu.getNombre()+":"+pikachu.getVida());
    }
}
