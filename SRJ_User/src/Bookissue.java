
package user;
import Connection.Connect;
import java.sql.*;
import javax.swing.*;
public class Bookissue extends javax.swing.JFrame {
    String temp;
    Connection conn;
    Statement st;
    ResultSet rs;
   
    public Bookissue() {
        initComponents();
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jroll = new javax.swing.JTextField();
        jcard1 = new javax.swing.JTextField();
        jcard2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel2.setText("Student Roll No.");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 240, 250, 40);

        jLabel3.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel3.setText("Book for Card 1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 310, 250, 38);

        jLabel4.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel4.setText("Book for Card 2");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 380, 240, 42);

        jroll.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jPanel1.add(jroll);
        jroll.setBounds(530, 240, 180, 38);

        jcard1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jPanel1.add(jcard1);
        jcard1.setBounds(530, 310, 180, 38);

        jcard2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jcard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcard2ActionPerformed(evt);
            }
        });
        jPanel1.add(jcard2);
        jcard2.setBounds(530, 380, 180, 42);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Mongolian Baiti", 0, 24)); // NOI18N
        jButton1.setText("ISSUE BOOK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(490, 490, 183, 54);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEW BACK  .png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(200, 500, 40, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BOOK ISSUE.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            String book1 = null;
            Connect con = new Connect();
            conn= con.Connect();
            String query= "select lcard1 from login where rollno="+jroll.getText();
            st= conn.createStatement();
            rs= st.executeQuery(query);
            while (rs.next())
            {
                temp= rs.getString(1);
            }
            if (temp.equals(""))
            {
                JOptionPane.showMessageDialog(rootPane, "Cards are not Activated");
                jroll.setText("");
                jcard1.setText("");
                jcard2.setText("");
                
            }
            else
            {
                String query2="select book1 from login where rollno='"+jroll.getText()+"'";
                st=conn.createStatement();
                rs= st.executeQuery(query2);
                while(rs.next())
                {
                  book1= (rs.getString("book1"));
                }
                if (book1.equals(""))
                {
                String query3="select * from books where code='"+jcard1.getText()+"' and code='"+jcard1.getText()+"'";
                st=conn.createStatement();
                rs= st.executeQuery(query3);
                if(rs.isBeforeFirst())
                {
                String query1= "update login set book1='"+jcard1.getText()+"',book2='"+jcard2.getText()+"' where rollno='"+jroll.getText()+"'";
                st= conn.createStatement();
                int n= st.executeUpdate(query1);
                if (n>0)
                {
                    JOptionPane.showMessageDialog(rootPane, "Book Issued");
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Invalid Activity");
                }
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Books Doesn't Exist");
                }
                }
                else 
                {
                    JOptionPane.showMessageDialog(rootPane, "Please Return Your Previous Books First");
                }
                
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
     finally
        {
            jroll.setText("");
            jcard1.setText("");
            jcard2.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Libpanel ch= new Libpanel();
        ch.show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jcard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcard2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcard2ActionPerformed

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
            java.util.logging.Logger.getLogger(Bookissue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookissue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookissue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookissue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bookissue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jcard1;
    private javax.swing.JTextField jcard2;
    private javax.swing.JTextField jroll;
    // End of variables declaration//GEN-END:variables
}
