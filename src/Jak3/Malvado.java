
package Jak3;

import java.util.Random;


public class Malvado extends Carros {

    public Malvado(int velocidad, double derrape, String nombre, double ataque, int vida) {
        super(velocidad, derrape, nombre, ataque, vida);
    }

    public Malvado() {
    }
    
    public int addVida(){
       Random r = new Random();
       return (super.getVida() + r.nextInt(5000-1000) + 1000);
    }
    
    public double addAtaque(){
       Random r = new Random();
       return (super.getAtaque() + r.nextInt(700-300) + 300);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

}
