
package admin;

import Connection.Connect;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.*;
import javax.swing.*;
import java.sql.*;


public class updatenotice extends javax.swing.JFrame {

    byte[] photo=null;
    String filename=null;
    Connection conn;
    Statement st;
    ResultSet rs;
    public updatenotice() {
        initComponents();
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jimage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jpath = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jimage.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jimage);
        jimage.setBounds(50, 100, 680, 290);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("UPLOAD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(150, 470, 140, 40);

        jpath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpathActionPerformed(evt);
            }
        });
        jPanel2.add(jpath);
        jpath.setBounds(60, 410, 477, 35);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(580, 470, 130, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEW BACK  .png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(30, 30, 40, 38);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(4, 4, 0, 550);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(jDateChooser1);
        jDateChooser1.setBounds(550, 410, 163, 33);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/updating notice.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(-10, -90, 770, 790);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fchoose= new JFileChooser();
        fchoose.showOpenDialog(null);
        File f= fchoose.getSelectedFile();

        Image im=(new ImageIcon(f.toString())).getImage();
        Image myImg = im.getScaledInstance(jimage.getWidth(), jimage.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon newImage = new ImageIcon(myImg);
        jimage.setIcon(newImage);
        filename=f.getAbsolutePath();
        jpath.setText(filename);
        try{
            File image = new File(filename);
            FileInputStream fis= new FileInputStream(image);
            ByteArrayOutputStream bos= new ByteArrayOutputStream();
            byte [] buffer = new byte[1024];
            for (int readnum; (readnum=fis.read(buffer))!=-1;)
            {
                bos.write(buffer, 0, readnum);
            }
            photo = bos.toByteArray();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(rootPane, "Your file is either not an Image or has a Large Size");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpathActionPerformed

    }//GEN-LAST:event_jpathActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{

            Connect con = new Connect();
            conn= con.Connect();
            String date=((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
            PreparedStatement ps = conn.prepareStatement("insert into notice(photo,date) values(?,?)");
            InputStream is = new FileInputStream(new File(filename));
            ps.setBlob(1,is);
            ps.setString(2,date );
            ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Notice Updated");
        }
        catch(HeadlessException | FileNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Welcome wl= new Welcome();
        wl.show();
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(updatenotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatenotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatenotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatenotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatenotice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jimage;
    private javax.swing.JTextField jpath;
    // End of variables declaration//GEN-END:variables
}
