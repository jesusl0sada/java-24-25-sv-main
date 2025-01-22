package pojo;

public class ListaPeliculas {
    // ATRIBUTOS
    private static Pelicula puntero; // PUNTERO
    private static int contadorPeliculas = 0;

    // CONSTRUCTOR
    public ListaPeliculas() {
        this.puntero = null; // Al principio, la lista está vacía
    }

    // MÉTODO PARA AGREGAR UNA PELÍCULA
    public static void agregarPelicula(Pelicula nuevaPelicula) {

        if (puntero == null) {
            // Si la lista está vacía, el inicio apunta a la nueva película; entonces
            puntero = nuevaPelicula;
        } else {

            // Si no está vacía, recorremos hasta el último.
            Pelicula punteroActual = puntero;
            while (punteroActual.getSiguiente() != null) {
                punteroActual = punteroActual.getSiguiente();
            }

            // El último apunta a la nueva película
            punteroActual.setSiguiente(nuevaPelicula);
        }
    }

    // MÉTODO PARA IMPRIMIR TODAS LAS PELÍCULAS
    public static void imprimirPeliculas() {
        Pelicula actual = puntero;
        while (actual != null) {
            System.out.println(actual);
            System.out.println("---------------------------"+ "ESTA ES LA PELÍCULA:..." + contadorPeliculas + "-------------------------------------");
            actual = actual.getSiguiente(); // Pasamos al siguiente nodo
        }
    }
}


