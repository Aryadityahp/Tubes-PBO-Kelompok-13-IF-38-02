/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Anang Kur
 */
public class MenuCariPasien extends javax.swing.JFrame {

    /**
     * Creates new form MenuCariPasien
     */
    public MenuCariPasien() {
        initComponents();
    }

    public JButton getBtnBatalCariPasien() {
        return btnBatalCariPasien;
    }

    public JButton getBtnCariPasien() {
        return btnCariEditPasien;
    }

    public JTextField getFieldCariPasien() {
        return fieldCariPasien;
    }

    public JButton getBtnCariDeletePasien() {
        return btnCariDeletePasien;
    }

    public JButton getBtnCariEditPasien() {
        return btnCariEditPasien;
    }
    
    
    
    public void addListener(ActionListener a){
        btnBatalCariPasien.addActionListener(a);
        btnCariEditPasien.addActionListener(a);
        btnCariDeletePasien.addActionListener(a);
        fieldCariPasien.addActionListener(a);
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
        jLabel2 = new javax.swing.JLabel();
        fieldCariPasien = new javax.swing.JTextField();
        btnBatalCariPasien = new javax.swing.JButton();
        btnCariEditPasien = new javax.swing.JButton();
        btnCariDeletePasien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cari Pasien");

        jLabel2.setText("Id Pasien");

        btnBatalCariPasien.setText("Batal");

        btnCariEditPasien.setText("Edit");

        btnCariDeletePasien.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(57, 57, 57)
                        .addComponent(fieldCariPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBatalCariPasien)
                        .addGap(18, 18, 18)
                        .addComponent(btnCariEditPasien)
                        .addGap(18, 18, 18)
                        .addComponent(btnCariDeletePasien)
                        .addGap(129, 129, 129))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldCariPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCariEditPasien)
                    .addComponent(btnBatalCariPasien)
                    .addComponent(btnCariDeletePasien))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatalCariPasien;
    private javax.swing.JButton btnCariDeletePasien;
    private javax.swing.JButton btnCariEditPasien;
    private javax.swing.JTextField fieldCariPasien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
