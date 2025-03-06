package ARMAS;

public class Martillo extends ArmaAtaque{


    // ATRIBUTOS

    final int VIDA_CONSUMIDA = 3;

    // CONSTRUCTOR

    public Martillo(String nombre) {
        super(nombre);
    }


    // MÉTODOS HEREDADOS -> CLASE: podría heredar atacar y atacar pero no lo hace.



    // MÉTODOS PROPIOS -> Get vida_consumida, toString.

    public int getVIDA_CONSUMIDA() {
        return VIDA_CONSUMIDA;
    }

    @Override
    public String toString() {
        return "Martillo{" +
                "VIDA_CONSUMIDA=" + VIDA_CONSUMIDA +
                '}';
    }
}
