import java.util.ArrayList;
public class AlmacenMusica implements IEstanteria {
    // implements = que siga las ordenes de la interfaz i estanteria.

    // ARRAYLIST:
    ArrayList<Cancion> listaCanciones = new ArrayList<>(); // DECLARACIÓN E INICIALIZACIÓN DEL ARRAYLIST

    //ATRIBUTOS

    // CONSTRUCTOR

        // -> EN ESTE CASO VACIO PARA QUE ME DEJE METER EL OBJETO ALMACEN MUSICA EN EL MAIN A PARTIR DEL CUAL HAREMOS TODO, METER CANCIONES , ETC... SOLO NECESITAMOS
        // UN ALMACÉN DE MOMENTO.


    //MÉTODOS -> vendrán de la interfaz IEstanteria (lo que te manda)

    @Override
    public void addCancion(Cancion cancion) {
            listaCanciones.add(cancion); // Nos permitirá meter un objeto de tipo Cancion (en este caso llamado cancion, eso es irrelevante)
            System.out.println("Canción añadida con éxito, la canción que has añadido es... " + cancion);
        }



    public void updateCancion(Cancion cancion, String nuevoTitulo, String nuevoAutor, String nuevoGenero) {
        for (Cancion miCancion : this.listaCanciones) {

            // RECORREMOS Y BUSCAMOS LA CANCION CON GET - > NO PODREMOS ACTUALIZAR LOS DATOS DE UNA CANCIÓN QUE NO ESTÉ EN EL ALMACÉN.
            if (miCancion.getTitulo().equals(cancion.getTitulo()) &&
                    miCancion.getAutor().equals(cancion.getAutor())) {

                // Modificamos los valores CON SET !
                System.out.println("La canción a actualizar va a ser: " + cancion);
                miCancion.setTitulo(nuevoTitulo);
                miCancion.setAutor(nuevoAutor);
                miCancion.setGenero(nuevoGenero);
                System.out.println("Canción actualizada con éxito, se ha reemplazado por..." + miCancion);
                return;
            }
        }
        System.out.println("No se encontró la canción para actualizar, inténtalo de nuevo...");
    }

    @Override
    public void deleteCancion(Cancion cancion) {
    this.listaCanciones.remove(cancion);
        System.out.println("Has eliminado la cancion... " + cancion + "...");
    }

    @Override
    public void imprimir() {
        for (Cancion cancion: listaCanciones) {
            System.out.println("Info de la canción : " + cancion.toString()); // CON ESTO RECORREREMOS TODO EL ARRAYLIST Y OBTENDREMOS LOS DATOS DE CADA UNA DE LAS CANCIONES.
            
        }
    }

    @Override
    public void detallesAlmacen(AlmacenMusica almacenMusica) {
        System.out.println("Detalles Almacén de música ..." + almacenMusica.toString());
    }

    //GETTER AND SETTER



    //TO STRING
    @Override
    public String toString() {
        return "AlmacenMusica{" +
                "listaCanciones=" + listaCanciones +
                '}';
    }
}
