package PERSONAJES;

import ARMAS.ArmaAtaque;
import ARMAS.ArmaDefensa;

import java.util.ArrayList;

public class RompeHierro extends Enano{

    //  ATRIBUTOS

    // ArrayList -> RompeHierros

    protected ArrayList<Enano> listaEnanos = new ArrayList<>();



    // CONSTRUCTOR

    public RompeHierro(String nombre, int riqueza) {
        super(nombre, riqueza);
    }

    // MÉTODOS HEREDADOS

    @Override
    public void atacar(WarhammerPersonaje victima) {
        super.atacar(victima);
    }

    @Override
    public void defender(ArmaAtaque arma) {
        super.defender(arma);
    }

    @Override
    public void sumarEnergia() {
        super.sumarEnergia();
    }

    @Override
    public void addArmaAtaque(ArmaAtaque arma) {
        super.addArmaAtaque(arma);
    }

    @Override
    public void addArmaDefensa(ArmaDefensa arma) {
        super.addArmaDefensa(arma);
    }


    // MÉTODOS PROPIOS -> toString , addRompeHierro

    public void addRompeHierro(Enano enano){
        if (listaEnanos.contains(enano)){
            System.out.println("Este personaje ya existe");
        }else{
            listaEnanos.add(enano);
        }
    }
    @Override
    public String toString() {
        return "RompeHierro{" +
                "riqueza=" + riqueza +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
