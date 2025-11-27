package vista;

import controlador.RegistroDAO;
import controlador.RegistroTratamientoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Registro;

public class VentanaIngresar extends javax.swing.JFrame {

    public VentanaIngresar() {
        initComponents();
        txt_fecha.requestFocus();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        txt_hora = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        btn_salir = new javax.swing.JButton();
        btn_ingresar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        chk_unaEncarnada = new javax.swing.JCheckBox();
        chk_unaHongo = new javax.swing.JCheckBox();
        chk_callo = new javax.swing.JCheckBox();
        chk_hiperqueratosis = new javax.swing.JCheckBox();
        chk_pieAtleta = new javax.swing.JCheckBox();
        chk_diagnostico = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        txt_edad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Ingresar Datos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Fecha (DD-MM-AAAA)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Hora (HH:MM)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre");

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

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/erase.png"))); // NOI18N
        btn_limpiar.setBorderPainted(false);
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Tratamiento");

        chk_unaEncarnada.setText("Uña encarnada");

        chk_unaHongo.setText("Uña con hongo");

        chk_callo.setText("Callos");

        chk_hiperqueratosis.setText("Hiperqueratosis");

        chk_pieAtleta.setText("Pie atleta");

        chk_diagnostico.setText("Diagnostico");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Apellido");

        label1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label1.setText("Edad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(btn_limpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel5)
                                        .addComponent(label1))
                                    .addGap(77, 77, 77))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(108, 108, 108)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_hora)
                            .addComponent(txt_nombre)
                            .addComponent(txt_fecha)
                            .addComponent(txt_apellido)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk_callo)
                                    .addComponent(chk_pieAtleta)
                                    .addComponent(chk_unaEncarnada))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chk_diagnostico)
                                    .addComponent(chk_hiperqueratosis)
                                    .addComponent(chk_unaHongo))
                                .addGap(0, 21, Short.MAX_VALUE))
                            .addComponent(txt_edad, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btn_limpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_hora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_unaEncarnada)
                    .addComponent(chk_diagnostico))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_callo)
                    .addComponent(chk_hiperqueratosis)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_pieAtleta)
                    .addComponent(chk_unaHongo))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        String codigo, fecha, hora, nombre, apellido, edad;
        
        fecha = txt_fecha.getText();
        hora = txt_hora.getText();
        nombre = txt_nombre.getText();
        apellido = txt_apellido.getText();
        edad = txt_edad.getText();
        
        if (fecha.equals("") || hora.equals("") || nombre.equals("") || apellido.equals("") || edad.equals("")) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos.");
            return;
        
        } else {
            
            if(IsInteger(txt_edad.getText())){
                int edadInt = 0;
                edadInt = Integer.parseInt(txt_edad.getText());
                codigo = fecha + "_" + hora;
                Registro registro = new Registro(codigo, fecha, hora, nombre, apellido, edadInt);
                RegistroDAO regisDAO = new RegistroDAO();
                RegistroTratamientoDAO registroTrataDAO = new RegistroTratamientoDAO();

                if (regisDAO.buscarRegistro(codigo) != null) {
                    JOptionPane.showMessageDialog(this, "Ya existe una cita en ese horario");
                    txt_fecha.setText(null);
                    txt_hora.setText(null);
                    txt_fecha.requestFocus();
                    return;
                }

                regisDAO.ingresarRegistro(registro);
                ArrayList<String> tratamientosSeleccionados = new ArrayList<>();

                if (chk_unaEncarnada.isSelected()) tratamientosSeleccionados.add("Uña encarnada");
                if (chk_unaHongo.isSelected()) tratamientosSeleccionados.add("Uña con hongo");
                if (chk_callo.isSelected()) tratamientosSeleccionados.add("Callos");
                if (chk_hiperqueratosis.isSelected()) tratamientosSeleccionados.add("Hiperqueratosis");
                if (chk_pieAtleta.isSelected()) tratamientosSeleccionados.add("Pie de atleta");
                if (chk_diagnostico.isSelected()) tratamientosSeleccionados.add("Diagnostico");

                registroTrataDAO.ingresarRegistroTratamiento(codigo, tratamientosSeleccionados);
                JOptionPane.showMessageDialog(this, "Registro ingresado con " + tratamientosSeleccionados.size() + " tratamientos");
                
            } else {
                txt_edad.setText(null);
                JOptionPane.showMessageDialog(this, "La edad debe ser un número");
                txt_edad.requestFocus();
            }
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void txt_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_horaActionPerformed

    private void txt_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
    txt_fecha.setText(null);
    txt_hora.setText(null);
    txt_nombre.setText(null);
    txt_apellido.setText(null);
    txt_edad.setText(null);
    chk_unaEncarnada.setSelected(false);
    chk_unaHongo.setSelected(false);
    chk_callo.setSelected(false);
    chk_hiperqueratosis.setSelected(false);
    chk_pieAtleta.setSelected(false);
    chk_diagnostico.setSelected(false);
    txt_fecha.requestFocus();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chk_callo;
    private javax.swing.JCheckBox chk_diagnostico;
    private javax.swing.JCheckBox chk_hiperqueratosis;
    private javax.swing.JCheckBox chk_pieAtleta;
    private javax.swing.JCheckBox chk_unaEncarnada;
    private javax.swing.JCheckBox chk_unaHongo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel label1;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_hora;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
