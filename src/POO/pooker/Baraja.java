package POO.pooker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Baraja {
    private String nombre;
    private LinkedList<Carta> mazo = new LinkedList<Carta>();
    private List<Integer> cartasUsadas = new ArrayList<>();
    private int numCartas = 52;
    private String[] palos = {"C","P","D","T"};
    private String[] numeros = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};

    public Baraja(String nombre) {
        this.nombre = nombre;
        for (int i = 0; i < numCartas ; i++) {
            this.cartasUsadas.add(0);
        }
        for(String palo:this.palos){
            for(String numero:this.numeros){
                Carta carta = new Carta(palo,numero);
                this.mazo.add(carta);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carta sacaCarta(){
        int ncartaAleatoria = (int)Math.floor(Math.random()*mazo.size());
        while (cartasUsadas.get(ncartaAleatoria).equals(1)){
            ncartaAleatoria = (int)Math.floor(Math.random()*mazo.size());
        }
        cartasUsadas.set(ncartaAleatoria, 1);
        return mazo.get(ncartaAleatoria);
    }

    public List<Carta> getMazo() {
        return mazo;
    }

    @Override
    public String toString() {
        return "Baraja{" +
                "nombre='" + nombre + '\'' +
                ", mazo=" + mazo +
                ", cartasUsadas=" + cartasUsadas +
                ", numCartas=" + numCartas +
                ", palos=" + Arrays.toString(palos) +
                ", numeros=" + Arrays.toString(numeros) +
                '}';
    }
}
