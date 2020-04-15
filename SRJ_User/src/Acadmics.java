
package user;

import Connection.Connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Acadmics extends javax.swing.JFrame {
    String uname;
    Connection conn;
    Statement st;
    ResultSet rs;
    public Acadmics() {
        initComponents();
        setResizable(false);
    }
    
    public Acadmics(String temp)
    {
        initComponents();
        setResizable(false);
        uname=temp;
        try{
        Connect con = new Connect();
        conn= con.Connect();
        String query= "select * from acadmics where uname='"+uname+"'";
        st= conn.createStatement();
        rs= st.executeQuery(query);
       try{
       while (rs.next())
       {
            
            jname.setText(rs.getString("name"));
            jbranch.setText(rs.getString("branch"));
            jshift.setText(rs.getString("shift"));
            jroll.setText(rs.getString("rollno")); 
            jtm1.setText(rs.getString("tm1"));
            jper1.setText(rs.getString("per1"));
            jtm2.setText(rs.getString("tm2"));
            jper2.setText(rs.getString("per2"));
            jtm3.setText(rs.getString("tm3"));
            jper3.setText(rs.getString("per3"));
            jtm4.setText(rs.getString("tm4"));
            jper4.setText(rs.getString("per4"));
            jtm5.setText(rs.getString("tm5"));
            jper5.setText(rs.getString("per5"));
            jtm6.setText(rs.getString("tm6"));
            jper6.setText(rs.getString("per6"));
            
            
            
       }
      
        }
        catch(Exception e)
       {
           JOptionPane.showMessageDialog(rootPane, e.getMessage());
       }
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jtm1 = new javax.swing.JLabel();
        jper1 = new javax.swing.JLabel();
        jname = new javax.swing.JLabel();
        jtm3 = new javax.swing.JLabel();
        jper3 = new javax.swing.JLabel();
        jtm5 = new javax.swing.JLabel();
        jshift = new javax.swing.JLabel();
        jroll = new javax.swing.JLabel();
        jtm2 = new javax.swing.JLabel();
        jper2 = new javax.swing.JLabel();
        jtm4 = new javax.swing.JLabel();
        jbranch = new javax.swing.JLabel();
        jper6 = new javax.swing.JLabel();
        jper5 = new javax.swing.JLabel();
        jtm6 = new javax.swing.JLabel();
        jper4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEW BACK  .png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 10, 40, 40);

        jtm1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jtm1);
        jtm1.setBounds(130, 120, 70, 30);

        jper1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jper1);
        jper1.setBounds(150, 160, 60, 30);

        jname.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jname.setText("name ");
        jPanel1.add(jname);
        jname.setBounds(520, 250, 240, 40);

        jtm3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jtm3);
        jtm3.setBounds(140, 290, 70, 30);

        jper3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jper3);
        jper3.setBounds(150, 340, 60, 30);

        jtm5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jtm5);
        jtm5.setBounds(150, 450, 50, 30);

        jshift.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jshift.setText("shift");
        jPanel1.add(jshift);
        jshift.setBounds(520, 430, 240, 50);

        jroll.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jroll.setText("roll no.");
        jPanel1.add(jroll);
        jroll.setBounds(520, 310, 240, 40);

        jtm2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jtm2);
        jtm2.setBounds(380, 120, 70, 30);

        jper2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jper2);
        jper2.setBounds(400, 160, 60, 30);

        jtm4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jtm4);
        jtm4.setBounds(380, 290, 50, 30);

        jbranch.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jbranch.setText("branch ");
        jPanel1.add(jbranch);
        jbranch.setBounds(520, 370, 230, 40);

        jper6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jper6);
        jper6.setBounds(400, 490, 70, 30);

        jper5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jper5);
        jper5.setBounds(160, 490, 60, 30);

        jtm6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jtm6);
        jtm6.setBounds(380, 450, 60, 30);

        jper4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(jper4);
        jper4.setBounds(400, 330, 60, 30);
        jPanel1.add(jLabel17);
        jLabel17.setBounds(0, 4, 0, 570);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/acadmics.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-10, 10, 760, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Profile pfl= new Profile(uname);
        pfl.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Acadmics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acadmics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acadmics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acadmics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acadmics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jbranch;
    private javax.swing.JLabel jname;
    private javax.swing.JLabel jper1;
    private javax.swing.JLabel jper2;
    private javax.swing.JLabel jper3;
    private javax.swing.JLabel jper4;
    private javax.swing.JLabel jper5;
    private javax.swing.JLabel jper6;
    private javax.swing.JLabel jroll;
    private javax.swing.JLabel jshift;
    private javax.swing.JLabel jtm1;
    private javax.swing.JLabel jtm2;
    private javax.swing.JLabel jtm3;
    private javax.swing.JLabel jtm4;
    private javax.swing.JLabel jtm5;
    private javax.swing.JLabel jtm6;
    // End of variables declaration//GEN-END:variables
}
