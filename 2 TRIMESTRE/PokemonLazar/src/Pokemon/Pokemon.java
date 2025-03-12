package Pokemon;

import java.util.ArrayList;

public abstract class Pokemon {

    protected String nombre;
    protected int salud;
    protected final int SALUD_MAX=100;
    ArrayList<MovimientoAtaque> listMov;
    protected Objeto objectoEquipado;


    public Pokemon(String nombre) {
        this.nombre = nombre;
        this.listMov=new ArrayList<>();
    }

    public void atacar(Pokemon objetivo){
        if (listMov != null){
            MovimientoAtaque movimientoAtaque=listMov.get(0);
            objetivo.defender(20);
        }
    }

    public void defender(int danio){
        salud=salud-danio;
        if (salud<0) salud=0;

    }

    public void usarObjeto(){
       objectoEquipado.usar(this);
    }

    public boolean estaVivo(){
        if (salud<0){
            System.out.println("Esta vivo co");
            return true;
        }else {
            System.out.println("Esta muerto co");
            return false;

        }
    }

    public void agregarMovimiento(MovimientoAtaque mov){
        listMov.add(mov);
        System.out.println("CO");
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", salud=" + salud +
                ", SALUD_MAX=" + SALUD_MAX +
                ", listMov=" + listMov +
                ", objectoEquipado=" + objectoEquipado +
                '}';
    }
}
