/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import java.io.File;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Diego Carcamo
 */
public class ExploradorES extends javax.swing.JPanel {

    /**
     * Creates new form ExploreadoEs
     */
    
    
    public ExploradorES(File Ruta) {
        
        initComponents();
        Actualizar(Ruta);
        
    }

    public JTree getArbol() {
        return Arbol;
    }
    
    
    
    
   public void CrearArbol(File Ruta,DefaultMutableTreeNode model){
            System.out.println("Creando Arbol");
            
                //Casos donde la recurisvidad es util
            
            for (File items:Ruta.listFiles()){
                System.out.println("ELements");
                
                if(!items.isFile()){
                    model.add(new DefaultMutableTreeNode(items.getName()));
                    
                    CrearArbol(items,model.getNextNode());
                
                }else{
                    
                     model.add(new DefaultMutableTreeNode(items.getName()));
                
                
                
                }
                
            
                
                
            
            
            
            
        
        
             }
             
        
    
    
    
    
    }
   
        
        
    public void ClickDerecho(java.awt.event.MouseEvent evt ){
    
       MenuEs.show(Arbol, evt.getX(), evt.getY());
        
    
    
    
    }
    
    
    public void Actualizar(File ruta){
        DefaultMutableTreeNode Raiz= new DefaultMutableTreeNode(ruta.getName());
        DefaultTreeModel Ramas= new DefaultTreeModel(Raiz);
        
        CrearArbol(ruta, Raiz);
        
        Arbol.setModel(Ramas);
       
        
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuEs = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        Arbol = new javax.swing.JTree();
        jToggleButton1 = new javax.swing.JToggleButton();

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuEs.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        MenuEs.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        MenuEs.add(jMenuItem3);

        Arbol.setBackground(new java.awt.Color(102, 102, 102));
        Arbol.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Arbol.setForeground(new java.awt.Color(204, 153, 0));
        Arbol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Arbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArbolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Arbol);

        jToggleButton1.setText("Borrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jToggleButton1)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jToggleButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArbolMouseClicked
        // TODO add your handling code here:

        if(SwingUtilities.isRightMouseButton(evt)){
            ClickDerecho(evt);
            
            
        
        
        }
    }//GEN-LAST:event_ArbolMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree Arbol;
    private javax.swing.JPopupMenu MenuEs;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
