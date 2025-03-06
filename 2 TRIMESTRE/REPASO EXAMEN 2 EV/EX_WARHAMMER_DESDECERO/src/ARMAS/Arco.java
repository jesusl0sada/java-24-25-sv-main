package ARMAS;

import PERSONAJES.Goblin;
import PERSONAJES.Martillador;
import PERSONAJES.WarhammerPersonaje;
import java.util.Random;

public class Arco extends ArmaAtaque {

    // INICIALIZAMOS Y DECLARAMOS EL RANDOM QUE VAMOS A USAR
    Random randomizador = new Random();

    // ATRIBUTOS

    final int VIDA_CONSUMIDA = 3;


    // CONSTRUCTOR

    public Arco(String nombre) {
        super(nombre);
    }


    // MÉTODOS HEREDADOS

    @Override
    public void atacar(WarhammerPersonaje victima) {

        // CREAMOS UN BOOLEANO DE FLECHA ROTA -> lo randomizamos, si es flecharota; no puede atacar, sino -> si

        boolean flechaRota = randomizador.nextBoolean();
        if (flechaRota){
            System.out.println("La flecha se te ha roto no puedes atacar");
        }else {
            super.atacar(victima);
        }
    }

    @Override
    public void atacar(WarhammerPersonaje victima, boolean esAtaqueTanque) {

        boolean flechaRota = randomizador.nextBoolean();
        if (flechaRota){
            System.out.println("La flecha está rota no puedes pegar");
        }else{
            // Si es ataque tanque y la víctima es Goblin o Martillador, se aplica daño directo.
            if(esAtaqueTanque && (victima instanceof Goblin || victima instanceof Martillador)){
                System.out.println("La víctima es un esbirro y no puede defenderse del ataque de tanque.");


                // AQUÍ EN LAS CLASES HIJAS METEMOS UNA VARIABLE QUE TE GUARDE EL VALOR DEL METODO getVida_Consumida
                int vida_eliminada = getVIDA_CONSUMIDA();
                System.out.println("Le has quitado " + vida_eliminada + ".");
                int vida_restante_victima = victima.energia-vida_eliminada;
                System.out.println("Víctima golpeada directamente. Energía restante: " + vida_restante_victima);
            }
            else{
                // La víctima puede defenderse normalmente.
                victima.defender(this );
            }
        }
    }

    // MÉTODOS PROPIOS -> toString, getVidaConsumida


    public int getVIDA_CONSUMIDA() {
        return VIDA_CONSUMIDA;
    }

    @Override
    public String toString() {
        return "Arco{" +
                "VIDA_CONSUMIDA=" + VIDA_CONSUMIDA +
                '}';
    }

}
