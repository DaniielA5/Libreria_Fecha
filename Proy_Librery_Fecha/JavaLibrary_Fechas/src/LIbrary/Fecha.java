package LIbrary;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.Period;
/*Libreria orientada a fechas con la cual se podra obtener acceso a metodos como pasar de un formato String 
a un dato tipo Date y viseversa, diferencia de dias entre una fecha y otra, si una fecha es anterior a otra, 
obtener dias de loa semana, edad, tiempo vivido, etc
*/
public final class Fecha {
    private static final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static LocalDate StringaDate (String fecha){
        return LocalDate.parse(fecha, formato);
    }
    public static String LocalaString (LocalDate fecha){
        return fecha.format(formato);
    }
    public static long diferenciaDias(String fecha1, String fecha2){
        LocalDate inicio = StringaDate(fecha1);
        LocalDate fin = StringaDate(fecha2);
        return ChronoUnit.DAYS.between(inicio, fin);
    }
    public static boolean esAnterior(String fecha1, String fecha2){
        LocalDate f_uno = StringaDate(fecha1);
        LocalDate f_dos = StringaDate(fecha2);
        return f_uno.isBefore(f_dos);
    }
    public static String obtenerDiaSemana(String fecha){
        LocalDate inicio = StringaDate(fecha);
        return inicio.getDayOfWeek().toString();
    }
    public static int Edad(String fNacimiento){
        LocalDate fecha = StringaDate(fNacimiento);
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fecha, fechaActual).getYears();
    }
    public static String tiempoVivido(String fNacimiento){
        LocalDate fecha = StringaDate(fNacimiento);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fecha, fechaActual);
        return String.format("%d años, %d meses y %d dias", periodo.getYears(), periodo.getMonths(), 
                periodo.getDays());
    }
    
}
