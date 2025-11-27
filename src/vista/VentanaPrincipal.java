package vista;

import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_ingresar = new javax.swing.JMenuItem();
        jmi_mostrar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmi_salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(251, 255, 253));
        setMaximumSize(new java.awt.Dimension(2147483647, 6000));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Atención Podologica");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/podosano.png"))); // NOI18N

        jMenu1.setText("Menu");

        jmi_ingresar.setText("Ingresar Hora");
        jmi_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_ingresarActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_ingresar);

        jmi_mostrar.setText("Mostrar Horas");
        jmi_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_mostrarActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_mostrar);
        jMenu1.add(jSeparator1);

        jmi_salir.setText("Salir");
        jmi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_salirActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_salir);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(193, 193, 193))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_ingresarActionPerformed
        VentanaIngresar ventanaIngresar = new VentanaIngresar();
        ventanaIngresar.setTitle("Ingresar");
        ventanaIngresar.setLocationRelativeTo(null);
        ventanaIngresar.setResizable(false); //modificar tamaño de la ventana
        ventanaIngresar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //No cerrar la ventana con la X
        ventanaIngresar.setVisible(true);
    }//GEN-LAST:event_jmi_ingresarActionPerformed

    private void jmi_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_mostrarActionPerformed
        VentanaMostrar VentanaMostrar = new VentanaMostrar();
        VentanaMostrar.setTitle("Horas");
        VentanaMostrar.setLocationRelativeTo(null);
        VentanaMostrar.setResizable(false); //modificar tamaño de la ventana
        VentanaMostrar.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //No cerrar la ventana con la X
        VentanaMostrar.setVisible(true);
    }//GEN-LAST:event_jmi_mostrarActionPerformed

    private void jmi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_salirActionPerformed
        int resp = JOptionPane.showConfirmDialog(
            null,
            "¿Desea continuar?",
            "Confirmación de salida",
            JOptionPane.YES_NO_OPTION
    );
        if (resp == 0){
            dispose();
        }
    }//GEN-LAST:event_jmi_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmi_ingresar;
    private javax.swing.JMenuItem jmi_mostrar;
    private javax.swing.JMenuItem jmi_salir;
    // End of variables declaration//GEN-END:variables
}
