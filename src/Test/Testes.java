/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Diego Carcamo
 */
public class Testes {

    File Directorio = new File("D");
    File SubDir;
    String ruta;

    ArrayList<File> Rutas;

    public Testes() {

        Directorio.mkdirs();

        Rutas = new ArrayList<>();

    }

    public void setDirectorio(File Directorio) throws IOException {

        this.Directorio = Directorio;
    }

    public File getDirectorio() {
        return Directorio;
    }

    public void UpFicheros(File Carpeta) {

        for (File item : Carpeta.listFiles()) {

            System.out.println(item.getName());

            Rutas.add(item);

        }

    }

    public void Navegar(File Carpeta) {

    }

    public void CrearCarpeta(String nombre) {
        ruta = Directorio.getPath() + "\\" + nombre;
        SubDir = new File(ruta);

        if (Directorio.exists()) {
            System.out.println("Existe el direcotiro");

            if (SubDir.mkdirs()) {
                System.out.println("Se creo");

            }

        }

    }

    public void MostrarCarpetas() {

        File Dir = new File(Directorio.getAbsolutePath());
        if (Dir.exists() && (!Dir.isFile())) {
            for (File e : Dir.listFiles()) {
                System.out.println(e.getAbsolutePath());

            }

        }

    }
    
    
    
    public boolean borrar(){
       
        if(Directorio.exists()){
            
            
            
            
            
            
           
            if(Directorio.delete()){
                    System.out.println("Se borro el fichero "+ Directorio.getPath());
                    
                    
                    
                    
            
            }
            
            return true;
        }else{
            return false;
            
            
        
        }
        
        
        
            
            
    
    
    
    }

}
