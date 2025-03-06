package ARMAS;

public class Rebanadora extends ArmaAtaque{


    //ATRIBUTOS
    final int VIDA_CONSUMIDA = 5;


    // CONSTRUCTOR

    public Rebanadora(String nombre) {
        super(nombre);
    }


    // MÉTODOS HEREDADOS



    // MÉTODOS PROPIOS -> GET VIDA CONSUMIDA, toString


    public int getVIDA_CONSUMIDA() {
        return VIDA_CONSUMIDA;
    }

    @Override
    public String toString() {
        return "Rebanadora{" +
                "VIDA_CONSUMIDA=" + VIDA_CONSUMIDA +
                '}';
    }

}
