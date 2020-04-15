
package user;

import Connection.Connect;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class libreg extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    Statement st;
    String uname;
    public libreg() {
        initComponents();
        setResizable(false);
        }
    public libreg(String temp) {
        initComponents();
        setResizable(false);
        uname=temp;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jbatch1 = new javax.swing.JTextField();
        jbatch2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(270, 430, 160, 40);

        jbatch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbatch1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbatch1);
        jbatch1.setBounds(430, 290, 153, 40);

        jbatch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbatch2ActionPerformed(evt);
            }
        });
        jPanel1.add(jbatch2);
        jbatch2.setBounds(430, 350, 153, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEW BACK  .png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 440, 40, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/card acvtivation.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, -20, 720, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbatch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbatch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbatch2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String b1=jbatch1.getText();
      String b2= jbatch2.getText();
      try{
        Connect con = new Connect();
        conn= con.Connect();
        String query= "update login set lcard1='"+b1+"',lcard2='"+b2+"'where uname='"+uname+"'";
        st= conn.createStatement();
          int temp= st.executeUpdate(query);
        if (temp>0)
        {
            JOptionPane.showMessageDialog(rootPane, "YOUR CARDS ARE NOW ACTIVATED");
            Library lb= new Library(uname);
            lb.show();
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "invalid cridentials");
        }
        
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(rootPane, e.getMessage());
      }
      finally{
          jbatch1.setText("");
          jbatch2.setText("");
      }

      
      
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbatch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbatch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbatch1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Profile prf= new Profile(uname);
        prf.show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(libreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(libreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(libreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(libreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new libreg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jbatch1;
    private javax.swing.JTextField jbatch2;
    // End of variables declaration//GEN-END:variables
}
