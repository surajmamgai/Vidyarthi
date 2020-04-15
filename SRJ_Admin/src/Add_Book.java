
package admin;
import javax.swing.JOptionPane;
import java.sql.*;
import Connection.*;

public class Add_Book extends javax.swing.JFrame {
    Connection conn;
    Statement st;
    ResultSet rs;
    public Add_Book() {
        initComponents();
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jname = new javax.swing.JTextField();
        jisbn = new javax.swing.JTextField();
        jwiriter = new javax.swing.JTextField();
        jcode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("  Name   :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 50, 150, 43);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setText("ISBN   :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 20, 120, 35);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setText("Writer  :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(200, 90, 149, 43);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel4.setText("Code    :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 130, 130, 40);

        jname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnameActionPerformed(evt);
            }
        });
        jPanel1.add(jname);
        jname.setBounds(330, 60, 170, 30);

        jisbn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jisbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jisbnActionPerformed(evt);
            }
        });
        jPanel1.add(jisbn);
        jisbn.setBounds(330, 20, 170, 30);

        jwiriter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jwiriter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jwiriterActionPerformed(evt);
            }
        });
        jPanel1.add(jwiriter);
        jwiriter.setBounds(330, 100, 170, 30);

        jcode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jcode);
        jcode.setBounds(330, 140, 170, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButton1.setText("+ BOOK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(330, 190, 170, 40);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEW BACK  .png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 10, 40, 40);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 0, 510, 2);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jButton3.setText("SHOW BOOKS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(260, 240, 240, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add book_1.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, -80, 520, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jisbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jisbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jisbnActionPerformed

    private void jwiriterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jwiriterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jwiriterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            Connect con = new Connect();
            conn= con.Connect();
           
            String query= "insert into books values ('"+jname.getText()+"','"+jisbn.getText()+"','"+jwiriter.getText()+"','"+jcode.getText()+"')";
            st= conn.createStatement();
            int n= st.executeUpdate(query);
             System.out.println("hey");
            if (n>0)
            {
                JOptionPane.showMessageDialog(rootPane, "Book Added");
                jname.setText("");
                jcode.setText("");
                jwiriter.setText("");
                jisbn.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Server Issue");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Welcome wc= new Welcome();
        wc.show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Books bk= new Books();
       bk.show();
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnameActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jcode;
    private javax.swing.JTextField jisbn;
    private javax.swing.JTextField jname;
    private javax.swing.JTextField jwiriter;
    // End of variables declaration//GEN-END:variables
}
