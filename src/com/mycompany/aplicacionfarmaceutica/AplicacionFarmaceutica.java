
package com.mycompany.aplicacionfarmaceutica;

import Views.Login;

public class AplicacionFarmaceutica {
   

    public static void main(String[] args) {
    System.out.println("MAIN INICIADO");
    javax.swing.SwingUtilities.invokeLater(() -> {
        System.out.println("Antes de crear Login...");
        try {
            Login ventana = new Login();
            System.out.println("Después de crear Login...");
            ventana.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    });}
}

