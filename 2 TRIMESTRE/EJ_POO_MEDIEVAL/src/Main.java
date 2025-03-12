import ARMA.*;
import PERSONAJES.*;

public class Main {
    public static void main(String[] args) {

        // CREAR GUERREROS
        Guerrero guerrero1 = new Espadachin("Conan");
        Guerrero guerrero2 = new Arquero("Legolas");

        // AÑADIR ARMAS
        guerrero1.addArma(new Espada("Espada Larga", 30));
        guerrero1.addArma(new Lanza("Lanza de Guerra", 40));
        guerrero2.addArma(new Arco("Arco de Ébano", 35));

        // EQUIPAR ESCUDOS
        guerrero1.equiparEscudo(new Escudo("Escudo de Hierro", 20));
        guerrero2.equiparEscudo(new Escudo("Escudo Ligero", 10));

        // IMPRIMIR ESTADO INICIAL
        guerrero1.imprimirEstado();
        guerrero2.imprimirEstado();

        // INICIAR COMBATE

        while (guerrero1.estavivo() && guerrero2.estavivo()) {
            guerrero1.atacar(guerrero2);
            if (!guerrero2.estavivo()) break;

            guerrero2.atacar(guerrero1);
        }

        System.out.println("¡Fin del combate!");
    }
}
