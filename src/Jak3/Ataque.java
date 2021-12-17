
package Jak3;

import java.util.Random;


public class Ataque extends Carros {

    public Ataque(int velocidad, double derrape, String nombre, double ataque, int vida) {
        super(velocidad, derrape, nombre, ataque, vida);
    }

    public Ataque() {
    }
    
    public double ataqueExtra(){
       Random r = new Random();
       return (super.getAtaque() + (0.50 + (0.100 - 0.50) * r.nextDouble()));
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
