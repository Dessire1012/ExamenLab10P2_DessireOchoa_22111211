
package Jak3;

import java.io.Serializable;


public class Carros implements Serializable{
    private int velocidad;
    private double derrape;
    private String nombre;
    private double ataque;
    private int vida;

    public Carros(int velocidad, double derrape, String nombre, double ataque, int vida) {
        this.velocidad = velocidad;
        this.derrape = derrape;
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
    }
    
    private static final long SerialVersionUID=444L;

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

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
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
        return nombre;
    }       
    
}
