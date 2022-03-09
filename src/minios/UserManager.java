/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.PasswordAuthentication;
import java.util.RandomAccess;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Carcamo
 */



public class UserManager {
    File ruta;
    
    RandomAccessFile Users;
    
    
    String loged;
    
    
    
    
    


    public UserManager() {
       ruta= new File("User");

       
       if(!ruta.exists()){
           ruta.mkdir();
           System.out.println("Creadno Arhcivos");
           CreateFile();
       
       }else{
       
           try {
               Users= new RandomAccessFile(new File(ruta.getName()+"//Users.soup"),"rw");
           } catch (FileNotFoundException ex) {
               
           }
       
       
       }
       
       
       
       
       
       
    
    
    }
    
    
    public void CrearCarpetas(String UserName){
         String Carpetas[]={"Mis Documentos","Musica","Mis Imagenes"};
            
             File SubDir;
           for(String tag:Carpetas){
              SubDir = new File("Z\\"+UserName+"\\"+tag);
              if(SubDir.mkdirs()){
                  System.out.println("Se creo "+tag);
              
              }
              
              
                
            
            }
           
    
    
    
    }
    
    
    
    
    
    
    public void logout(){
        loged=null;
    
    
    
    
    }
    
    
    public String UserExist(String UserName) throws IOException{
        
        
         Users.seek(0);
        
        while(Users.getFilePointer()<Users.length()){
             String name= Users.readUTF();
             long pos= Users.getFilePointer();
             Users.readUTF();
             
             
             if(name.toLowerCase().equals(UserName.toLowerCase())){
                 Users.seek(pos);
                 System.out.println(name);
                 return name;
             }

        }
        
        
        return null;
        
        
        
    
    
    
    
    
    
    }
    
    
    public boolean login(String name,String Password) throws IOException{
        String UserName=UserExist(name);
        if(UserName!=null){
            String password= Users.readUTF();
            
            if(password.equals(Password)){
                
                loged=UserName;
                System.out.println(UserName);
                //Para que me retorne el nombre correcto
                return true;
                
               
                
            }
            
            
           
        
        
        }
         return false;
    
    
    
    
    
    
    
    }

    public String getLoged() {
        return loged;
    }
    
    
    
    
    
    
    
    public boolean AddUser(String name, String password) throws IOException{
    //Username String
        if(UserExist(name)==null){
            Users.seek(Users.length());
            
            
            Users.writeUTF(name);
            Users.writeUTF(password);
            
            
            return true;
            
            
           
        
            
        
        }
        
        
        return false;
    
   
    
    
    
    

    }
    
    public void CreateFile(){
        try{
            
            if(ruta.exists()){
            Users= new RandomAccessFile(new File(ruta.getName()+"//Users.soup"),"rw");
            
            
            
        
        
        
        }
        
        
        
        
        }catch(Exception e){
            
            System.out.println("Se creo el directorio Users.soup");
        
        
        
        }
        
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
}
