package pojo;

import interfaces.SuperAttack;
import interfaces.SuperDefense;

public class SpiderMan extends SuperHero implements SuperAttack, SuperDefense {

    // ATRIBUTOS, CONSTRUCTOR HEREDADOS DE LA CLASE SuperHero
    public SpiderMan(String nombre, String vida, String danio, String defensa) {
        super(nombre, vida, danio, defensa);
    }

    // MÉTODOS HEREDADOS DE LA CLASE PADRE SuperHero (-> OVERRIDE / SOBREESCRITO).

    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }

    // MÉTODOS HEREDADOS DE LA INTERFACE SuperAttack y SuperDefense.


    @Override
    public void lanzarSuperAtaque() {

    }

    @Override
    public void lanzarSuperDefensa() {

    }


}
