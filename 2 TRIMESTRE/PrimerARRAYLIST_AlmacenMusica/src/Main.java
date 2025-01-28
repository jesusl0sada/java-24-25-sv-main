import pojo.AlmacenMusica;
import pojo.Cancion;

public class Main {
    public static void main(String[] args) {

        // CANCIONES -> OBJETOS

        Cancion cancion1 = new Cancion("Bohemian Rapsody", "Queen");
        Cancion cancion2 = new Cancion("Hotel California", "Eagles");
        Cancion cancion3 = new Cancion("Billie Jean", "Michael Jackson");
        Cancion cancion4 = new Cancion("Imagine", "John Lennon");
        Cancion cancion5 = new Cancion("Sweet Child O' Mine" , "Guns N' Roses");
        Cancion cancion6 = new Cancion("Wonderwall", "Oasis");
        Cancion cancion7 = new Cancion("Dancing Queen", "ABBA");

        // ALMACÉN MÚSICA -> AÑADIREMOS , ELIMINAREMOS LAS CANCIONES Y PODREMOS REVISARLAS...

        AlmacenMusica.addCancion(cancion1);
        AlmacenMusica.addCancion(cancion2);
        AlmacenMusica.eliminarCancion(cancion1);
