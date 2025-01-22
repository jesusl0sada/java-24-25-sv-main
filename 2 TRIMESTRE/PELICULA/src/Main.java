import pojo.ListaPeliculas;
import pojo.Pelicula;

public class Main {
    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula("Torrente", "Santiago Segura", 2007);
        Pelicula pelicula2 = new Pelicula("Pulp Fiction", "Quentin Tarantino", 1994);
        Pelicula pelicula3 = new Pelicula("Inception", "Christopher Nolan", 2010);
        Pelicula pelicula4 = new Pelicula("Schindler's List" , "Steven Spielberg", 1993);
        Pelicula pelicula5 = new Pelicula("Parasite", "Bong Joon-ho", 2019);
        Pelicula pelicula6 = new Pelicula("The Dark Knight", "Christopher Nolan", 2008);
        Pelicula pelicula7 = new Pelicula("Fight Club", "David Fincher", 1999);
        Pelicula pelicula8 = new Pelicula("Spirited Away", "Hayao Miyazaki", 2001);
        Pelicula pelicula9 = new Pelicula("The Grand Budapest Hotel", "Wes Anderson", 2014);
        Pelicula pelicula10 = new Pelicula("The Godfather", "Francis Ford Coppola", 1972);

        // Agregar películas a la lista enlazada

        ListaPeliculas.agregarPelicula(pelicula1);
        ListaPeliculas.agregarPelicula(pelicula2);
        ListaPeliculas.agregarPelicula(pelicula3);
        ListaPeliculas.agregarPelicula(pelicula4);
        ListaPeliculas.agregarPelicula(pelicula5);
        ListaPeliculas.agregarPelicula(pelicula6);
        ListaPeliculas.agregarPelicula(pelicula7);
        ListaPeliculas.agregarPelicula(pelicula8);
        ListaPeliculas.agregarPelicula(pelicula9);
        ListaPeliculas.agregarPelicula(pelicula10);

        // IMPRIMIR LAS PELÍCULAS

        ListaPeliculas.imprimirPeliculas();

        }
    }
