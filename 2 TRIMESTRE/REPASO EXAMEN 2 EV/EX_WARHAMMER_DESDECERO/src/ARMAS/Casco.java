package ARMAS;

import PERSONAJES.WarhammerPersonaje;

public class Casco extends ArmaDefensa{

    //ATRIBUTOS

    protected static int VIDA_DEFENDIDA = 1;


    //CONSTRUCTOR

    public Casco(String nombre, int VIDA_DEFENDIDA) {
        super(nombre);
        this.VIDA_DEFENDIDA = VIDA_DEFENDIDA;
    }

    //MÉTODOS HEREDADOS

    @Override
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante) {
        int danioAtaque = 0;

        // Comprobamos claramente si el arma atacante es un Arco
        if(armaAtacante instanceof Arco){

            // Restamos al daño del Arco la vida defendida por el Casco
            danioAtaque = ((Arco) armaAtacante).getVIDA_CONSUMIDA() - VIDA_DEFENDIDA;

            System.out.println("Escudo activado contra Martillo. Daño reducido a " + danioAtaque);
        } else {
            // Si no es Arco, recibimos todo el daño completo
            danioAtaque = armaAtacante.getVIDA_CONSUMIDA();
            System.out.println("Escudo no protege contra este arma. Daño recibido: " + danioAtaque);
        }

        // Restamos el daño finalmente calculado al personaje defendido
        defendido.energia -= danioAtaque;
        System.out.println("Energía restante del personaje defendido: " + defendido.energia);
    }

    //MÉTODOS PROPIOS -> toString, getVIDA_DEFENDIDA

    @Override
    public String toString() {
        return "Casco{}";
    }
}
