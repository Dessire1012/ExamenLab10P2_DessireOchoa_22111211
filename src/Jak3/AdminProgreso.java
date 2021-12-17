
package Jak3;

import javax.swing.JLabel;
import javax.swing.JProgressBar;


public class AdminProgreso extends Thread{

    private JProgressBar barra;
    private JProgressBar barra2;
    private JLabel jLabel_AtaqueJak;
    private JLabel jLabel_AtaqueCiber;
    private JLabel jLabel_VidaJak;
    private JLabel jLabel_VidaCiber;
    private boolean avanzar;
    private boolean vive;


    public AdminProgreso(JProgressBar barra, JProgressBar barra2, JLabel jLabel_AtaqueJak, JLabel jLabel_AtaqueCiber, JLabel jLabel_VidaJak, JLabel jLabel_VidaCiber) {
        this.barra = barra;
        this.barra2 = barra2;
        this.jLabel_AtaqueJak = jLabel_AtaqueJak;
        this.jLabel_AtaqueCiber = jLabel_AtaqueCiber;
        this.jLabel_VidaJak = jLabel_VidaJak;
        this.jLabel_VidaCiber = jLabel_VidaCiber;
        this.avanzar = true;
        this.vive = true;
    }
    
    

    public JProgressBar getBarra2() {
        return barra2;
    }

    public void setBarra2(JProgressBar barra2) {
        this.barra2 = barra2;
    }

    public JLabel getjLabel_AtaqueJak() {
        return jLabel_AtaqueJak;
    }

    public void setjLabel_AtaqueJak(JLabel jLabel_AtaqueJak) {
        this.jLabel_AtaqueJak = jLabel_AtaqueJak;
    }

    public JLabel getjLabel_AtaqueCiber() {
        return jLabel_AtaqueCiber;
    }

    public void setjLabel_AtaqueCiber(JLabel jLabel_AtaqueCiber) {
        this.jLabel_AtaqueCiber = jLabel_AtaqueCiber;
    }

    public JLabel getjLabel_VidaJak() {
        return jLabel_VidaJak;
    }

    public void setjLabel_VidaJak(JLabel jLabel_VidaJak) {
        this.jLabel_VidaJak = jLabel_VidaJak;
    }

    public JLabel getjLabel_VidaCiber() {
        return jLabel_VidaCiber;
    }

    public void setjLabel_VidaCiber(JLabel jLabel_VidaCiber) {
        this.jLabel_VidaCiber = jLabel_VidaCiber;
    }


    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run(){
        int count = 0;
        while(vive){ 
            while(avanzar){
                try {
                    barra2.setValue(barra2.getValue()-Integer.parseInt(jLabel_AtaqueJak.getText()));
                    if (barra2.getValue() <= 0){
                        vive = false;
                        break;
                    }
                    if (count == 2){
                        barra.setValue(barra.getValue()-Integer.parseInt(jLabel_AtaqueCiber.getText()));
                        
                    }
                    
                    Thread.sleep(500);
                    count++;

                } catch (InterruptedException ex) {
                }   
            }     
        }
    }
    
    
}
