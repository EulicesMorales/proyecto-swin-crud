/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Models.LoginService;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author damon
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCajero = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(247, 249, 242));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondott.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 350, 500));

        jButton2.setBackground(new java.awt.Color(229, 247, 240));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("X");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 60, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Íconos de salud y farmacia.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 160, 110));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("INICIAR SESION");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 160, 30));

        jButton1.setBackground(new java.awt.Color(136, 226, 181));
        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ingresar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 120, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(126, 226, 206)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.jpg"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        txtCajero.setBackground(new java.awt.Color(255, 255, 255));
        txtCajero.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        txtCajero.setForeground(new java.awt.Color(153, 153, 153));
        txtCajero.setText("ingrese su usuario");
        txtCajero.setBorder(null);
        txtCajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCajeroMousePressed(evt);
            }
        });
        jPanel4.add(txtCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 220, 20));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 340, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(126, 226, 206)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/key.jpg"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtPassword.setText("******");
        txtPassword.setBorder(null);
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordMousePressed(evt);
            }
        });
        jPanel5.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 190, 20));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 340, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow-right.jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 30, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButton3.setText("Olvido su contrasenia?");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 200, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 370, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String usuario = txtCajero.getText();
        String password = new String(txtPassword.getPassword());
    
    // Crear instancia del servicio de login
    LoginService loginService = new LoginService();
    
    if(loginService.autenticar(usuario, password)) {
        JOptionPane.showMessageDialog(this, "Bienvenido, " + usuario);
        // Abrir la siguiente ventana
        new Sistema().setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
    }
    
    // Limpiar el campo de contraseña por seguridad
    txtPassword.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCajeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCajeroMousePressed
        if(txtCajero.getText().equals("ingrese su usuario"))
        {txtCajero.setText("");
        txtCajero.setForeground(Color.black);
        }
        if(String.valueOf(txtPassword.getPassword()).isEmpty())
        {txtPassword.setText("******");
        txtPassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCajeroMousePressed

    private void txtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMousePressed
        if(txtCajero.getText().isEmpty()){
            txtCajero.setText("ingrese su usuario");
            txtCajero.setForeground(Color.gray);
        }
        if(String.valueOf(txtPassword.getPassword()).equals("******"))
            {txtPassword.setText("");
            txtCajero.setForeground(Color.BLACK);
                }
    }//GEN-LAST:event_txtPasswordMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtCajero;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
