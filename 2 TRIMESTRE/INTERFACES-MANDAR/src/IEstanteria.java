public interface IEstanteria {

    // CLASES QUE PERMITEN MANDAR -> es decir aquí solo se
    // ponen las instrucciones del proyecto, como va a estar
    // compuesto, nombres de métodos, qué devuelve, parámetros
    // de entrada, etc...

    public void addCancion(Cancion cancion);
    public void updateCancion(Cancion cancion, String nuevoTitulo, String nuevoAutor, String nuevoGenero);
    public void deleteCancion(Cancion cancion);
    public void imprimir();
    public void detallesAlmacen(AlmacenMusica almacenMusica);

}
