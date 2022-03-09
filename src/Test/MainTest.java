/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Diego Carcamo
 */
public class MainTest {
    
    
    
    
    public static void main(String args[]) throws IOException{
    
        Scanner sc= new Scanner(System.in);
        Testes p = new Testes();
        int option=0;
        
        
       do{
           
           System.out.println("1-Crear Carpeta"
                   + "\n2-Seleccionar Carpeta"
                   + "\n3-Ver Contenidos");
           
           
           option=sc.nextInt();
           
           
           if(option==1){
               p.MostrarCarpetas();
               System.out.println("Nombre de carpeta:");
               
               p.CrearCarpeta(sc.next());
           
           
           }if(option==2){
               p.MostrarCarpetas();
               System.out.println("Cambiar directorios raiz");
               
               p.setDirectorio(new File(sc.next()));
           
           
           
           
           }else if(option ==3){
               
               if(p.getDirectorio().exists()){
                    p.MostrarCarpetas();
                      System.out.println("Archivos dentro de d");
               
               
               
               
               }
               
  
           
           }else if(option ==4){
               System.out.println("La borraste mi bro");
               
               p.borrar();
               p.setDirectorio(new File("D"));
               
               
           
           
           }           
        
           
           
           
       
       
       
       }while( option!=5);
        
       
        
    
    
    
    
    }    
}
