package Jak3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class AdminProgreso extends Thread {

    private JProgressBar barra;
    private JProgressBar barra2;
    private int AtaqueJak;
    private int AtaqueCiber;
    private JLabel jLabel_VidaJak;
    private JLabel jLabel_VidaCiber;
    private boolean avanzar;
    private boolean vive;
    private JFrame ganaste;
    private JFrame perdiste;
    private JLabel jLabel_Nombre;
    private JLabel jLabel_NBatalla;

    public AdminProgreso(JProgressBar barra, JProgressBar barra2, int AtaqueJak, int AtaqueCiber, JLabel jLabel_VidaJak, JLabel jLabel_VidaCiber) {
        this.barra = barra;
        this.barra2 = barra2;
        this.AtaqueJak = AtaqueJak;
        this.AtaqueCiber = AtaqueCiber;
        this.jLabel_VidaJak = jLabel_VidaJak;
        this.jLabel_VidaCiber = jLabel_VidaCiber;
        this.avanzar = true;
        this.vive = true;
    }

    public JFrame getGanaste() {
        return ganaste;
    }

    public void setGanaste(JFrame ganaste) {
        this.ganaste = ganaste;
    }

    public JFrame getPerdiste() {
        return perdiste;
    }

    public void setPerdiste(JFrame perdiste) {
        this.perdiste = perdiste;
    }

    public JLabel getjLabel_Nombre() {
        return jLabel_Nombre;
    }

    public void setjLabel_Nombre(JLabel jLabel_Nombre) {
        this.jLabel_Nombre = jLabel_Nombre;
    }

    public JLabel getjLabel_NBatalla() {
        return jLabel_NBatalla;
    }

    public void setjLabel_NBatalla(JLabel jLabel_NBatalla) {
        this.jLabel_NBatalla = jLabel_NBatalla;
    }

    public JProgressBar getBarra2() {
        return barra2;
    }

    public void setBarra2(JProgressBar barra2) {
        this.barra2 = barra2;
    }

    public int getAtaqueJak() {
        return AtaqueJak;
    }

    public void setAtaqueJak(int AtaqueJak) {
        this.AtaqueJak = AtaqueJak;
    }

    public int getAtaqueCiber() {
        return AtaqueCiber;
    }

    public void setAtaqueCiber(int AtaqueCiber) {
        this.AtaqueCiber = AtaqueCiber;
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
    public void run() {
        int count = 0;
        while (vive) {
            while (avanzar) {
                try {
                    barra2.setValue(barra2.getValue() - AtaqueJak);
                    barra.setValue(barra.getValue() - AtaqueCiber);
                    jLabel_Nombre.setText("Carro de Jak vs Carro Malvado de Ciber Errol");
                    jLabel_NBatalla.setText("Batalla Inicial");

                    if (barra2.getValue() <= 0) {
                        vive = false;
                        ganaste.pack();
                        ganaste.setLocationRelativeTo(barra);
                        ganaste.setVisible(true);
                        break;
                    }

                    if (barra.getValue() <= 0) {
                        vive = false;
                        perdiste.pack();
                        perdiste.setLocationRelativeTo(barra);
                        perdiste.setVisible(true);
                        break;
                    }

                    if (count == 2) {
                        jLabel_Nombre.setText("Jak vs Ciber Errol");
                        jLabel_NBatalla.setText("Batalla Final");
                        barra.setValue(barra.getValue() - AtaqueCiber);
                        count = 0;
                        if (barra.getValue() <= 0) {
                            vive = false;
                            perdiste.pack();
                            perdiste.setLocationRelativeTo(barra);
                            perdiste.setVisible(true);
                            break;
                        }
                    }

                    Thread.sleep(500);
                    count++;

                } catch (InterruptedException ex) {
                }
            }
        }
    }

}
