package pokemon;

public class PokemonFuego extends Pokemon {

    public PokemonFuego(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void ataqueEspecial(Pokemon oponente) {
        System.out.println(nombre + " (Fuego) hace un ATAQUE ESPECIAL ardiente sobre " + oponente.nombre);
        // Ejemplo simple: resta 30 de salud
        oponente.restarSalud(30);
    }
}
