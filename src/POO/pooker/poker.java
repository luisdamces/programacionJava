package POO.pooker;

public class poker {
    public static void main(String[] args) {
        //nombre jugador
        //inicializo dinero

        // inicializar baraja
        //se dan dos cartas a cada jugador (random del numero de cartas)
        //  jugado hace apuesta se van restando
        //3 cartas se muestran por pantalla
        // se vuelve a apostar  se van restando
        // se muestra: sale solo una carta
        // se vuelve a apostar  se van restando
        // se muestra carta final
        // se hace apuesta Final  se van restando


        //CLASES
        //jugador (nombre, puntos, cartaUno, cartaDos)
        //carta (numero, palo)
        //baraja (nombre, listaCartas, mapaJuagadas)

        Jugador uno = new Jugador("Peter",100);
        Baraja baraja = new Baraja("americana");
        System.out.println(baraja);
        for(Carta carta:baraja.getMazo()){
            System.out.println(carta);
        }

    }
}
