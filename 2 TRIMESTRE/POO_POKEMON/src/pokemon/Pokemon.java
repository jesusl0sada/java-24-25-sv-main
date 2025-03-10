package pokemon;

import interfaces.IAtaque;
import interfaces.IDefensa;
import movimiento.Movimiento;
import movimiento.MovimientoAtaque;
import movimiento.MovimientoDefensa;

import java.util.ArrayList;

public abstract class Pokemon implements IAtaque, IDefensa {

    protected String nombre;
    protected int nivel;
    protected int salud;
    protected static final int SALUD_MAX = 300;

    // Guarda ataque/defensa en la misma lista
    protected ArrayList<Movimiento> listaMovimientos = new ArrayList<>();

    // Constructor mínimo
    public Pokemon(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = SALUD_MAX; // Empieza siempre con salud máxima
    }

    // Métodos de IAtaque / IDefensa
    @Override
    public void atacar(Pokemon oponente) {
        // Buscamos la primera habilidad de ataque
        MovimientoAtaque movAtaque = getPrimerMovimientoAtaque();
        if (movAtaque == null) {
            System.out.println(nombre + " NO PUEDE ATACAR, no tiene movimientos de ataque.");
            return;
        }

        int danioAtaque = getPrimerMovimientoAtaque().getDanio();

        // Anunciamos el ataque
        if (this instanceof PokemonAgua && oponente instanceof PokemonFuego){
            System.out.println("Debilidad de tipo activada");
            int danioAtaqueduplicado = danioAtaque*2;
            System.out.println("Le has pegado : " + danioAtaqueduplicado);

        }
        System.out.println(nombre + " ataca a " + oponente.nombre
                + " con " + movAtaque.getNombreMovimiento());
        // El oponente se defiende
        oponente.defender(movAtaque);
    }

    @Override
    public void defender(MovimientoAtaque movAtaque) {
        // Buscamos la primera habilidad de defensa
        MovimientoDefensa movDefensa = getPrimerMovimientoDefensa();
        if (movDefensa == null) {
            // Sin defensa, recibimos el daño completo
            System.out.println(nombre + " no tiene defensa, recibe TODO el daño.");
            restarSalud(movAtaque.getDanio());
        } else {
            // Aplicamos defensa (muy simple: restamos el valor de defensa al daño)
            System.out.println(nombre + " se defiende con " + movDefensa.getNombreMovimiento());
            int dmg = movAtaque.getDanio() - movDefensa.getValorDefensa();
            if (dmg < 0) dmg = 0;  // no puede ser negativo
            restarSalud(dmg);
        }
    }

    // Métodos mínimos para la lista de movimientos
    public void agregarMovimiento(Movimiento mov) {
        listaMovimientos.add(mov);
    }

    protected MovimientoAtaque getPrimerMovimientoAtaque() {
        for (Movimiento m : listaMovimientos) {
            if (m instanceof MovimientoAtaque) {
                return (MovimientoAtaque) m;
            }
        }
        return null;
    }

    protected MovimientoDefensa getPrimerMovimientoDefensa() {
        for (Movimiento m : listaMovimientos) {
            if (m instanceof MovimientoDefensa) {
                return (MovimientoDefensa) m;
            }
        }
        return null;
    }

    // Para reducir salud sin que baje de 0
    public void restarSalud(int cantidad) {
        salud -= cantidad;
        if (salud < 0) {
            salud = 0;
        }
        System.out.println(nombre + " queda con " + salud + "/" + SALUD_MAX + " de salud.");
    }

    // Saber si el Pokémon sigue vivo
    public boolean estaVivo() {
        return salud > 0;
    }

    // toString mínimo
    @Override
    public String toString() {
        return "Pokemon " + nombre
                + " (nivel=" + nivel
                + ", salud=" + salud + "/" + SALUD_MAX + ")";
    }

    public abstract void ataqueEspecial(Pokemon oponente);
}
