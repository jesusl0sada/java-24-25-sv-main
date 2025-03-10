package objeto;

import pokemon.Pokemon;

public class Eter extends Objeto {
    private int recuperaPotencia;

    public Eter(String nombreObjeto, int recuperaPotencia) {
        super(nombreObjeto);
        this.recuperaPotencia = recuperaPotencia;
    }

    @Override
    public void usar(Pokemon p) {
        System.out.println("Usando " + nombreObjeto + " sobre " + p);
        // En esta versión mínima, no hacemos nada real,
        // pero en teoría podríamos aumentar la "potencia" de algún Movimiento
        System.out.println("Se supone que recupera " + recuperaPotencia + " de potencia.");
    }
}
