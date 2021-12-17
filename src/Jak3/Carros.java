
package Jak3;


public class Carros {
    private int velocidad;
    private double derrape;
    private String nombre;
    private int ataque;
    private int vida;

    public Carros(int velocidad, double derrape, String nombre, int ataque, int vida) {
        this.velocidad = velocidad;
        this.derrape = derrape;
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
    }

    public Carros() {
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getDerrape() {
        return derrape;
    }

    public void setDerrape(double derrape) {
        this.derrape = derrape;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Carros{" + "velocidad=" + velocidad + ", derrape=" + derrape + ", nombre=" + nombre + ", ataque=" + ataque + ", vida=" + vida + '}';
    }       
    
}
