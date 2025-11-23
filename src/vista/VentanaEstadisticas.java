package vista;

import controlador.PodologiaDAO;
import javax.swing.JOptionPane;

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

        btn_precio.setText("Cantidad de citas con precio mayor a");
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
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_volver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btn_cantdadHoras)
                .addGap(18, 18, 18)
                .addComponent(btn_precio)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cantdadHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(btn_volver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_cantdadHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cantdadHorasActionPerformed
        PodologiaDAO dao = new PodologiaDAO();
        String fechaInicio = "";
        String fechaFin = "";
        fechaInicio = JOptionPane.showInputDialog("Fecha inicio (DD-MM-AAAA):  ");
        fechaFin = JOptionPane.showInputDialog("Fecha final (DD-MM-AAAA):  ");
        int cant = dao.cantidadDeHorasEntreFechas(fechaInicio, fechaFin);
        JOptionPane.showMessageDialog(this, "Cantidad de horas registradas: " + cant);
    }//GEN-LAST:event_btn_cantdadHorasActionPerformed

    private void btn_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_precioActionPerformed
        PodologiaDAO dao = new PodologiaDAO();
        String monto= "";
        monto = JOptionPane.showInputDialog("Ingrese monto:  ");
        int montoInt = Integer.parseInt(monto);
        int cant = dao.cantidadCitasPrecioMayor(montoInt);
        JOptionPane.showMessageDialog(this, "Cantidad de citas mayor a $" + montoInt + " :  " + cant);
    }//GEN-LAST:event_btn_precioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cantdadHoras;
    private javax.swing.JButton btn_precio;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
