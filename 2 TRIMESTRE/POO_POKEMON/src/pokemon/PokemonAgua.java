package pokemon;

public class PokemonAgua extends Pokemon {

    public PokemonAgua(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void ataqueEspecial(Pokemon oponente) {
        System.out.println(nombre + " (Agua) lanza un CHORRO ESPECIAL a " + oponente.nombre);
        // Ejemplo simple: resta 25 de salud
        oponente.restarSalud(25);
    }
}
