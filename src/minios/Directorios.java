/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystems;

/**
 *
 * @author Diego Carcamo
 */
public class Directorios {
    //Esa puede usarse para guardar en otros directoios a parte solo el z// Mer refiero a cosas de las carpetas de Z
    
    
    
    String Dir;
    File Arhcivo;
    
    ArrayList<File> Rutas;
    //Este arraylist de rutas se guarda en la carpeta Z solo el admin puede acceder a el 

    public Directorios() {
        
        
        Rutas= new ArrayList<>();
        Dir="Z";
        
        Arhcivo=null;
        
        
        
        
    }
    
    
    
    
    

    public Directorios(String Dir,File arch) {
        //Estan de este poe qye se neceistarra !!!!!!
        
        this.Dir=Dir;
        Arhcivo=arch;
        Rutas= new ArrayList<>();
        
        
        
    }

   

    public String getDir() {
        return Dir;
    }

    
    
    
    
    public boolean Existe(File e){
       File  Arhcivo= e;
       if(e.exists()){
           
           return true;
       
       
       
       
       }else{
           return false;
       
       
       }
    
    
    
    }

    public File getArhcivo() {
        return Arhcivo;
    }

    public void setArhcivo(String FileName) {
        
        this.Arhcivo= new File(Dir+"\\"+FileName);
    }
    
    
    

 
    
    
    
    public void setRuta(String Ruta){
        Dir=Ruta;
    
    
    
    }
    
    public void AddDirectorio(){
       if(!Arhcivo.exists()){
           Rutas.add(new File(Dir));
       
       
       }
        
        
    
    }
    
  
    
 
    
    
    public void Guardar(Object x,String FileName){
        try{
            
            
            Arhcivo=new File(Dir+"\\"+FileName);
            ObjectOutputStream Guardado=  new ObjectOutputStream(new FileOutputStream(Arhcivo.getAbsolutePath()));
            System.out.println("Intenando guardar");
            //Guardar Caulquier objeto Este se usara 
            Guardado.writeObject(x);
            
            Guardado.close();
            System.out.println("Guardado");
        
        
        }catch(Exception e){
            
            System.out.println("No se a podido guardar");
            
        
        
        }
        
    
    }
    
    
    
    
    
    
    
    
    public Object Leer(String nombreArchivo) throws ClassNotFoundException,IOException{
        Arhcivo= new File(nombreArchivo);
        
        ObjectInputStream leido= new ObjectInputStream(new FileInputStream(Arhcivo.getAbsolutePath()));
        
        
        
         return leido.readObject();
    
    
    
    
    }
    
    public ArrayList<User> LeerListaUsuarios() throws ClassNotFoundException,IOException{
        return ((ArrayList<User>) Leer("Z\\Users.soup"));
        
        
    
    
    
    }
    
    
    
    
    
    
    
    
    
    public void Leer(Object Lista) throws IOException{
        ObjectOutputStream Guardado= new ObjectOutputStream(new FileOutputStream(Dir));
      
        Guardado.writeObject(Lista);
        Guardado.close();
        
    
    
    }
    
    
    
    public void AddRuta(String ruta){
        
        Rutas.add(new File(ruta));
        
        
        
        
    
    
    }
    
    public File BuscarRuta(File Ruta){
        for (File p:Rutas){
            if(p.equals(Ruta))
                return p;
                
                
        
        }
        
        return null;
    
    }
    
    
    public void BorrarRuta(){
        BorrarRuta(Arhcivo);
        //Borrar el arhivo o carpeta Actual actual
    
    
    
    }
    
    public void BorrarRuta(File Ruta){
        if(Ruta.exists()){
             System.out.println("Se Borro la ruta "+Ruta.getAbsolutePath());
            Rutas.remove(BuscarRuta(Ruta));
           
        
        }
        
        System.out.println("No se puedo borrar la ruta :"+ Ruta.getAbsolutePath() );
        
        
        
        
       
        
    
    }
    
    
    
    
    
    
}
