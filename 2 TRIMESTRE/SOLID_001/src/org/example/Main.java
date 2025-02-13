package org.example;

import org.example.herencia.Reporte;
import org.example.printers.PrintToHTML;
import org.example.printers.PrintToJSON;
import org.example.printers.PrintToXML;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creación de instancias de los distintos tipos de reporte
        Reporte json0 = new PrintToJSON("FDAS");
        Reporte xml0 = new PrintToXML("FDSA");
        Reporte html0 = new PrintToHTML("HOLAHOLA");
        Reporte json1 = new PrintToJSON("ADIOSADIOS");
        Reporte xml1 = new PrintToXML("ALBERTO ALBERTO");
        Reporte html1 = new PrintToHTML("EJERCICIO HERENCIA");

        // Se guardan en una lista como el tipo padre Reporte
        ArrayList<Reporte> lst = new ArrayList<>();
        lst.add(json0);
        lst.add(json1);
        lst.add(html0);
        lst.add(html1);
        lst.add(xml0);
        lst.add(xml1);

        // Se imprimen las cadenas utilizando polimorfismo
        for (Reporte reporte: lst){
            System.out.println(reporte.imprimirCadena());
        }
    }
}
