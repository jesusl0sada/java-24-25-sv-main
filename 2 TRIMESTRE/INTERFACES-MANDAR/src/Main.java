public class Main {
    public static void main(String[] args) {

        // CREACIÓN DE OBJETOS -> CANCIONES

        Cancion cancion1 = new Cancion("Blinding Lights", "The Weekend", "Pop");
        Cancion cancion2 = new Cancion("Llorando en la limo", "C.Tangana", "Trap");
        Cancion cancion3 = new Cancion("Do I Wanna Know", "Artic Monkeys", "Rock Alternativo");
        Cancion cancion4 = new Cancion("Tití Me Preguntó", "Bad Bunny", "Reggaeton");
        Cancion cancion5 = new Cancion("Bohemian Rapsody", "Queen", "Electrónica");


        // ALMACÉN DE MÚSICA -> ALMACENAR CANCIONES ARRAYLIST.

        AlmacenMusica almacenMusica = new AlmacenMusica();

        //AÑADIR CANCIONES
        almacenMusica.addCancion(cancion1);
        almacenMusica.addCancion(cancion2);
        almacenMusica.addCancion(cancion3);
        almacenMusica.addCancion(cancion4);
        almacenMusica.addCancion(cancion5);

        //IMPRESIÓN
        almacenMusica.imprimir(); // -> esta función en la clase almacen musica tendrá que recorrer el arraylist con un foreach y meter un toString.

        //ACTUALIZAR CANCIONES
        almacenMusica.updateCancion(cancion1, "Saoko", "Rosalía", "Reggaeton");
        almacenMusica.updateCancion(cancion2, "Love Yourself", "Eminem", "Rap");

        // IMPRESIÓN
        System.out.println("Post actualización...");
        almacenMusica.imprimir(); // -> esta función en la clase almacen musica tendrá que recorrer el arraylist con un foreach y meter un toString.

        //ELIMINAR CANCIONES
        almacenMusica.deleteCancion(cancion3);
        almacenMusica.deleteCancion(cancion4);
        almacenMusica.deleteCancion(cancion5);

        //IMPRESIÓN
        System.out.println("Post eliminar canciones...");
        System.out.println("LISTA DEFINITIVA DE CANCIONES:");
        almacenMusica.imprimir(); // -> esta función en la clase almacen musica tendrá que recorrer el arraylist con un foreach y meter un toString.

        }
    }
