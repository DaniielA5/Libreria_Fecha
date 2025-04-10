
package aplicaciondelibreria;

import java.time.LocalDate;

public class Persona {
   private String Nombre;
   private String ApPaterno;
   private String ApMaterno;
   private char Sexo;
   private String FNacimineto;

    public  Persona(String Nombre, String ApPaterno, String ApMaterno, char Sexo, String FNacimineto) {
        this.Nombre = Nombre;
        this.ApPaterno = ApPaterno;
        this.ApMaterno = ApMaterno;
        this.Sexo = Sexo;
        this.FNacimineto = FNacimineto;
    }
   
    
    public String getNombre() {
        return Nombre;
    }

    public String getApPaterno() {
        return ApPaterno;
    }

    public String getApMaterno() {
        return ApMaterno;
    }

    public char getSexo() {
        return Sexo;
    }

    public String getFNacimineto() {
        return FNacimineto;
    }
   
}
