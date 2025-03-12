package PERSONAJES;

import ARMA.Arma;
import ARMA.Escudo;
import ARMA.Lanza;
import INTERFACES.IAtaque;
import INTERFACES.IDefensa;

import java.util.ArrayList;
import java.util.Random;

public abstract class Guerrero implements IAtaque, IDefensa {

    //ATRIBUTOS

    protected String nombre;
    protected int salud;
    protected final int SALUD_MAX = 150;
    ArrayList<Arma> listaArmas = new ArrayList<>(); // DECLARACIÓN E INICIALIZACIÓN DEL ARRAYLIST
    protected Escudo escudo; // OSEA TODOS LOS GUERREROS TIENEN ESCUDO.


    // CONSTRUCTOR

    public Guerrero(String nombre) {
        this.nombre = nombre;
        this.salud = SALUD_MAX;
    }


    // MÉTODOS PROPIOS

    public void addArma(Arma arma){
        if (listaArmas.contains(arma)){
            System.out.println("Este arma ya está en el arraylist");
        }else{
            System.out.println("Arma añadida");
            listaArmas.add(arma);
        }
    }

    public void equiparEscudo(Escudo escudo){
        System.out.println("Equipando el escudo...");
        this.escudo = escudo;
        System.out.println("Escudo equipado: " + escudo.getNombre());  // HAY VARIOS ESCUDOS EQUIPAMOS UNO Y MOSTRAMOS SUS DETALLES
    }

    public void imprimirArma(){ // RECORREMOS EL ARRAYLIST Y LO IMPRIMIMOS
        for (Arma listaArma : listaArmas) {
            System.out.println("Arma: " + listaArma.toString());
        }
    }

    public void mostrarEscudo(){ //MOSTRAMOS LOS DETALLES DEL ESCUDO , MAS DE LO DE ARRIBA
        System.out.println("El escudo que cargas tiene los siguientes detalles: ");
        System.out.println(escudo.getResistencia());
        System.out.println(escudo.getNombre());

    }


    public void seleccionarArmaAtaque(){
            if (listaArmas.isEmpty()) {
                System.out.println(nombre + " no tiene armas para atacar.");
                return;
            }

            // Seleccionar un arma aleatoria
            Random random = new Random();
            Arma armaSeleccionada = listaArmas.get(random.nextInt(listaArmas.size()));

            // Mostrar el arma seleccionada
            System.out.println(nombre + " ha seleccionado el arma: " + armaSeleccionada.getNombreArma() + " (Potencia: " + armaSeleccionada.getPotencia() + ")");
        }

    public void restarSalud(int dmg){
        if (estavivo()){
            salud = salud - dmg;
        }
    }

    public boolean estavivo(){
        if (salud > 0){
            System.out.println("El personaje sigue vivo");
            return true;
        }else {
            System.out.println("El personaje está muerto");
            return false;
        }
    }

    public void imprimirEstado(){
    if (estavivo()){
        System.out.println(" El personaje " + nombre +  "ha quedado con " + salud +  " vida ");
    }else{
        System.out.println(" El personaje está muerto " + nombre + " tiene 0 de vida ");
    }
    }

    public void ataqueEspecial(Guerrero objetivo){
        int dmg = 0;
        System.out.println("Se va a ejecutar el ataque especial genérico");
        objetivo.restarSalud(dmg);
    }


    //TO STRING

    @Override
    public String toString() {
        return "Guerrero{" +
                "nombre='" + nombre + '\'' +
                ", salud=" + salud +
                ", listaArmas=" + listaArmas +
                '}';
    }


    // MÉTODOS HEREDADOS -> DE LAS INTERFACES


    @Override
    public void atacar(Guerrero objetivo) {
        if (listaArmas.isEmpty()) {
            System.out.println(nombre + " no tiene armas para atacar.");
            return;
        }

        // Seleccionar arma de ataque ya implementado
        Arma armaSeleccionada = listaArmas.get(new Random().nextInt(listaArmas.size()));

        System.out.println(nombre + " ataca a " + objetivo.nombre + " con " + armaSeleccionada.getNombreArma());

        int danioFinal = armaSeleccionada.getPotencia();

        // Modificadores con instanceof
        if (this instanceof Arquero && objetivo instanceof Espadachin) {
            danioFinal *= 2;
            System.out.println("¡El Arquero tiene ventaja contra el Espadachín! Daño x2.");
        }

        if (this instanceof Caballero && armaSeleccionada instanceof Lanza) {
            System.out.println("¡El Caballero ignora los escudos con su lanza!");
            objetivo.restarSalud(danioFinal);
            return; // Se omite la defensa
        }

        // Llamar directamente a defender
        objetivo.defender(armaSeleccionada, danioFinal);
    }


    @Override
    public void defender(Arma arma, int danioRecibido) {
        if (escudo == null) {
            System.out.println(nombre + " no tiene escudo y recibe " + danioRecibido + " puntos de daño.");
            restarSalud(danioRecibido);
            return;
        }

        int danioMitigado = Math.max(0, danioRecibido - escudo.getResistencia());

        System.out.println(nombre + " bloquea parte del daño con " + escudo.getNombre() +
                ", reduciendo el daño a " + danioMitigado);

        restarSalud(danioMitigado);
    }


    }


