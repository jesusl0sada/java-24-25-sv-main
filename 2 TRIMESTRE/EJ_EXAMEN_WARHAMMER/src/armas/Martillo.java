package armas;

import personajes.WarhammerPersonaje;

public class Martillo extends ArmaAtaque {

    // ATRIBUTOS PROPIOS -> MÁS ALLA DE LA HERENCIA
    private static int VIDA_CONSUMIDA = 3; // TE QUITA 4 DE VIDA
    // CONSTRUCTOR
    public Martillo(String nombre) {
        super(nombre);
    }

    // MÉTODOS HEREDADOS -> DE LA CLASE ArmaAtaque.
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {
        super.atacar(victima);
    }

    @Override
    public void atacar(WarhammerPersonaje victima, boolean esAtaqueEmperador) {
        super.atacar(victima, esAtaqueEmperador);
    }
        // MÉTODOS PROPIOS (MÁS ALLÁ DE LA HERENCIA)

    public static int getVidaConsumida() {  // Para poder conseguir el getter el atributo no puede ser final.
        return VIDA_CONSUMIDA;
    }
}
