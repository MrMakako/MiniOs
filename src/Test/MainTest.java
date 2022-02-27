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
                   + "\n2-Seleccionar Carpeta");
           
           
           option=sc.nextInt();
           
           
           if(option==1){
               
               System.out.println("Nombre de carpeta:");
               
               p.CrearCarpeta(sc.next());
           
           
           }if(option==2){
               System.out.println("Cambiar directorios raiz");
               
               p.setDirectorio(new File(sc.next()));
           
           
           
           
           }
           
           sc.next();
           
           
           
       
       
       
       }while( option!=3);
        
       
        
    
    
    
    
    }    
}
