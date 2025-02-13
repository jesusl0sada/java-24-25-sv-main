package org.example.printers;

import org.example.herencia.Reporte;

public class PrintToJSON extends Reporte {

    // Atributo propio de la clase
    private String cadenaEnJson;

    // Constructor que inicializa la cadena
    public PrintToJSON(String cadena) {
        super(cadena);
        this.cadenaEnJson = "{ \"mensaje\": \"" + cadena + "\" }"; // Conversión a JSON
    }

    // Sobreescribe el método de Reporte
    @Override
    public String imprimirCadena() {
        return cadenaEnJson;
    }

    // Getters y Setters
    public String getCadenaEnJson() {
        return cadenaEnJson;
    }

    public void setCadenaEnJson(String cadenaEnJson) {
        this.cadenaEnJson = cadenaEnJson;
    }

    // Representación en String del objeto
    @Override
    public String toString() {
        return "PrintToJSON{" +
                "cadenaEnJson='" + cadenaEnJson + '\'' +
                '}';
    }
}
