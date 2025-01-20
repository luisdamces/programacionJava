package POO.pooker;

import java.util.LinkedList;
import java.util.List;

public class Jugador {
    private String nombre;
    private int dinero;
    private LinkedList<Carta> mano;

    public Jugador(String nombre, int dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public LinkedList<Carta> getMano() {
        return mano;
    }

    public void setMano(LinkedList<Carta> mano) {
        this.mano = mano;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", dinero=" + dinero +
                ", mano=" + mano +
                '}';
    }
}
