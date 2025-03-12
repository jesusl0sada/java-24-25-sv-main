import Pokemon.Entrenador;
import Pokemon.MovimientoAtaque;
import Pokemon.PokemonAgua;
import Pokemon.PokemonFuego;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Entrenador ash = new Entrenador("Ash");
        PokemonFuego charmander = new PokemonFuego("Charmander");
        PokemonAgua squirtle = new PokemonAgua("Squirtle");

        MovimientoAtaque lanzallamas = new MovimientoAtaque("Lanzallamas", 30);
        MovimientoAtaque burbuja = new MovimientoAtaque("Burbuja", 20);

        charmander.agregarMovimiento(lanzallamas);
        squirtle.agregarMovimiento(burbuja);

        ash.añadirPokemon(charmander);
        ash.añadirPokemon(squirtle);

        charmander.atacar(squirtle);
        System.out.println("Squirtle atacado, ¿sigue vivo? " + squirtle.estaVivo());
    }
}