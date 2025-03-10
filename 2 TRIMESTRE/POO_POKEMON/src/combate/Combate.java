package combate;

import entrenador.Entrenador;
import pokemon.Pokemon;

public class Combate {

    Entrenador entrenador1;
    Entrenador entrenador2;
    Pokemon pokemon1;
    Pokemon pokemon2;

    public Combate(Entrenador entrenador1, Entrenador entrenador2,
                   Pokemon pokemon1, Pokemon pokemon2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }

    public void iniciarCombate() {
        System.out.println("=== INICIO DEL COMBATE ===");
        System.out.println(pokemon1 + " vs " + pokemon2);

        // Turno 1: Pokemon1 ataca a Pokemon2
        pokemon1.atacar(pokemon2);
        if (!pokemon2.estaVivo()) {
            System.out.println(pokemon2 + " ha quedado fuera de combate");
            return;
        }

        // Turno 2: Pokemon2 ataca a Pokemon1
        pokemon2.atacar(pokemon1);
        if (!pokemon1.estaVivo()) {
            System.out.println(pokemon1 + " ha quedado fuera de combate");
            return;
        }

        // Ejemplo: Podrías hacer varios turnos o un while(...)
        // Aquí, por simplicidad, sólo hacemos 1 intercambio de golpes.
    }

    public void mostrarResultado() {
        System.out.println("=== RESULTADO DEL COMBATE ===");
        System.out.println(pokemon1);
        System.out.println(pokemon2);

        if (!pokemon1.estaVivo() && !pokemon2.estaVivo()) {
            System.out.println("¡Ambos han caído!");
        } else if (!pokemon1.estaVivo()) {
            System.out.println(pokemon2 + " GANA");
        } else if (!pokemon2.estaVivo()) {
            System.out.println(pokemon1 + " GANA");
        } else {
            System.out.println("Combate finalizado con ambos en pie (parcial).");
        }
    }
}
