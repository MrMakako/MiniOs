/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Diego Carcamo
 */
public class Testes {
    
    
    
    
    
   File Directorio= new File("D");
   File SubDir; 
   String ruta;

    public Testes() {
        
       Directorio.mkdirs();
     
       
        
        
   
        
        
    }

    public void setDirectorio(File Directorio) throws IOException{
        this.Directorio = Directorio;
    }
    
    
    
   
   
   
   
   public void CrearCarpeta(String nombre){
       ruta= Directorio.getPath()+"\\"+nombre;
       SubDir= new File(ruta);
       
       if(Directorio.exists()){
           System.out.println("Existe el direcotiro");
           
           
            if(SubDir.mkdirs()){
                System.out.println("Se creo");
        
            }
       
       }
      
       
       
        
       
       
   
   
   
   }
   
   
   
   
    
}
