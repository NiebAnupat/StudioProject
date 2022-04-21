/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studioproject;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.sql.ResultSet;

/**
 * @author niebz
 */
public class P0 extends javax.swing.JFrame {

    /**
     * Creates new form P0
     */
    public P0 () {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents () {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        pwd = new javax.swing.JPasswordField();
        regis_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        back_btn = new javax.swing.JButton();

        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );

        jLabel1.setFont( new java.awt.Font( "Angsana New", 1, 36 ) ); // NOI18N
        jLabel1.setText( "Register" );

        jLabel2.setHorizontalAlignment( javax.swing.SwingConstants.TRAILING );
        jLabel2.setText( "ID :" );

        jLabel3.setHorizontalAlignment( javax.swing.SwingConstants.TRAILING );
        jLabel3.setText( "Password :" );

        regis_btn.setText( "register" );
        regis_btn.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
                regis_btnActionPerformed( evt );
            }
        } );

        jLabel4.setHorizontalAlignment( javax.swing.SwingConstants.TRAILING );
        jLabel4.setText( "Name :" );

        back_btn.setText( "back" );
        back_btn.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed (java.awt.event.ActionEvent evt) {
                back_btnActionPerformed( evt );
            }
        } );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
        getContentPane().setLayout( layout );
        layout.setHorizontalGroup(
                layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( layout.createSequentialGroup()
                                .addGap( 17, 17, 17 )
                                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                        .addGroup( layout.createSequentialGroup()
                                                .addGap( 89, 89, 89 )
                                                .addComponent( jLabel1 )
                                                .addGap( 84, 84, 84 ) )
                                        .addGroup( layout.createSequentialGroup()
                                                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false )
                                                        .addGroup( layout.createSequentialGroup()
                                                                .addComponent( jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                                                .addComponent( name ) )
                                                        .addGroup( layout.createSequentialGroup()
                                                                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.TRAILING, false )
                                                                        .addComponent( jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                                                        .addComponent( jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                                                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false )
                                                                        .addComponent( id )
                                                                        .addComponent( pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE ) ) ) )
                                                .addGap( 33, 33, 33 ) ) )
                                .addComponent( jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap( javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                .addComponent( back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE )
                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                .addComponent( regis_btn )
                                .addGap( 58, 58, 58 ) )
        );
        layout.setVerticalGroup(
                layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( layout.createSequentialGroup()
                                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                        .addGroup( layout.createSequentialGroup()
                                                .addGap( 146, 146, 146 )
                                                .addComponent( jLabel5 ) )
                                        .addGroup( layout.createSequentialGroup()
                                                .addGap( 14, 14, 14 )
                                                .addComponent( jLabel1 )
                                                .addGap( 18, 18, 18 )
                                                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                                                        .addComponent( jLabel2 )
                                                        .addComponent( id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                                                        .addComponent( jLabel3 )
                                                        .addComponent( pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                                                        .addComponent( jLabel4 )
                                                        .addComponent( name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) ) ) )
                                .addGap( 18, 18, 18 )
                                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                                        .addComponent( regis_btn )
                                        .addComponent( back_btn ) )
                                .addContainerGap( 23, Short.MAX_VALUE ) )
        );

        pack();
        setLocationRelativeTo( null );
    }// </editor-fold>//GEN-END:initComponents

    private void regis_btnActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regis_btnActionPerformed
        // TODO add your handling code here:
        String sql = String.format( "select * from customer where id='%s'", id.getText() );
        try {

            ResultSet rs = new conn().getResultSet( sql );
            if ( !rs.next() ) {
                sql = String.format( "insert into customer values('%s','%s','%s')", id.getText(), pwd.getText(), name.getText() );
                if ( new conn().execute( sql ) ) {
                    JOptionPane.showMessageDialog( this, "Register Successful!" );
                    this.dispose();
                    new P1().setVisible( true );
                } else {
                    JOptionPane.showMessageDialog( this, "Register Fail!" );
                }
            } else JOptionPane.showMessageDialog( this, "ID is already used" );
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_regis_btnActionPerformed

    private void back_btnActionPerformed (java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new P1().setVisible( true );
    }//GEN-LAST:event_back_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main (String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        FlatLightLaf.setup();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run () {
                new P0().setVisible( true );
            }
        } );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JButton regis_btn;
    // End of variables declaration//GEN-END:variables
}