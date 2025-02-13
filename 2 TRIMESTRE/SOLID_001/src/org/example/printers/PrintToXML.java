package org.example.printers;

import org.example.herencia.Reporte;

public class PrintToXML extends Reporte {

    // Atributo propio de la clase
    protected String cadenaEnXml;

    // Constructor que inicializa la cadena
    public PrintToXML(String cadena){
        super(cadena);
        this.cadenaEnXml = "<xml><mensaje>" + cadena + "</mensaje></xml>"; // Conversión a XML
    }

    // Sobreescribe el método de Reporte
    @Override
    public String imprimirCadena(){
        return cadenaEnXml;
    }

    // Getters y Setters
    public String getCadenaEnXml() {
        return cadenaEnXml;
    }

    public void setCadenaEnXml(String cadenaEnXml) {
        this.cadenaEnXml = cadenaEnXml;
    }

    // Representación en String del objeto
    @Override
    public String toString() {
        return "PrintToXML{" +
                "cadenaEnXml='" + cadenaEnXml + '\'' +
                '}';
    }
}
