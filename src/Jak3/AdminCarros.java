
package Jak3;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class AdminCarros {
      private ArrayList <Carros> listaCarros = new ArrayList();
    private File archivo = null;

    public AdminCarros(String path) {
        archivo = new File(path);
    }

    public ArrayList<Carros> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(ArrayList<Carros> listaCarros) {
        this.listaCarros = listaCarros;
    }

    
     public void addListaCar(Carros car) {
        this.listaCarros.add(car);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
    public void cargarArchivo() {
        try {            
            listaCarros = new ArrayList();
            Carros temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Carros) objeto.readObject()) != null) {
                        listaCarros.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
           
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Carros c : listaCarros) {
                bw.writeObject(c);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
