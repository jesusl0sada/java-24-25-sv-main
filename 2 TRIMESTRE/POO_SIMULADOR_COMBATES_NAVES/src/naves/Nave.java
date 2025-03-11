package naves;

import armas.ArmaAtaque;
import armas.ArmaDefensa;
import interfaces.IAtaque;
import interfaces.IDefensa;
import modulos.Modulo;

import java.util.ArrayList;

public abstract class Nave implements IAtaque, IDefensa {

    //ATRIBUTOS

    protected String nombre;
    protected int salud;
    protected final int SALUD_MAX = 100; // las naves por defectos tienen 100 de vida.

    ArrayList<Modulo> listaModulos = new ArrayList<>(); // AQUÍ ALMACENAMOS LOS MÓDULOS QUE USA UNA NAVE.


    //CONSTRUCTOR

    public Nave(String nombre) {
        this.nombre = nombre;
    }


    //MÉTODOS: HEREDAN OTROS...

    ArmaAtaque getArmaAtaque(){
        return null;
    }

    ArmaDefensa getArmaDefensa(){
        return null;
    }

    public void restarSalud(int dmg){ // EL DAÑO SE LE RESTARÁ A LA SALUD
        if (salud < 0){
            System.out.println("La nave ya ha caido");
            salud = 0;
        }else{ // salud > 0;
        System.out.println("Restando salud....");
        System.out.println("La nave ha perdido : " + dmg + "Puntos de salud" );
        int vidaRestante = salud-dmg;
        }
    }

    public boolean estaOperativa(){
        if (salud>0){
            System.out.println("La nave ha quedado en pie con " +salud + "Puntos de salud");
            return true;
        }else{
            System.out.println("La nave no está operativa, tiene 0 de vida.");
            salud = 0;
            System.out.println("Vida de la nave " + salud);
            return false;
        }
    }

    public void ataqueEspecial(Nave objetivo){
        final int dmg = 30;
        if (objetivo.estaOperativa()){
            System.out.println("Se ejecutará el ataque especial, este es GENÉRICO");
            System.out.println("El ataque especial inflinge" + dmg + "Puntos de daño");
            objetivo.restarSalud(30);
        }else{
            System.out.println("El objetivo ya está muerto");
            objetivo.restarSalud(0);
        }
        System.out.println("El objetivo ha permanecido con " + objetivo.salud + "Puntos de vida");
    }


    // MÉTODOS HEREDADOS


    @Override
    public void atacar(Nave objetivo) {

        // 1) ENCONTRAMOS EL ARMA CON EL QUE VA A ATACAR LA NAVE.
        ArmaAtaque arma = getArmaAtaque();

        // 2) VERIFICAMOS SI LA NAVE PUEDE ATACAR
        if (arma == null) {
            System.out.println(nombre + " no tiene armas de ataque y no puede atacar.");
            return; // Terminamos la función aquí, no tiene sentido seguir
        }

        System.out.println(nombre + " ataca a " + objetivo.nombre + " con " + arma.getNombreArma());

        // 3) MODIFICAMOS EL DAÑO SEGÚN EL TIPO DE NAVE OBJETIVO
        int danioFinal = arma.getDanio(); // Valor por defecto del arma

        if (objetivo instanceof NaveCaza) {
            System.out.println("¡Estás atacando a una nave caza! Su maniobrabilidad reduce el daño a la mitad.");
            danioFinal /= 2; // Reducimos el daño si la nave objetivo es una NaveCaza
        }

        // 4) LLAMAMOS A DEFENDER O RESTAMOS VIDA DIRECTAMENTE
        objetivo.defender(arma, danioFinal);

    }

    @Override
    public void defender(ArmaAtaque arma, int danioRecibido) {

        // 1) ENCONTRAMOS EL ARMA CON EL QUE NOS VAMOS A DEFENDER.
        ArmaDefensa armaDefensa = getArmaDefensa();

        // 2) SI NO HAY DEFENSA, RECIBIMOS EL DAÑO COMPLETO.
        if (armaDefensa == null) {
            System.out.println(nombre + " no tiene arma de defensa y recibe el ataque completo.");
            restarSalud(danioRecibido);
            return; // Terminamos aquí, ya que no hay defensa.
        }

        // 3) MITIGAR EL DAÑO SI TENEMOS DEFENSA.
        int danioMitigado = danioRecibido - armaDefensa.getValorDefensa();

        if (danioMitigado < 0) {
            danioMitigado = 0; // Evitamos que el daño se vuelva negativo
        }

        System.out.println(nombre + " se defiende con " + armaDefensa.getNombreArma() + ", reduciendo el daño a " + danioMitigado);

        // 4) APLICAMOS EL DAÑO RESTANTE A LA NAVE.
        restarSalud(danioMitigado);

    }



}
