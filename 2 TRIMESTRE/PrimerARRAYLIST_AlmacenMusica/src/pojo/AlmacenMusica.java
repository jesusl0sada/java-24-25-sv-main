package pojo;

import java.util.ArrayList;

public class AlmacenMusica {

    // CREACIÓN DEL ARRAYLIST E INICIALIZACIÓN CON NEW.
    public static ArrayList<Cancion> listaDeCanciones = new ArrayList<>(); // INICIALIZACIÓN DEL ARRAYLIST...

    // MÉTODOS: AÑADIR CANCIÓN, ELIMINAR CANCIÓN, IMPRIMIR CANCIONES............... -> VIENEN DE LAS YA CREADAS.
    public static void addCancion(Cancion micancion){
    listaDeCanciones.add(micancion); // micancion es un objeto tipo Cancion que podremos añadir -> añadiremos los objetos desde el arraylist.
        System.out.println("Canción añadida con éxito a la lista...");
    }

    public static void eliminarCancion(Cancion cancion2){
        for (int i = 0; i < listaDeCanciones.size(); i++) {
        Cancion micancion = listaDeCanciones.get(i);
        if (listaDeCanciones.get(i).equals(cancion2))
            listaDeCanciones.remove(cancion2);
            System.out.println("CANCIÓN ELIMINADA CON ÉXITO, la canción eliminada ha sido" + cancion2.getTitulo());
        }
    }

    public static void imprimirCanciones(Cancion cancion) {
    // TENDREMOS QUE RECORRERLO EL ARRAYLIST Y LUEGO PRINTEARLOS...
        for (Cancion cancion :listaDeCanciones) {
            System.out.println("Canción : " + cancion.toString()); // EL GET SERÁ DE LA VARIABLE AUXILIAR.
            }
        }

}
