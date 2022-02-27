/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minios;

import java.io.File;
import java.util.ArrayList;
import java.io.IOException;

/**
 *
 * @author Diego Carcamo
 */
public class BaseDatos {
    
    
    
    ArrayList<Directorios>Lista_Dir;
    ArrayList<User> ListaUsuarios;
    File rootDir;
    Directorios Acces;

    public BaseDatos() {
        Acces=new Directorios();
        
        Lista_Dir= new ArrayList<>();
        ListaUsuarios= new ArrayList<>();


        rootDir= new File("Z");
        Acces.setRuta(rootDir.getAbsolutePath());
          
          
        
        if(!Acces.Existe(new File(Acces.getDir()+"\\Users.soup"))){
           
           
             Acces.Guardar(ListaUsuarios, "Users.soup");
             System.out.println("creando Soup");
        
        
        
        
        
        
        }else{
            try{
                
                 
                System.out.println("Soup Ecnontrado");
                 ListaUsuarios=Acces.LeerListaUsuarios();
        
            
            
            }catch(Exception e){
                System.out.println("No se pude cargar");
            
            }
            
        
        
        }
        
        System.out.println(ListaUsuarios);
      
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    public User BuscarUsuario( String Password,String UserName){
        for(User u:ListaUsuarios){
            if(u.getPassword().equals(Password)&& u.getPassword().equals(UserName)){
                return u;
            
            }
        }
        return null;
    
    
    }
    
    
    public void CrearCarpetas(String UserName)throws IOException{
        File Ruta= new File(rootDir.getAbsolutePath()+"\\"+UserName);
        
        
        if(Ruta.mkdirs()){
            System.out.println("Creando Carpetas");
             
           
            
        
        }
    
    
    
    }
    
      
    public User Verify( String Password,String UserName){
        for(User u:ListaUsuarios){
            if(u.getNombre().equals(UserName)&& u.getPassword().equals(Password)){
                return u;
            
            }
        }
        return null;
    
    
    }
    
    public void CrearUsuario(String UserName,String Password,File Dir){
      if(BuscarUsuario(Password,UserName)==null){
          ListaUsuarios.add(new UsuarioNormal(UserName,Password,Dir));
           String Carpetas[]={"Mis Documentos","Musica","Mis Imagenes"};
            
             File SubDir;
           for(String tag:Carpetas){
              SubDir = new File(rootDir+"\\"+UserName+"\\"+tag);
              if(SubDir.mkdirs()){
                  System.out.println("Se creo "+tag);
              
              }
              
              
                
            
            }
           
           
           Acces.Guardar(ListaUsuarios, "Users.soup");
          
          
       }else{
          System.out.println("No se pudo crear");
      }
        
        
        
    
    
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
}
