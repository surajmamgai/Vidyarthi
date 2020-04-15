
package admin;

import Connection.Connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Result extends javax.swing.JFrame {

    Connection conn;
    Statement st;
    ResultSet rs;
    String sem,name,roll,branch,shift,uname;
    public Result() {
        initComponents();
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jmarks = new javax.swing.JTextField();
        jper = new javax.swing.JTextField();
        jroll = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jsem = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        jPanel1.add(jmarks);
        jmarks.setBounds(160, 190, 160, 30);
        jPanel1.add(jper);
        jper.setBounds(160, 230, 161, 30);

        jroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrollActionPerformed(evt);
            }
        });
        jPanel1.add(jroll);
        jroll.setBounds(160, 150, 161, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 270, 100, 40);

        jsem.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jsem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester", "1st", "2nd", "3rd", "4th", "5th", "6th" }));
        jsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsemActionPerformed(evt);
            }
        });
        jPanel1.add(jsem);
        jsem.setBounds(160, 270, 160, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEW BACK  .png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 10, 40, 40);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/result.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 760, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrollActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try
        {
//           String url= "jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12285144";
//           String user= "sql12285144";
//           String pass= "M4pwHNcsiv";
//            Class.forName("com.mysql.jdbc.Driver");
//            conn= DriverManager.getConnection(url,user,pass);
            Connect con = new Connect();
            conn= con.Connect();
            String query="select * from login where rollno='"+jroll.getText()+"'";
            st=conn.createStatement();
            rs= st.executeQuery(query);
            while (rs.next())
            {
               name=rs.getString("name");
               roll=rs.getString("rollno");
               branch=rs.getString("branch");
               shift=rs.getString("shift");
               uname=rs.getString("uname");
            }
            sem=jsem.getSelectedItem().toString();
            if (sem.equals("1st"))
            {
                String query1="insert into acadmics value('"+name+"','"+roll+"','"+branch+"','"+shift+"','"+uname+"','"+jmarks.getText()+"','"+jper.getText()+"','','','','','','','','','','')";
                st= conn.createStatement();
                int n= st.executeUpdate(query1);
                if (n>0)
                {
                    JOptionPane.showMessageDialog(rootPane, "Submitted");
                }
                else 
                {
                    JOptionPane.showMessageDialog(rootPane, "Server Error");
                }
                
            }
            else if (sem.equals("2nd"))
            {
                String query2="update acadmics set tm2='"+jmarks.getText()+"',per2='"+jper.getText()+"' where rollno='"+jroll.getText()+"'";
                st= conn.createStatement();
                int n= st.executeUpdate(query2);
               if (n>0)
                {
                    JOptionPane.showMessageDialog(rootPane, "Submitted");
                }
                else 
                {
                    JOptionPane.showMessageDialog(rootPane, "Server Error");
                }
                
            }
            else if (sem.equals("3rd"))
            {
                String query2="update acadmics set tm3='"+jmarks.getText()+"',per3='"+jper.getText()+"' where rollno='"+jroll.getText()+"'";
                st= conn.createStatement();
                int n= st.executeUpdate(query2);
                if (n>0)
                {
                    JOptionPane.showMessageDialog(rootPane, "Submitted");
                }
                else 
                {
                    JOptionPane.showMessageDialog(rootPane, "Server Error");
                }
                
            }
             else if (sem.equals("4th"))
            {
                String query2="update acadmics set tm4='"+jmarks.getText()+"',per4='"+jper.getText()+"' where rollno='"+jroll.getText()+"'";
                st= conn.createStatement();
                int n= st.executeUpdate(query2);
                if (n>0)
                {
                    JOptionPane.showMessageDialog(rootPane, "Submitted");
                }
                else 
                {
                    JOptionPane.showMessageDialog(rootPane, "Server Error");
                }
                
            }
             else if (sem.equals("5th"))
            {
                String query2="update acadmics set tm5='"+jmarks.getText()+"',per5='"+jper.getText()+"' where rollno='"+jroll.getText()+"'";
                st= conn.createStatement();
                int n= st.executeUpdate(query2);
                if (n>0)
                {
                    JOptionPane.showMessageDialog(rootPane, "Submitted");
                }
                else 
                {
                    JOptionPane.showMessageDialog(rootPane, "Server Error");
                }
                
            }
            else if (sem.equals("6th"))
            {
                String query2="update acadmics set tm6='"+jmarks.getText()+"',per6='"+jper.getText()+"' where rollno='"+jroll.getText()+"'";
                st= conn.createStatement();
                int n= st.executeUpdate(query2);
               if (n>0)
                {
                    JOptionPane.showMessageDialog(rootPane, "Submitted");
                }
                else 
                {
                    JOptionPane.showMessageDialog(rootPane, "Server Error");
                }
                
            }
            
        }
         catch (Exception e)
         {
             JOptionPane.showMessageDialog(rootPane, e.getMessage());
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Welcome wl= new Welcome();
       wl.show();
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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jmarks;
    private javax.swing.JTextField jper;
    private javax.swing.JTextField jroll;
    private javax.swing.JComboBox<String> jsem;
    // End of variables declaration//GEN-END:variables
}
