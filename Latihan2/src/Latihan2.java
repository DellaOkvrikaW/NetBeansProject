public class Latihan2 extends javax.swing.JFrame {
    public Latihan2() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Hasil1 = new javax.swing.JLabel();
        Hasil2 = new javax.swing.JLabel();
        Hasil3 = new javax.swing.JLabel();
        Hasil4 = new javax.swing.JLabel();
        Hasil5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Hasil Biodata");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 110, 20);

        Hasil1.setText("Hasil1");
        getContentPane().add(Hasil1);
        Hasil1.setBounds(40, 70, 43, 20);

        Hasil2.setText("Hasil2");
        getContentPane().add(Hasil2);
        Hasil2.setBounds(40, 100, 43, 20);

        Hasil3.setText("Hasil3");
        getContentPane().add(Hasil3);
        Hasil3.setBounds(40, 130, 43, 20);

        Hasil4.setText("Hasil4");
        getContentPane().add(Hasil4);
        Hasil4.setBounds(40, 160, 43, 20);

        Hasil5.setText("Hasil5");
        getContentPane().add(Hasil5);
        Hasil5.setBounds(40, 190, 43, 20);

        setBounds(0, 0, 422, 356);
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
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hasil1;
    private javax.swing.JLabel Hasil2;
    private javax.swing.JLabel Hasil3;
    private javax.swing.JLabel Hasil4;
    private javax.swing.JLabel Hasil5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
