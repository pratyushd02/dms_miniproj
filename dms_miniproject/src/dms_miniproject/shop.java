/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dms_miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
/**
 *
 * @author praty
 */
public class shop extends javax.swing.JFrame {

    /**
     * Creates new form shop
     */
    public shop() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        m = new javax.swing.JTextField();
        a = new javax.swing.JTextField();
        n = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bed = new javax.swing.JCheckBox();
        bquantity = new javax.swing.JTextField();
        bcolour = new javax.swing.JTextField();
        sofa = new javax.swing.JCheckBox();
        squantity = new javax.swing.JTextField();
        scolour = new javax.swing.JTextField();
        cquantity = new javax.swing.JTextField();
        chair = new javax.swing.JCheckBox();
        ccolour = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 42)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Welcome to Furniture.io");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 440, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 100));

        m.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        m.setForeground(new java.awt.Color(0, 51, 51));
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });
        jPanel2.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 230, 30));

        a.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        a.setForeground(new java.awt.Color(0, 51, 51));
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        jPanel2.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 230, 30));

        n.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        n.setForeground(new java.awt.Color(0, 51, 51));
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });
        jPanel2.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 230, 30));

        jLabel6.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Mobile No:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 120, -1));

        jLabel5.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Address:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 120, -1));

        jLabel4.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Name:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 120, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 51));
        jButton2.setText("<- Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 120, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("Pay ->");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 130, -1));

        bed.setBackground(new java.awt.Color(0, 153, 153));
        bed.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        bed.setForeground(new java.awt.Color(0, 51, 51));
        bed.setText("Bed");
        jPanel2.add(bed, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 80, -1));

        bquantity.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        bquantity.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(bquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 90, 30));

        bcolour.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        bcolour.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(bcolour, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 100, 30));

        sofa.setBackground(new java.awt.Color(0, 153, 153));
        sofa.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        sofa.setForeground(new java.awt.Color(0, 51, 51));
        sofa.setText("Sofa");
        jPanel2.add(sofa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 80, -1));

        squantity.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        squantity.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(squantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 90, 30));

        scolour.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        scolour.setForeground(new java.awt.Color(0, 51, 51));
        scolour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scolourActionPerformed(evt);
            }
        });
        jPanel2.add(scolour, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 100, 30));

        cquantity.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        cquantity.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(cquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 90, 30));

        chair.setBackground(new java.awt.Color(0, 153, 153));
        chair.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        chair.setForeground(new java.awt.Color(0, 51, 51));
        chair.setText("Chair");
        chair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chairActionPerformed(evt);
            }
        });
        jPanel2.add(chair, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 90, -1));

        ccolour.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        ccolour.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.add(ccolour, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 100, 30));

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Type");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 70, -1));

        jLabel2.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Quantity");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 110, -1));

        jLabel3.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Colour Preference");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 210, -1));

        jLabel9.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 51));
        jLabel9.setText("*SELECT ITEMS");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        home h = new home(); 
        h.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void chairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int amount1=0;
        int amount2=0;
        int amount3=0;
        int amount =0;
        String type="";
        String type1 = "";
        String type2 = "";
        String type3 = "";
        if(chair.isSelected()){
            amount1 = 5000* Integer.parseInt(cquantity.getText());
            type1 = "Chair : "+ ccolour.getText();
        }
        if(sofa.isSelected()){
            amount2 = 10000* Integer.parseInt(squantity.getText());
            type2 = "Sofa : "+ scolour.getText();
        }
        if(bed.isSelected()){
            amount3 = 15000* Integer.parseInt(bquantity.getText());
            type3 = "Bed : "+ bcolour.getText();
        }
        amount = amount1+amount2+amount3;
        type = type1+type2+type3;
        PreparedStatement pst = null;
        PreparedStatement pst2 = null;
        Connection connector = null;
        display d = new display();
        try{
            
            DriverManager.registerDriver(new org.postgresql.Driver());
            String url = "jdbc:postgresql://localhost:5432/exp";
            Properties parameters = new Properties();
            parameters.put("user", "postgres");
            parameters.put("password", "root");
            connector = DriverManager.getConnection(url, parameters);
            pst = connector.prepareStatement("insert into \"public\".orders(type,time,price) values(?,?,?)");
            pst.setString(1,type);
            Date currentdate = new Date();
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            pst.setString(2,dateformat.format(currentdate));
            pst.setLong(3, amount);
            
            /*pst2 = connector.prepareStatement("select name,address,mobnumber from \"public\".customer,\"public\".orders where orders.order_id = customer.customer_id");
            ResultSet rs = pst2.executeQuery();
            
            if (rs.next()){
                String n =rs.getString(1);
                d.n.setText(n);
                d.a.setText(rs.getString(2));
                d.m.setText(Long.toString(rs.getLong(3)));
            }*/
            
            d.n.setEditable(false);
            d.a.setEditable(false);
            d.m.setEditable(false);
            d.o.setEditable(false);
            d.amt.setEditable(false);
            
            d.n.setText(n.getText());
            d.a.setText(a.getText());
            d.m.setText(m.getText());
            d.o.setText(type);
            d.amt.setText(Integer.toString(amount));
            
            
            int r = pst.executeUpdate();
            pst.close();
           
            connector.close();
            
}catch(SQLException e){ System.out.println("ERROR"+ e); }
        
        d.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void scolourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scolourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scolourActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mActionPerformed

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
            java.util.logging.Logger.getLogger(shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField a;
    private javax.swing.JTextField bcolour;
    private javax.swing.JCheckBox bed;
    private javax.swing.JTextField bquantity;
    private javax.swing.JTextField ccolour;
    private javax.swing.JCheckBox chair;
    private javax.swing.JTextField cquantity;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField m;
    public javax.swing.JTextField n;
    private javax.swing.JTextField scolour;
    private javax.swing.JCheckBox sofa;
    private javax.swing.JTextField squantity;
    // End of variables declaration//GEN-END:variables
}
