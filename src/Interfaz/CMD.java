/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaz;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import minios.DirManager;


/**
 *
 * @author Diego Carcamo
 */
public class CMD extends javax.swing.JInternalFrame implements Gestor{

    /**
     * Creates new form CMD
     */
    /*
    a. Mkdir <nombre>: Nueva carpeta
b. Rm <nombre>: Eliminar carpeta
c. Cd <nombre carpeta>: Cambiar de carpeta actual
d. Cd.. Regresar de Carpeta
e. Dir: Listar todas las carpetas y archivos en la carpeta actual
f. Date: Ver fecha actual
g. Time: Ver hora actual
    */
    
    
    

    JDesktopPane desk;
    
    
 
    
    
    
    
    
    
    
    
    
    

    
    
    DirManager manage;

    String Comandos;
    
    
    public CMD (File dir,JDesktopPane desk){
        
        manage= new DirManager(dir);
        this.desk= this.desk;

        
        
        Comandos="";
        initComponents();
        
        

       
        update();
        
        
        
        
      
         
        
    }
    
    
    private void update(){
        CmdBox.setText(Comandos+"\n"+manage.getCarpeta()+"\n");
    
    }
    
    public void leer(String linea){
        Scanner sc = new Scanner(linea);
        

        
                
           sc.useDelimiter(" ");
           
           sc.tokens();
            System.out.println(sc.hasNext("Mkdir"));
        
           String command=sc.next();
           
           
          
           
          
           
           if(command.equals("Mkdir")){
               
               String nombre="";
               
               while(sc.hasNext()){
                   nombre+=sc.next()+" ";
               
               
               }
              Comandos+="\n"+ Mkdir(nombre);
              
              update();
               
               
               
               
               
               
               
           
             
           
           }else if(command.equals("Cd")){
               
               
               String nombre="";
               
               while(sc.hasNext()){
                   nombre+=sc.next()+" ";
               
               
               }
               
               Comandos+="\n"+CD(nombre);
               
               update();
               
               
           
           
               
               
               
               

           }else if(command.equals("Cd..")){
               if(CdBack()){
                   Comandos+="\nSe regreso un directorio ";
                   update();
               
               }
           
           
           }else if(command.equals("Rm")){
               
               
               
            try {
                Comandos+="\n"+Rm(sc.next());
                update();
                
               
            } catch (IOException ex) {
                Comandos+="\n"+ex.getMessage();
            }
           
           
           
           }else if (command.equals("Dir")){
           
               Comandos+="\n"+ListDir();
               update();
           
           
           }else if (command.equals("Date")){
            
               Comandos+="\n"+Date();
               
               update();
           
           
           }else if(command.equals("Time")){
               
               Comandos+="\n"+Time();
               update();
               
           
           
           
           }
     
           
          
           
          
           
           
        
        
        
        
        
        
        
        
        
        
        
        //es que vamso a detectar las comas y leer solo desde las comas tambien 
        
       //
        
        
        
        
    
    
    
    }
    
    
    public String  Date(){
        Calendar date= Calendar.getInstance();
        
        
        Date fecha= date.getTime();
        
        
        SimpleDateFormat f= new SimpleDateFormat("EEE, d MMM yyyy");

            return f.format(fecha);
       
  
    
    
    
    }
    
    
    
    public String Time(){
         Calendar date= Calendar.getInstance();
        
        
             Date fecha= date.getTime();
        
        
            SimpleDateFormat f= new SimpleDateFormat("K:mm a, z");

            return f.format(fecha);
       
  
    
    
        
    
    }
    
    
    
    public String Rm(String nombre) throws IOException{
    
        if( manage.BorrarCarpeta(nombre)){
            
            
            return "Se Elimino el directorio "+ manage.getCarpeta().getPath()+"\\"+nombre;
        
        
        
        }
        
        
        return "No se puede borrar el directorio "+ manage.getCarpeta().getPath()+"\\"+nombre;
    
    
    
    }
    
    
    public String CD(String Nombre){
        
            System.out.println("Cambiando de carpeta");
               
            if(manage.ElejirCarpeta(Nombre)){
            
            
                
                   
                 return "Esta Carpeta Existe";
            
            
            
            }
       
               
            return "Esta Carpeta no existe";
        
    
    
    
    
    
    }
    
    
    public  boolean CdBack(){
        
        
        return manage.Atras();
        
        
        
    
    
    
    
    
    }
    
    
    public String ListDir(){
        
        String Carpetas="";
        
        
        ArrayList<File>Items=manage.ListarDirs(manage.getCarpeta().getPath());
        for(File item:Items){
        
            Carpetas+=item.getPath()+"\t\tSize:"+item.getTotalSpace()+"\n";
            
            
            
        
        
        }
        
        
        return Carpetas;
        
        
        
    
    
    }
    
    
    
    
    
    public String Mkdir(String nombre){
        
        
        if(manage.CrearCarpeta(nombre)){
            
            return "Se creo el directorio ";
        
        
        
        
        
        }
        
        return "No se pudo crear el directorio en "+manage.getCarpeta().getPath();
    
    
    
    
    
    
    }
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CmdLine = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CmdBox = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        CmdBox.setEditable(false);
        CmdBox.setBackground(new java.awt.Color(0, 0, 0));
        CmdBox.setColumns(20);
        CmdBox.setForeground(new java.awt.Color(255, 255, 255));
        CmdBox.setRows(5);
        jScrollPane1.setViewportView(CmdBox);

        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(CmdLine)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmdLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        leer(CmdLine.getText());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CmdBox;
    private javax.swing.JTextField CmdLine;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void ActionGuardar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Abrir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Cerrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
