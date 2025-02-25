package pojo;

abstract class SuperHero { // LA CLASE SERÁ ABSTRACTA PORQUE TENDRÁ MÉTODOS ABSTRACTOS QUE IMPLEMENTARÁN LOS DEMÁS SUPERHÉROES
    // INSTANCIAREMOS LOS SUPERHEROES

    //ATRIBUTOS
    protected String nombre;
    protected String vida;
    protected String danio;
    protected String defensa;

    // CONSTRUCTOR

    public SuperHero(String nombre, String vida, String danio, String defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.danio = danio;
        this.defensa = defensa;
    }

    // MÉTODOS ABSTRACTOS - LOS SUPERHEROES DEBERÁN IMPLEMENTARLOS
    public abstract void atacar();
    public abstract void defender();

    // GETTER AND SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVida() {
        return vida;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }

    public String getDanio() {
        return danio;
    }

    public void setDanio(String danio) {
        this.danio = danio;
    }

    public String getDefensa() {
        return defensa;
    }

    public void setDefensa(String defensa) {
        this.defensa = defensa;
    }

    // TO STRING
    @Override
    public String toString() {
        return "SuperHero{" +
                "nombre='" + nombre + '\'' +
                ", vida='" + vida + '\'' +
                ", danio='" + danio + '\'' +
                ", defensa='" + defensa + '\'' +
                '}';
    }
}

