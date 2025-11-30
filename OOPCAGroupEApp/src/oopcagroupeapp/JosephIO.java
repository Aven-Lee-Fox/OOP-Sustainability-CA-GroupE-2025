/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopcagroupeapp;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Joseph Moiselle 24308453
 */
public class JosephIO implements Serializable {
    
    String Status;
    String Input;
    
    public JosephIO(String Input){
    
        this.Input = Input;
        
    }
    
    public void save(){
    
        try(ObjectOutputStream oStream = new ObjectOutputStream(new FileOutputStream("SolarStatus.txt"))){
        
            oStream.writeObject(Status);
            
        } catch (IOException e){
        
            JOptionPane.showMessageDialog(null, "Error: An Error Occured while saving file");
            
        }
        
    }
    
    public void load(){
    
        try(ObjectInputStream iStream = new ObjectInputStream(new FileInputStream("SolarStatus.txt"))){
        
           Status = iStream.readObject().toString();
 
        } catch (IOException e){
        
            JOptionPane.showMessageDialog(null, "An Error occurred while reading the file");
            
        } catch (ClassNotFoundException e){
        
           JOptionPane.showMessageDialog(null, "An Error has occurred");
            
        }
    
    }
    
}
