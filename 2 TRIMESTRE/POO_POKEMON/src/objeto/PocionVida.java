package objeto;

import pokemon.Pokemon;

public class PocionVida extends Objeto {
    private int cantidadCura;

    public PocionVida(String nombreObjeto, int cantidadCura) {
        super(nombreObjeto);
        this.cantidadCura = cantidadCura;
    }

    @Override
    public void usar(Pokemon p) {
        System.out.println("Usando " + nombreObjeto + " sobre " + p);
        // Curar al Pokémon
        // Con un method setSalud / restarSalud( -cantidadCura ), etc.
        // Ejemplo simple:
        p.restarSalud(-cantidadCura); // negativo para "sumar" salud
    }
}
