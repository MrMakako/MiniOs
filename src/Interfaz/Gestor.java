/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Diego Carcamo
 */
public interface Gestor {
    
    void ActionGuardar();
    
    void Abrir();
    
    
    default FileInputStream OpenTxT(File ruta) {
        if(ruta.exists()){
        
            
            
        try{
            
            
            FileInputStream input= new FileInputStream(ruta.getAbsolutePath());

            return input;
        
        
        }catch(Exception e){
            
            
            
        
        
             }
        
        
        
        
        }
        return null;
    }
    

    
    
        
        
    
    
    
    
    
    void Cerrar();
    
    void Eliminar();
    
}
