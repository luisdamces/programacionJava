package POO.herencia;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        Gato baldomero = new Gato("Baldomero", "Miiauu", 4, "Negro", "Callejero" );

        System.out.println("Nombre: " + baldomero.getName());
        System.out.println("Sonido: " + baldomero.getSound());
        baldomero.comer();
        baldomero.acariciar();
    }
}
