/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minios;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author Diego Carcamo
 */
public abstract class User implements Serializable{
    
    
    String nombre;
    String Password;
    File Dir;

    public User(String nombre, String Password, File dir) {
        this.nombre = nombre;
        this.Password = Password;
        this.Dir=dir;
        
        
        
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return Password;
    }

    public File getDir() {
        return Dir;
    }
    
    
   
    
    
  
    
    
     
    
}
