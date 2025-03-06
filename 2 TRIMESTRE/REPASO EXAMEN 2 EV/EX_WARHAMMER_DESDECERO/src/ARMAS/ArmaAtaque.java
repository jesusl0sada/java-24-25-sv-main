package ARMAS;

import INTERFACES.IArmamentoAtaque;
import PERSONAJES.Goblin;
import PERSONAJES.Martillador;
import PERSONAJES.WarhammerPersonaje;

public abstract class ArmaAtaque extends Arma implements IArmamentoAtaque {

    // ATRIBUTOS



    // CONSTRUCTOR

    public ArmaAtaque(String nombre) {
        super(nombre);
    }


    // MÉTODOS HEREDADOS -> INTERFACE, CLASE PADRE.

    @Override
    public void atacar(WarhammerPersonaje victima) {

    }

    @Override
    public void atacar(WarhammerPersonaje victima, boolean esAtaqueTanque) {
        // Si es ataque tanque y la víctima es Goblin o Martillador, se aplica daño directo.
        if(esAtaqueTanque && (victima instanceof Goblin || victima instanceof Martillador)){
            System.out.println("La víctima es un esbirro y no puede defenderse del ataque de tanque.");

            // AQUÍ EN LAS CLASES HIJAS METEMOS UNA VARIABLE QUE TE GUARDE EL VALOR DEL METODO getVida_Consumida

            System.out.println("Víctima golpeada directamente. Energía restante: " + victima.energia);
        }
        else{
            // La víctima puede defenderse normalmente.
            victima.defender(this);
        }
    }



    // MÉTODOS PROPIOS -> NO HAY; SI ESO TO STRING

    @Override
    public String toString() {
        return "ArmaAtaque{}";
    }

    public int getVIDA_CONSUMIDA() {
        return 0;
    }

}
