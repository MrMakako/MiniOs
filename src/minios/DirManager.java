/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minios;
    
    
    import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Diego Carcamo
 */
public class DirManager {
    
    
    
    File Carpeta;
    
    
    FileUtils manager;
    
    
    


    public DirManager(File ruta) {
        
        
        manager= new FileUtils();
        
        this.Carpeta=ruta;
        
        
        
        
        
        
        
        
        
        
    }

    public File getCarpeta() {
        return Carpeta;
    }
    
    
    
    
    
    
    public boolean Atras(){
        
        
        File CarpetaAnterior= new File(Carpeta.getParent());
        
        if(!CarpetaAnterior.getName().equals("Z")){
            
            
            Carpeta=CarpetaAnterior;
            
            return true;
        
        
        
        
        }
        
        
        return false;
    
    
    
    
    
    
    }
    
    
    
    public boolean BorrarCarpeta(String nombre) throws IOException{
       
        
        File Erase= new File(Carpeta.getPath()+"//"+nombre);
        
        
        
        if(Erase.exists() && Erase.isDirectory()){
            
            
           FileUtils.deleteDirectory(Erase);
            
            
            
            
           return true;
        
        }
        
        
        return false;
    
    
    }
    
    
    public ArrayList<File> ListarDirs(String ruta){
        
        File Dir = new File(ruta);
        ArrayList<File>Items= new ArrayList<>();
        
        for(File item:Dir.listFiles()){
            if(item.isDirectory()){
                Items.add(item);
            
            
            
            }
            
            
        
            
        
        
        
        }
        
        
        return Items;
        
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public boolean ElejirCarpeta(String nombre){
      //Si la carpeta exite en el directorio actua;
      File CarpetaSelec=new File(Carpeta.getPath()+"//"+nombre);
       if(CarpetaSelec.exists()){
           
           Carpeta=CarpetaSelec;
           
           return true;
       
       
       }
       
       
       
       return false;
    
        
    
    
    
    
    
    }
    
    
   
    
    
    
    public boolean CrearCarpeta(String Nombre){
        
        File newC= new File(Carpeta.getAbsolutePath()+"//"+Nombre);
        
        
        if(!newC.exists()){
            
            
            
            return newC.mkdirs();
            
        
        
        }
        
        return false;
        
        
       
    
    
    
    
    
    
    }
    
    
 
   
    
    
    
    
    
    
    
    
    
    
}
