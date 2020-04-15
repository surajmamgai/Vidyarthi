
package user;
import Connection.Connect;
import java.sql.*;
import javax.swing.JOptionPane;
public class Library extends javax.swing.JFrame {

    String uname;
     Connection conn;
     Statement st;
     ResultSet rs;
     String book1;
     String book2;
    public Library() {
        initComponents();
        setResizable(false);
    }
    public Library(String temp)
    {
    
        initComponents();
        setResizable(false);
        uname=temp;
         try{

        Connect con = new Connect();
        conn= con.Connect();
        String query= "select * from login where uname='"+uname+"'";
        st= conn.createStatement();
        rs= st.executeQuery(query);
       try{
       while (rs.next())
       {
            String s=(rs.getString(1)).toUpperCase();
            jname.setText(s);
            book1=(rs.getString(12));
            book2=(rs.getString(13));
            
       }
        if (book1.equals("") || book2.equals(""))
        {
            jbook1.setText("No Book Issued");
            jbook2.setText("No Book Issued");
        }
        else 
        {
          String query1="select name from books where code='"+book1+"'";
          st=conn.createStatement();
          rs=st.executeQuery(query1);
          if (rs.isBeforeFirst())
          {
               while (rs.next())
          {
              jbook1.setText(rs.getString("name"));
          }
          }
          else
          {
            jbook1.setText("no book");
          }
          String query2="select name from books where code='"+book2+"'";
          st=conn.createStatement();
          rs=st.executeQuery(query2);
          if (rs.isBeforeFirst())
          {
              while (rs.next())
          {
              jbook2.setText(rs.getString("name"));
          }
          }
          else
          {
              jbook2.setText("no book");
          }
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
        jname = new javax.swing.JLabel();
        jbook2 = new javax.swing.JLabel();
        jbook1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEW BACK  .png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(140, 20, 40, 40);

        jname.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jname.setForeground(new java.awt.Color(0, 51, 51));
        jname.setText("NAME");
        jPanel1.add(jname);
        jname.setBounds(10, 210, 192, 42);

        jbook2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbook2.setForeground(new java.awt.Color(0, 51, 51));
        jbook2.setText("No Book Issued");
        jPanel1.add(jbook2);
        jbook2.setBounds(10, 500, 370, 38);

        jbook1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jbook1.setForeground(new java.awt.Color(0, 51, 51));
        jbook1.setText("No Book Issued");
        jPanel1.add(jbook1);
        jbook1.setBounds(10, 360, 290, 34);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LIBRARY STUDENT.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jbook1;
    private javax.swing.JLabel jbook2;
    private javax.swing.JLabel jname;
    // End of variables declaration//GEN-END:variables
}
