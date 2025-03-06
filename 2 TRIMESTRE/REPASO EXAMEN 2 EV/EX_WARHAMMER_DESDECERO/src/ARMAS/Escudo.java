package ARMAS;

import PERSONAJES.WarhammerPersonaje;

public class Escudo extends ArmaDefensa {

    //ATRIBUTOS
    protected static int VIDA_DEFENDIDA = 1;

    //CONSTRUCTOR
    public Escudo(String nombre, int VIDA_DEFENDIDA) {
        super(nombre);
        this.VIDA_DEFENDIDA = VIDA_DEFENDIDA;
    }

    //MÉTODOS HEREDADOS
    @Override
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante) {

        int danioAtaque = 0;

        // Comprobamos claramente si el arma atacante es un Martillo o Hacha
        if(armaAtacante instanceof Martillo || armaAtacante instanceof Hacha){
            // Restamos al daño del Martillo la vida defendida por el Escudo
            danioAtaque = ((Martillo) armaAtacante).getVIDA_CONSUMIDA() - VIDA_DEFENDIDA;

            System.out.println("Escudo activado contra Martillo. Daño reducido a " + danioAtaque);
        } else {
            // Si no es Martillo o hacha, recibimos todo el daño completo
            danioAtaque = armaAtacante.getVIDA_CONSUMIDA();
            System.out.println("Escudo no protege contra este arma. Daño recibido: " + danioAtaque);
        }

        // Restamos el daño finalmente calculado al personaje defendido
        defendido.energia -= danioAtaque;
        System.out.println("Energía restante del personaje defendido: " + defendido.energia);
    }


    //MÉTODOS PROPIOS -> ToString, getVida


    public static int getVidaDefendida() {
        return VIDA_DEFENDIDA;
    }

    @Override
    public String toString() {
        return "Escudo{}";
    }
}
