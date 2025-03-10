import entrenador.Entrenador;
import movimiento.MovimientoAtaque;
import movimiento.MovimientoDefensa;
import objeto.Eter;
import objeto.PocionVida;
import pokemon.Pokemon;
import pokemon.PokemonAgua;
import pokemon.PokemonFuego;
import combate.Combate;

public class Main {
    public static void main(String[] args) {
        // 1) Crear entrenadores
        Entrenador ash = new Entrenador("Ash");
        Entrenador misty = new Entrenador("Misty");

        // 2) Crear Pokémon
        Pokemon charmander = new PokemonFuego("Charmander", 10);
        Pokemon squirtle = new PokemonAgua("Squirtle", 8);

        // 3) Asignar movimientos (1 ataque, 1 defensa, por ejemplo)
        charmander.agregarMovimiento(new MovimientoAtaque("Llamarada", 50));
        charmander.agregarMovimiento(new MovimientoDefensa("Muro Fuego", 20));

        squirtle.agregarMovimiento(new MovimientoAtaque("Pistola Agua", 45));
        squirtle.agregarMovimiento(new MovimientoDefensa("Escudo Acuático", 15));

        // 4) Añadir estos Pokémon a los entrenadores
        ash.aniadirPokemon(charmander);
        misty.aniadirPokemon(squirtle);

        // 5) Crear algunos objetos y meterlos en la mochila
        PocionVida pocion = new PocionVida("Poción pequeña", 40);
        Eter eterBasico = new Eter("Éter básico", 5);

        ash.aniadirObjeto(pocion);
        misty.aniadirObjeto(eterBasico);

        // 6) Simular un Combate (Ash usa a charmander, Misty usa a squirtle)
        Combate c1 = new Combate(ash, misty, charmander, squirtle);
        c1.iniciarCombate();
        c1.mostrarResultado();

        // 7) Ver estado de los entrenadores
        System.out.println("Estado final Entrenadores:");
        System.out.println(ash);
        System.out.println(misty);

        // 8) (OPCIONAL) Podríamos usar un objeto
        System.out.println("Ash usa la poción en Charmander");
        ash.usarObjeto(pocion, charmander);
        System.out.println(charmander);
    }
}
