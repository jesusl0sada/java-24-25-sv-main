package ARMAS;

import PERSONAJES.WarhammerPersonaje;

public class Armadura extends ArmaDefensa {

    //ATRIBUTOS

    protected static int VIDA_DEFENDIDA = 0;

    //CONSTRUCTOR

    public Armadura(String nombre) {
        super(nombre);
        this.VIDA_DEFENDIDA = VIDA_DEFENDIDA;
    }

    // MÉTODOS HEREDADOS -> PADRE

    @Override
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante) {
        super.defender(defendido, armaAtacante);
        System.out.println("La armadura no tiene ninguna utilidad");
        int danioAtaque = armaAtacante.getVIDA_CONSUMIDA();
        int vidaFinal = defendido.energia - getVidaDefendida();
        System.out.println("Vida restante"  + vidaFinal + ".");

    }


    // MÉTODOS PROPIOS: getVIDA_DEFENDIDA, toString

    public static int getVidaDefendida() {
        return VIDA_DEFENDIDA;
    }
}
