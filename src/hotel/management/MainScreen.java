/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management;

/**
 *
 * @author ayush guptA
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
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

        jPanel1 = new javax.swing.JPanel();
        logout_button = new javax.swing.JButton();
        customer_button = new javax.swing.JButton();
        rest_button = new javax.swing.JButton();
        room_button = new javax.swing.JButton();
        staff_button = new javax.swing.JButton();
        add_staff_button = new javax.swing.JButton();
        fb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        logout_button.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        logout_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-exit-32.png"))); // NOI18N
        logout_button.setText("Logout");

        customer_button.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        customer_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-people-64.png"))); // NOI18N
        customer_button.setText("Customer List");

        rest_button.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        rest_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-branding-64.png"))); // NOI18N
        rest_button.setText("Restaurent");

        room_button.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        room_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-address-book-64.png"))); // NOI18N
        room_button.setText("Rooms Available");

        staff_button.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        staff_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-supplier-64.png"))); // NOI18N
        staff_button.setText("Staff Infomation");

        add_staff_button.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        add_staff_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8-name-tag-64.png"))); // NOI18N
        add_staff_button.setText("Add Staff");

        fb.setText("Staff Feedback");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(room_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(customer_button)
                .addGap(185, 185, 185)
                .addComponent(rest_button)
                .addGap(196, 196, 196))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout_button, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fb, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(staff_button)
                .addGap(241, 241, 241)
                .addComponent(add_staff_button)
                .addGap(359, 359, 359))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(logout_button)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customer_button)
                            .addComponent(room_button)
                            .addComponent(rest_button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(staff_button)
                            .addComponent(add_staff_button))
                        .addGap(265, 265, 265)))
                .addComponent(fb))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_staff_button;
    private javax.swing.JButton customer_button;
    private javax.swing.JButton fb;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton rest_button;
    private javax.swing.JButton room_button;
    private javax.swing.JButton staff_button;
    // End of variables declaration//GEN-END:variables
}
