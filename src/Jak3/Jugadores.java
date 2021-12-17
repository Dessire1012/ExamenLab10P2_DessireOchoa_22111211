
package Jak3;


public class Jugadores {
    private String nombre;
    private int vida;
    private int ataque;

    public Jugadores() {
    }

    public Jugadores(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + '}';
    }
    
    
    
}
