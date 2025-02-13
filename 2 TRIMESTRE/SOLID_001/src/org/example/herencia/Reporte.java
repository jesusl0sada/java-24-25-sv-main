package org.example.herencia;

public class Reporte {
    // Atributo protegido para que las subclases puedan acceder
    protected String cadenaATransformar;

    // Constructor
    public Reporte(String cadena){
        this.cadenaATransformar = cadena;
    }

    // Método no estático para permitir acceso a variables de instancia
    public String imprimirCadena(){
        return cadenaATransformar;
    }

    // Getter y Setter
    public String getCadenaATransformar() {
        return cadenaATransformar;
    }

    public void setCadenaATransformar(String cadenaATransformar) {
        this.cadenaATransformar = cadenaATransformar;
    }

    // toString para representar el objeto como String
    @Override
    public String toString() {
        return "Reporte{" +
                "cadenaATransformar='" + cadenaATransformar + '\'' +
                '}';
    }

    // ABSTRACT -> ES LA SUMA DE INTERFACES PORQUE TE OBLIGA Y TE MANDA A METER ESE MÉTODO, LO DEFINES Y CREAS SIEMPRE DESDE EL PADRE
    // Y SON LOS HIJOS LOS QUE LO USAN -> ESTÁS OBLIGADO A INTRODUCIRLO EN CADA HIJO.
    // ADEMÁS ES BLOQUEADOR, TE DA PAUTAS.

    public abstract void imprimirCadena(){

    }

}
