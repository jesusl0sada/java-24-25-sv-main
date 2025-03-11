package naves;

public class NaveDestructor extends Nave{


    //ATRIBUTOS




    //CONSTRUCTOR

    public NaveDestructor(String nombre) {
        super(nombre);
    }



    //MÉTODOS PROPIOS


    @Override
    public void ataqueEspecial(Nave objetivo) {
        int dmg = 90;
        System.out.println("Se ejecutará el ataque especial de nave Destructora");
        System.out.println("El daño restado se triplicará, infligiendo " + dmg + "puntos de daño");
        if (objetivo.estaOperativa()) {
            System.out.println("No puedes restarle daño porque está muerto ya");
            return;
        } else {
            objetivo.restarSalud(dmg);
            System.out.println("El objetivo ha permanecido con " + objetivo.salud + "Puntos de vida");
        }
    }
}
