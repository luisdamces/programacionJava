package POO;

import java.util.Arrays;

public class pokemon {
    private String nombre;
    private String tipo;
    private int vida;
    private int[] potecnia = new int[4];
    private String[] ataque = new String[4];
    private String color;

    public void pokemon(){}

    public pokemon(String nombre, String tipo, int vida, int[] potecnia, String[] ataque, String color) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.potecnia = potecnia;
        this.ataque = ataque;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int[] getPotecnia() {
        return potecnia;
    }

    public void setPotecnia(int[] potecnia) {
        this.potecnia = potecnia;
    }

    public String[] getAtaque() {
        return ataque;
    }

    public void setAtaque(String[] ataque) {
        this.ataque = ataque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", vida=" + vida +
                ", potecnia=" + Arrays.toString(potecnia) +
                ", ataque=" + Arrays.toString(ataque) +
                ", color='" + color + '\'' +
                '}';
    }
}
