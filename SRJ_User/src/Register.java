
package user;

import Connection.Connect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

/**
 *
 * @author aahha
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Demo
     */
    public Register() {
        initComponents();
        setResizable(false);
    }

    Connection conn;
    Statement st;
    ResultSet rs;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jphone = new javax.swing.JTextField();
        juname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jmale = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jpass = new javax.swing.JPasswordField();
        jbranch = new javax.swing.JComboBox<>();
        jback = new javax.swing.JButton();
        jfemale = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jothers = new javax.swing.JRadioButton();
        jmorning = new javax.swing.JRadioButton();
        jevening = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jrollno = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jphone.setBorder(jrollno.getBorder());
        jphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jphoneActionPerformed(evt);
            }
        });
        jPanel1.add(jphone);
        jphone.setBounds(500, 250, 150, 30);

        juname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                junameActionPerformed(evt);
            }
        });
        jPanel1.add(juname);
        juname.setBounds(500, 290, 150, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("REGISTER");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 430, 170, 36);

        jmale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jmale);
        jmale.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jmale.setText("Male");
        jmale.setBorder(null);
        jmale.setBorderPainted(true);
        jmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmaleActionPerformed(evt);
            }
        });
        jPanel1.add(jmale);
        jmale.setBounds(110, 170, 120, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Gender   :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 160, 90, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Shift         :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(400, 170, 90, 28);

        jpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassActionPerformed(evt);
            }
        });
        jPanel1.add(jpass);
        jpass.setBounds(500, 330, 150, 30);

        jbranch.setForeground(new java.awt.Color(0, 153, 255));
        jbranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT BRANCH", "CSE", "EE", "ME", "PE", "ECE", "CE" }));
        jbranch.setBorder(null);
        jbranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbranchActionPerformed(evt);
            }
        });
        jPanel1.add(jbranch);
        jbranch.setBounds(500, 110, 150, 30);

        jback.setBackground(new java.awt.Color(255, 255, 255));
        jback.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jback.setForeground(new java.awt.Color(0, 153, 255));
        jback.setText("RESET");
        jback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbackActionPerformed(evt);
            }
        });
        jPanel1.add(jback);
        jback.setBounds(400, 430, 120, 36);

        jfemale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jfemale);
        jfemale.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jfemale.setText("Female");
        jfemale.setBorder(null);
        jfemale.setBorderPainted(true);
        jfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfemaleActionPerformed(evt);
            }
        });
        jPanel1.add(jfemale);
        jfemale.setBounds(110, 210, 120, 30);

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(110, 290, 160, 30);

        jothers.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jothers);
        jothers.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jothers.setText("Others");
        jothers.setBorder(null);
        jothers.setBorderPainted(true);
        jothers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jothersActionPerformed(evt);
            }
        });
        jPanel1.add(jothers);
        jothers.setBounds(110, 250, 120, 30);

        jmorning.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jmorning);
        jmorning.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jmorning.setText("Morning Shift");
        jmorning.setBorder(null);
        jmorning.setBorderPainted(true);
        jmorning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmorningActionPerformed(evt);
            }
        });
        jPanel1.add(jmorning);
        jmorning.setBounds(500, 170, 130, 30);

        jevening.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jevening);
        jevening.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jevening.setText("Evening Shift");
        jevening.setBorder(null);
        jevening.setBorderPainted(true);
        jevening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeveningActionPerformed(evt);
            }
        });
        jPanel1.add(jevening);
        jevening.setBounds(500, 210, 130, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Password   :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(400, 320, 100, 50);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(-3, 381, 740, 10);

        jname.setBorder(jrollno.getBorder());
        jname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnameActionPerformed(evt);
            }
        });
        jPanel1.add(jname);
        jname.setBounds(110, 109, 159, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Name     :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 100, 84, 39);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("DOB      :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 290, 80, 33);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Roll No  :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 330, 90, 33);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Contact     :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(400, 250, 90, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Username  :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(400, 290, 110, 30);

        jrollno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrollnoActionPerformed(evt);
            }
        });
        jPanel1.add(jrollno);
        jrollno.setBounds(110, 333, 160, 30);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(0, 150, 730, 190);
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(0, 3, 736, 2);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEW BACK  .png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 30, 40, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CREATE ACCOUNT.png.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(-20, -10, 750, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jphoneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connect con = new Connect();
        conn= con.Connect();
        String name,lname,gender="",date,branch,shift="",uname,pass;
        String roll,phone;
        name= jname.getText();
        uname=juname.getText();
        pass=jpass.getText();
        roll=jrollno.getText();
        phone=jphone.getText();
        date=((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        branch=jbranch.getSelectedItem().toString();
        if (jmale.isSelected())
        {
            gender="male";
        }
        else if (jfemale.isSelected())
        {
            gender="female";
        }
        else if(jothers.isSelected())
        {
            gender="others";
        }
        if (jmorning.isSelected())
        {
            shift="MOR";
        }
        else if (jevening.isSelected())
        {
            shift="EVE";
        }

        if (name.isEmpty() || uname.isEmpty() ||roll.isEmpty() || phone.isEmpty() || pass.isEmpty() || date.isEmpty() || branch.isEmpty() || gender.isEmpty() || shift.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "PLEASE FILL ALL FIELDS BEFORE PRESSING REGISTER BUTTON");
        }
        else
        try
        {
            String query1= "select * from login where uname='"+juname.getText()+"'";
            st =conn.createStatement();
            rs= st.executeQuery(query1);
            if (rs.isBeforeFirst())
            {
                JOptionPane.showMessageDialog(rootPane, "user exist please change the username" );
            }
            else
            {       String r = null,n=null,b=null,s=null;
                   String query2="select * from clgdata where rollno='"+roll+"'";
                   st =conn.createStatement();
                   rs= st.executeQuery(query2); 
                   if (rs.isBeforeFirst())
                   {
                       
                       while(rs.next())
                       {
                          r=rs.getString("rollno");
                          n=rs.getString("name");
                          b=rs.getString("branch");
                          s=rs.getString("shift");
                          
                       }
                       if (branch.equalsIgnoreCase(b) && roll.equalsIgnoreCase(r) && name.equalsIgnoreCase(n) && shift.equalsIgnoreCase(s))
                       {
                        String query="insert into login values('"+name+"','"+gender+"','"+date+"',"+roll+",'"+branch+"','"+shift+"','"+phone+"','"+uname+"','"+pass+"','','','','')";
                        st= conn.createStatement();
                        int i= st.executeUpdate(query);
                        if (i>0)
                            {
                                JOptionPane.showMessageDialog(rootPane, "REGISTRATION IS SUCESFULL");
                                Login lg= new Login();
                                lg.show();
                                this.dispose();
                            }
                        else
                            JOptionPane.showMessageDialog(rootPane, "ERRROR OCCURRED");
                        }
                       else
                       {
                           JOptionPane.showMessageDialog(rootPane, "please enter correct data associated to your roll no");
                       }
                            
                   }
                   else 
                   {
                       JOptionPane.showMessageDialog(rootPane, "(NO RECORD FOUND)");
                   }
            }
             
                
        }
           catch(HeadlessException | SQLException e)
            {
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmaleActionPerformed

    private void jbranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbranchActionPerformed

    private void jfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfemaleActionPerformed

    private void jothersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jothersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jothersActionPerformed

    private void jmorningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmorningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmorningActionPerformed

    private void jeveningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeveningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jeveningActionPerformed

    private void jnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnameActionPerformed

    private void jrollnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrollnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrollnoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Login lg= new Login();
        lg.show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void junameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_junameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_junameActionPerformed

    private void jpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassActionPerformed

    private void jbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbackActionPerformed
       jname.setText("");
       jrollno.setText("");
       jphone.setText("");
       juname.setText("");
       jpass.setText("");
       buttonGroup1.clearSelection();
       buttonGroup2.clearSelection();
       jDateChooser1.setCalendar(null);
       jbranch.setSelectedIndex(0);
    }//GEN-LAST:event_jbackActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton jback;
    private javax.swing.JComboBox<String> jbranch;
    private javax.swing.JRadioButton jevening;
    private javax.swing.JRadioButton jfemale;
    private javax.swing.JRadioButton jmale;
    private javax.swing.JRadioButton jmorning;
    private javax.swing.JTextField jname;
    private javax.swing.JRadioButton jothers;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JTextField jphone;
    private javax.swing.JTextField jrollno;
    private javax.swing.JTextField juname;
    // End of variables declaration//GEN-END:variables
}
