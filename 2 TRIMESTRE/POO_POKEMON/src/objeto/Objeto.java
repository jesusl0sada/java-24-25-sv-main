package objeto;

import pokemon.Pokemon;

public abstract class Objeto {
    protected String nombreObjeto;

    public Objeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    // Método para usar en un Pokémon
    public abstract void usar(Pokemon p);
}
