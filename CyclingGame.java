/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ozlympicsgame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author anu
 */
public class CyclingGame extends javax.swing.JFrame {

    /**
     * Creates new form CyclingGame
     */
    public CyclingGame() {
        initComponents();
        selectWinner();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Predect a winner");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
               jList1.addListSelectionListener(new ListSelectionListener() {

           @Override
           public void valueChanged(ListSelectionEvent e) {
              //To change body of generated methods, choose Tools | Templates.
               int itemid=jList1.getSelectedIndex();
               Person atm=listcycler.get(itemid);
     Config.userPredictedName=atm.getName();
     System.out.println(Config.userPredictedName);
   showNew();
           }
       });
    }                 
     public void selectWinner(){
         for(int i =0;i<SelectAGame.players.size();i++){
                    Person p=SelectAGame.players.get(i);
                if(p.getTypegame().equals("cyclist")){
                Person m=new Person(p.getId(),p.getName(),p.getAge(),p.getState(),p.getTypegame(),p.getFinishtime(),p.getPoints());
                listcycler.add(m);
                }
                }
        String fileName=System.getProperty("user.home")+"/players.txt";
        File file = new File(fileName);
        //listcycler.clear();
        try {
            Scanner inputStream = new Scanner(file);
            while(inputStream.hasNext()){
                String data=inputStream.next();
                System.out.println(data);
                String[]da=data.split(",");
               
             //System.out.println(data);
            }
             for(int i =0;i<SelectAGame.players.size();i++){
                    Person p=SelectAGame.players.get(i);
                if(p.getTypegame().equals("cyclist")){
                Person m=new Person(p.getId(),p.getName(),p.getAge(),p.getState(),p.getTypegame(),p.getFinishtime(),p.getPoints());
                listcycler.add(m);
                }
                }
        } catch (FileNotFoundException ex) {
            System.out.println(""+ex);
            //Logger.getLogger(ReadCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<String>list=new ArrayList<String>();
        list.clear();
        for(int p=0;p<listcycler.size();p++){
            Person at=listcycler.get(p);
            String runnerval=at.getName();
            list.add(runnerval);
        }
        jList1.setModel(new javax.swing.AbstractListModel() {
           
            public int getSize() { return list.size(); }
            public Object getElementAt(int i) { return list.get(i); }
        });
        jScrollPane1.setViewportView(jList1);
    }
     public List<Person>listcycler=new ArrayList<Person>();
public void showNew(){
      CyclingPlay gmp=new CyclingPlay();
     gmp.setVisible(true);

    }//GEN-LAST:event_jList1ValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CyclingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CyclingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CyclingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CyclingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CyclingGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
