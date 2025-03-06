package personajes;


import armas.ArmaAtaque;
import armas.ArmaDefensa;

import java.util.ArrayList;

public class Orco extends PielVerde{
    private ArrayList<Goblin> listaGoblin = new ArrayList<>(); // INICIALIZAMOS Y DECLARAMOS EL ARRAYLIST.

    public Orco(String nombre, String puebloNacimiento) {
        super(nombre, puebloNacimiento);
    }

    // MÉTODOS HEREDADOS DEL PADRE


    @Override
    public void SumarEnergia() {
        super.SumarEnergia();
    }

    @Override
    public void addArmaAtaque(ArmaAtaque arma) {
        super.addArmaAtaque(arma);
    }

    @Override
    public void addArmaDefensa(ArmaDefensa arma) {
        super.addArmaDefensa(arma);
    }

    @Override
    public void atacar(WarhammerPersonaje victima, boolean esAtaqueEmperador) {
        super.atacar(victima, esAtaqueEmperador);
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {

    }

    @Override
    public void defender(ArmaAtaque arma) {
        super.defender(arma);
    }

    @Override
    public String toString() {
        return "Orco{" +
                "puebloNacimiento='" + puebloNacimiento + '\'' +
                ", nivel=" + nivel +
                ", nombre='" + nombre + '\'' +
                ", energia=" + energia +
                '}';
    }

    // MÉTODOS PROPIOS -> RELACIONADOS CON EL ARRAYLIST GOBLIN

}
