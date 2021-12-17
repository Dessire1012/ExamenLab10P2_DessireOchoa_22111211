
package Jak3;

import java.util.Random;

public class Salto extends Carros{
    
    private int salto;

    public Salto( int velocidad, double derrape, String nombre, int ataque, int vida) {
        super(velocidad, derrape, nombre, ataque, vida);
    }
   

    public int getSalto() {
        return salto ;
    }

    public void setSalto(int salto) {
        Random r = new Random();
        this.salto = r.nextInt(100-50) + 50;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
}
