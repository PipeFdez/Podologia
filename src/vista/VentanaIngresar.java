package vista;

import controlador.PodologiaDAO;
import javax.swing.JOptionPane;
import modelo.Podologia;

public class VentanaIngresar extends javax.swing.JFrame {


    public VentanaIngresar() {
        initComponents();
        txt_codigo.requestFocus();
    }
    
    public static boolean IsInteger(String text){
        int i;
        try{
            i = Integer.parseInt(text);
            return true;
        } catch (NumberFormatException ex){
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        txt_hora = new javax.swing.JTextField();
        txt_nombreCliente = new javax.swing.JTextField();
        btn_salir = new javax.swing.JButton();
        btn_ingresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_detalle = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Ingresar Datos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Fecha");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Hora");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre Cliente");

        txt_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaActionPerformed(evt);
            }
        });

        txt_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_horaActionPerformed(evt);
            }
        });

        btn_salir.setText("Volver");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Precio");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Detalle de Consulta");

        txt_detalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_detalleActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Código");

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/erase.png"))); // NOI18N
        btn_limpiar.setBorderPainted(false);
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addComponent(txt_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(txt_hora, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(txt_codigo)))
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btn_limpiar)
                        .addGap(18, 18, 18)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txt_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        String codigo, fecha, hora, nombreCliente, detalleProblema;
        int precio;
        Podologia podologia;
        
        codigo = txt_codigo.getText();
        fecha = txt_fecha.getText();
        hora = txt_hora.getText();
        nombreCliente = txt_nombreCliente.getText();
        detalleProblema = txt_detalle.getText();
        
        if (txt_codigo.getText().equals("") || txt_fecha.getText().equals("") ||
            txt_hora.getText().equals("") || txt_nombreCliente.getText().equals("") ||
            txt_detalle.getText().equals("") || txt_precio.getText().equals("")) {
        
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos.");
            return;
        
        } else {
            
            if(IsInteger(txt_precio.getText())){
                precio = Integer.parseInt(txt_precio.getText());

                podologia = new Podologia(codigo, fecha, hora, nombreCliente, detalleProblema, precio);
                PodologiaDAO podDAO = new PodologiaDAO();

                if(podDAO.buscarHora(codigo)==null) {
                    podDAO.ingresarHora(podologia);
                    JOptionPane.showMessageDialog(this, "Hora ingresada");

                    //txt_codigo.setText(null);
                    //txt_fecha.setText(null);
                    //txt_hora.setText(null);
                    //txt_nombreCliente.setText(null);
                    //txt_detalle.setText(null);
                    //txt_precio.setText(null);
                    //txt_codigo.requestFocus();

                } else {
                    JOptionPane.showMessageDialog(this, "Código ya existe...ingrese otro", 
                                                  "¡¡ Advertencia !!", JOptionPane.WARNING_MESSAGE);
                    txt_codigo.setText(null);
                    txt_codigo.requestFocus();
                }

            }else{
                txt_precio.setText(null);
                JOptionPane.showMessageDialog(this, "La cantidad debe ser un número");
                txt_precio.requestFocus();
            }
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void txt_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_horaActionPerformed

    private void txt_detalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_detalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_detalleActionPerformed

    private void txt_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        
    txt_codigo.setText(null);
    txt_fecha.setText(null);
    txt_hora.setText(null);
    txt_nombreCliente.setText(null);
    txt_detalle.setText(null);
    txt_precio.setText(null);
    txt_codigo.requestFocus();
        
    }//GEN-LAST:event_btn_limpiarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_detalle;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_hora;
    private javax.swing.JTextField txt_nombreCliente;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
