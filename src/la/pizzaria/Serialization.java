
package la.pizzaria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Serialization {

    
    public static void write(Object data, String filename) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            
            fos = new FileOutputStream(filename); //arquivo de saida (nome do arquivo como parametro)
            oos = new ObjectOutputStream(fos); //objeto de saida
            oos.writeObject(data);
            
            oos.close();
            fos.close();
            
            
        } catch (FileNotFoundException ex) { //tratamento de erros
            Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            oos.close();
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public static Object read(String filename){ //leitura do arquivo 
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            
            fis = new FileInputStream(filename); //arquivo de entrada
            ois = new ObjectInputStream(fis); //objeto de entrada 
            Object obj = ois.readObject();
            
            ois.close();
            fis.close();
            
            return obj;
            
            
        } catch (FileNotFoundException ex) { //tratamento de erros
            Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            ois.close();
            fis.close();
        } catch (IOException ex) {
            Logger.getLogger(Serialization.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
