package repaso;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class fechas {
    public static void main(String[] args) {

        Locale locale = new Locale("es", "ES");
        // La fecha de hoy
        LocalDate fechaHoy = LocalDate.now();
        System.out.println(fechaHoy);

        // Una fecha concreta
        LocalDate fecha = LocalDate.of(2018, Month.NOVEMBER, 26);
        System.out.println(fecha);      // 2018-11-26

        DayOfWeek dia = fecha.getDayOfWeek();
        Month mes = fecha.getMonth();
        System.out.println("Dia: "+dia+" Mes: "+mes);
        int diaDelMes = fecha.getDayOfMonth();
        int numeroMes = fecha.getMonthValue();
        int numeroAno = fecha.getYear();
        System.out.println(diaDelMes+"-"+numeroMes+"-"+numeroAno);


        LocalTime ahora = LocalTime.now();

        int hora = ahora.getHour();
        int minutos = ahora.getMinute();
        int segundos = ahora.getSecond();
        int restante=0;
        if(hora==14){
            restante=30-minutos;
            System.out.println("Te quedan "+restante+" minutos para salir.");
        }
        else {
            System.out.println("Pues no te queda !!! puff");
        }

        // Podemos almacenar un día de la semana
        DayOfWeek diaSemana = fechaHoy.getDayOfWeek();
        Month mesCadena = fechaHoy.getMonth();
        System.out.println(mesCadena.getDisplayName(TextStyle.FULL, locale));

        // El día siguiente
        diaSemana = diaSemana.plus(2);
        System.out.println("mañana será "+diaSemana);
        // Hace dos días
        diaSemana = diaSemana.minus(2);

        System.out.println("Este año "+fechaHoy.getYear() +" es bisiesto?: " + fechaHoy.isLeapYear());

        int meses[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int mesesb[] = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        LocalDate fechaIni = LocalDate.of(2017, Month.SEPTEMBER, 26);
        LocalDate fechaFin = LocalDate.of(2024, Month.JUNE, 17);
    }
}
