/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package opelgui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Angéla
 */
public class MainFrame extends javax.swing.JFrame {
    ArrayList<Jarmu> jarmuLista = new ArrayList<>();
    ArrayList<String> jarmulista_header = new ArrayList<>();
    int actual = 0;     //ez index
    
    public MainFrame() {
        initComponents();
        ReadFile();
        mutatJarmu(jarmuLista.get(0));
    }
    
    //ezt másoltuk be a VS Code Jarmű osztályból: ReadFile + tryReadFile-t:
    public void ReadFile() {
        try {
            tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba, a fájl nem található.");
            System.err.println(e.getMessage());
        }
    }
    
    public void tryReadFile() throws FileNotFoundException{
        File file = new File("jarmuvek_opel.csv");      
        Scanner sc = new Scanner(file, "utf-8");

        String header = sc.nextLine();                    
        for (String headerStr : header.split(":")) {
            jarmulista_header.add(headerStr);
        }

        while (sc.hasNext()) {                       
            String line = sc.nextLine();             
            String[] lineArray = line.split(":");   
            Jarmu jarmu = new Jarmu();
            jarmu.az = Integer.parseInt(lineArray[0]);
            jarmu.rendszam = lineArray[1];
            jarmu.marka = lineArray[2];
            jarmu.urtartalom = Integer.parseInt(lineArray[3]);
            jarmu.ar = Double.parseDouble(lineArray[4]);
            jarmuLista.add(jarmu);      
            
            System.out.println(line);
        }
    }
    
    //betölt egy db járművet a GUI-ba:
    public void mutatJarmu(Jarmu jarmu) {       //itt meg kell adni a változóneveket, amiket meírtunk design-ban
        AzjTextField1.setText(jarmu.az.toString());
        RendszamjTextField2.setText(jarmu.rendszam);
        MarkajTextField3.setText(jarmu.marka);
        UrtartalomjTextField4.setText(jarmu.urtartalom.toString());
        ArjTextField5.setText(jarmu.ar.toString());
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AzjLabel2 = new javax.swing.JLabel();
        RendszamjLabel3 = new javax.swing.JLabel();
        MarkajLabel4 = new javax.swing.JLabel();
        UrtartalomjLabel5 = new javax.swing.JLabel();
        ArjLabel6 = new javax.swing.JLabel();
        AzjTextField1 = new javax.swing.JTextField();
        RendszamjTextField2 = new javax.swing.JTextField();
        MarkajTextField3 = new javax.swing.JTextField();
        UrtartalomjTextField4 = new javax.swing.JTextField();
        ArjTextField5 = new javax.swing.JTextField();
        SaveRecordjButton1 = new javax.swing.JButton();
        PreviousjButton2 = new javax.swing.JButton();
        NextjButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Járművek");

        AzjLabel2.setText("Azonosito");

        RendszamjLabel3.setText("Rendszám");

        MarkajLabel4.setText("Márka");

        UrtartalomjLabel5.setText("Űrtartalom");

        ArjLabel6.setText("Ár");

        SaveRecordjButton1.setText("Rekord mentése");
        SaveRecordjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveRecordjButton1ActionPerformed(evt);
            }
        });

        PreviousjButton2.setText("Előző");
        PreviousjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousjButton2ActionPerformed(evt);
            }
        });

        NextjButton3.setText("Következő");
        NextjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextjButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SaveRecordjButton1)
                .addGap(184, 184, 184))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(PreviousjButton2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RendszamjLabel3)
                    .addComponent(AzjLabel2)
                    .addComponent(MarkajLabel4)
                    .addComponent(UrtartalomjLabel5)
                    .addComponent(ArjLabel6))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ArjTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(UrtartalomjTextField4)
                    .addComponent(MarkajTextField3)
                    .addComponent(RendszamjTextField2)
                    .addComponent(AzjTextField1))
                .addGap(44, 44, 44)
                .addComponent(NextjButton3)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SaveRecordjButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AzjLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AzjTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RendszamjLabel3)
                    .addComponent(RendszamjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarkajLabel4)
                    .addComponent(MarkajTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PreviousjButton2)
                    .addComponent(NextjButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UrtartalomjLabel5)
                    .addComponent(UrtartalomjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ArjLabel6)
                    .addComponent(ArjTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PreviousjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousjButton2ActionPerformed
        if(this.actual > 0){
            this.actual--;
            mutatJarmu(jarmuLista.get(this.actual));
        }
    }//GEN-LAST:event_PreviousjButton2ActionPerformed

    private void NextjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextjButton3ActionPerformed
        if(this.actual < jarmuLista.size()-1){
            this.actual++;
            mutatJarmu(jarmuLista.get(this.actual));
        }
    }//GEN-LAST:event_NextjButton3ActionPerformed

    private void SaveRecordjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveRecordjButton1ActionPerformed
        //IDE KELL A MENTEST
    }//GEN-LAST:event_SaveRecordjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ArjLabel6;
    private javax.swing.JTextField ArjTextField5;
    private javax.swing.JLabel AzjLabel2;
    private javax.swing.JTextField AzjTextField1;
    private javax.swing.JLabel MarkajLabel4;
    private javax.swing.JTextField MarkajTextField3;
    private javax.swing.JButton NextjButton3;
    private javax.swing.JButton PreviousjButton2;
    private javax.swing.JLabel RendszamjLabel3;
    private javax.swing.JTextField RendszamjTextField2;
    private javax.swing.JButton SaveRecordjButton1;
    private javax.swing.JLabel UrtartalomjLabel5;
    private javax.swing.JTextField UrtartalomjTextField4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
