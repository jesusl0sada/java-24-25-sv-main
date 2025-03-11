package naves;

import armas.ArmaAtaque;

public class NaveCaza extends Nave{


    //ATRIBUTOS




    //CONSTRUCTOR

    public NaveCaza(String nombre) {
        super(nombre);
    }


    //MÉTODOS HEREDADOS

    @Override
    public void ataqueEspecial(Nave objetivo) {
        int dmg = 60;
        System.out.println("Se ejecutará el ataque especial de nave de caza");
        System.out.println("El daño restado se multiplicará, infligiendo " + dmg + "puntos de daño");
        if (objetivo.estaOperativa()) {
            System.out.println("No puedes restarle daño porque está muerto ya");
            return;
        } else {
            objetivo.restarSalud(dmg);
            System.out.println("El objetivo ha permanecido con " + objetivo.salud + "Puntos de vida");
        }
    }




    //MÉTODOS PROPIOS
}
