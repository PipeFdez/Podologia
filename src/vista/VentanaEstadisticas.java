package vista;

import controlador.RegistroDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.RegistroTratamiento;

public class VentanaEstadisticas extends javax.swing.JFrame {

    public VentanaEstadisticas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        btn_cantdadHoras = new javax.swing.JButton();
        btn_precio = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Estadisticas");
        jLabel1.setToolTipText("");

        btn_cantdadHoras.setText("Cantidad de horas");
        btn_cantdadHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cantdadHorasActionPerformed(evt);
            }
        });

        btn_precio.setText("Tratamiento más solicitado");
        btn_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_precioActionPerformed(evt);
            }
        });

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_volver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1)
                        .addGap(0, 148, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cantdadHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(btn_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_cantdadHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btn_volver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_cantdadHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cantdadHorasActionPerformed
        RegistroDAO dao = new RegistroDAO();
        String fechaInicio = "";
        String fechaFin = "";
        fechaInicio = JOptionPane.showInputDialog("Fecha inicio (DD-MM-AAAA):  ");
        fechaFin = JOptionPane.showInputDialog("Fecha final (DD-MM-AAAA):  ");
        int cant = dao.cantidadDeHorasEntreFechas(fechaInicio, fechaFin);
        JOptionPane.showMessageDialog(this, "Cantidad de horas registradas: " + cant);
    }//GEN-LAST:event_btn_cantdadHorasActionPerformed

    private void btn_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_precioActionPerformed
        RegistroDAO dao = new RegistroDAO();
        JOptionPane.showMessageDialog(this, "Tratamiento más solicitado \n" + dao.tratamientoMasSolicitado());
    }//GEN-LAST:event_btn_precioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cantdadHoras;
    private javax.swing.JButton btn_precio;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
