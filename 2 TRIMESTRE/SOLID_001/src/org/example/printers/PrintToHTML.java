package org.example.printers;

import org.example.herencia.Reporte;

public class PrintToHTML extends Reporte {

    // Atributo propio de la clase
    protected String cadenaEnHTML;

    // Constructor que inicializa la cadena
    public PrintToHTML(String cadena) {
        super(cadena);
        this.cadenaEnHTML = "<html>" + cadena + "</html>"; // Conversión a formato HTML
    }

    // Sobreescribe el método de Reporte
    @Override
    public String imprimirCadena() {
        return cadenaEnHTML;
    }

    // Getters y Setters
    public String getCadenaEnHTML() {
        return cadenaEnHTML;
    }

    public void setCadenaEnHTML(String cadenaEnHTML) {
        this.cadenaEnHTML = cadenaEnHTML;
    }

    // Representación en String del objeto
    @Override
    public String toString() {
        return "PrintToHTML{" +
                "cadenaEnHTML='" + cadenaEnHTML + '\'' +
                '}';
    }
}
