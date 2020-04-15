
package user;

import Connection.Connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class FEED extends javax.swing.JFrame {
    Connection conn;
    Statement st;
    ResultSet rs;
    String uname;
    public FEED() {
        initComponents();
        setResizable(false);
    }
    public FEED(String temp)
    {
        initComponents();
        setResizable(false);
       uname=temp;
        
       try{
            Connect con = new Connect();
            conn= con.Connect();
            String query="select * from feed ";
            st= conn.createStatement();
            rs= st.executeQuery(query);
            while (rs.next())
            {
                jupcoming.setText(rs.getString("upcomingevent"));
                jdaily.setText(rs.getString("dailyhunt"));
                jinnovation.setText(rs.getString("innovationfeed"));
                
            }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(rootPane,e.getMessage() );
       }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jupcoming = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jdaily = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jinnovation = new javax.swing.JTextArea();
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
        jButton1.setBounds(60, 10, 40, 40);

        jupcoming.setEditable(false);
        jupcoming.setColumns(20);
        jupcoming.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jupcoming.setRows(5);
        jScrollPane1.setViewportView(jupcoming);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(170, 70, 470, 100);

        jdaily.setColumns(20);
        jdaily.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jdaily.setRows(5);
        jScrollPane2.setViewportView(jdaily);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(170, 230, 470, 110);

        jinnovation.setColumns(20);
        jinnovation.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jinnovation.setRows(5);
        jScrollPane3.setViewportView(jinnovation);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(170, 410, 470, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feed.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Profile pr1= new Profile(uname);
        pr1.show();
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
            java.util.logging.Logger.getLogger(FEED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FEED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FEED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FEED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FEED().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jdaily;
    private javax.swing.JTextArea jinnovation;
    private javax.swing.JTextArea jupcoming;
    // End of variables declaration//GEN-END:variables
}
