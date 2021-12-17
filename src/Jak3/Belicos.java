
package Jak3;

import java.util.Random;


public class Belicos extends Carros{
    

    public Belicos() {
        super();
    }

    public Belicos(int velocidad, double derrape, String nombre, int ataque, int vida) {
        super(velocidad, derrape, nombre, ataque, vida);
    }

    public double VidaExtra(){
       Random r = new Random();
       return (super.getVida() + r.nextInt(100-50) + 50);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
