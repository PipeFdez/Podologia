package vista;
import controlador.RegistroDAO;
import controlador.RegistroTratamientoDAO;
import controlador.TratamientoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Registro;
import modelo.Tratamiento;

public class VentanaMostrar extends javax.swing.JFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();

    public VentanaMostrar() {
        initComponents();
        
        modelo.addColumn("Codigo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");   
        modelo.addColumn("Cliente");
        modelo.addColumn("ID Tratamiento");
        modelo.addColumn("Precio");

        
        this.jt_ver.setModel(modelo);
    }
    
    public void limpiarTabla() {
        DefaultTableModel dtm=(DefaultTableModel)jt_ver.getModel();
        int n = jt_ver.getRowCount()-1;
        for (int i = 0; i <=n; i++) {
            dtm.removeRow(dtm.getRowCount()-1);            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_ver = new javax.swing.JTable();
        btn_editar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_estadisticas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Horas");

        jt_ver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Hora", "Cliente", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_ver);
        if (jt_ver.getColumnModel().getColumnCount() > 0) {
            jt_ver.getColumnModel().getColumn(0).setResizable(false);
            jt_ver.getColumnModel().getColumn(1).setResizable(false);
            jt_ver.getColumnModel().getColumn(2).setResizable(false);
            jt_ver.getColumnModel().getColumn(3).setResizable(false);
        }

        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit.png"))); // NOI18N
        btn_editar.setText("Editar hora");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/remove.png"))); // NOI18N
        btn_eliminar.setText("Eliminar Hora");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_buscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Código");

        btn_estadisticas.setText("Estadisticas");
        btn_estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estadisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_estadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_volver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_estadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)jt_ver.getModel();
        int fila=jt_ver.getSelectedRow();
        
        String codigo, fecha, hora, nombreCliente, listaID;
        
        if(fila == -1)
            JOptionPane.showMessageDialog(this, "Debe seleccionar una cita");
        else
        {
            codigo = String.valueOf(jt_ver.getValueAt(fila, 0));
            fecha = String.valueOf(jt_ver.getValueAt(fila, 1));
            hora = String.valueOf(jt_ver.getValueAt(fila, 2));
            nombreCliente = String.valueOf(jt_ver.getValueAt(fila, 3));
            listaID = String.valueOf(jt_ver.getValueAt(fila, 4));
            
            Registro registro = new Registro(codigo, fecha, hora, nombreCliente);
            RegistroDAO regisDAO = new RegistroDAO();
            RegistroTratamientoDAO registroTrataDAO = new RegistroTratamientoDAO();
            
            //Tengo que transformar la lista en un arraylist, y luego separar el contendio en cada ""
            registroTrataDAO.eliminarRegistroTratamiento(codigo);
            registroTrataDAO.ingresarRegistroTratamiento(codigo, listaID);
            
            regisDAO.modificarRegistro(registro);
            JOptionPane.showMessageDialog(this, "Cita Modificado");
            
            limpiarTabla();
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        DefaultTableModel dtm = (DefaultTableModel)jt_ver.getModel();
        int fila=jt_ver.getSelectedRow();
        
        if(fila==-1)
            JOptionPane.showMessageDialog(this, "Debe seleccionar una cita");
        else {
            String codigo = String.valueOf(jt_ver.getValueAt(fila, 0));
            RegistroDAO registroDAO = new RegistroDAO();
            registroDAO.eliminarRegistro(codigo);
            
            JOptionPane.showMessageDialog(this, "Cita Eliminada");
            dtm.removeRow(fila);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        limpiarTabla();
        int precioTotal = 0;
        
        RegistroDAO resgistroDAO = new RegistroDAO();
        TratamientoDAO tratamientoDAO = new TratamientoDAO();
        Registro a = resgistroDAO.buscarRegistro(txt_buscar.getText());
        RegistroTratamientoDAO registroTrataDAO = new RegistroTratamientoDAO();
        
        if(a==null) {
            ArrayList <Registro> registros = resgistroDAO.obtenerTodos();
            
            if(registros.size() == 0)
                JOptionPane.showMessageDialog(this,"No hay citas para mostrar");
            else {
                DefaultTableModel dtm=(DefaultTableModel)jt_ver.getModel();
                
                String [][] datos = new String[registros.size()][6];
               
                for (int i = 0; i < registros.size(); i++) {
                    
                    precioTotal = resgistroDAO.calcularPrecioTotal(registros.get(i).getCodigo());
                    ArrayList<String> idTratamiento = registroTrataDAO.obtenerTratamientosPorRegistro(registros.get(i).getCodigo());
                    
                    datos[i][0] = registros.get(i).getCodigo();
                    datos[i][1] = registros.get(i).getFecha();
                    datos[i][2] = registros.get(i).getHora();
                    datos[i][3] = registros.get(i).getNombreCliente();
                    datos[i][4] = String.valueOf(idTratamiento);;
                    datos[i][5] = String.valueOf(precioTotal);
                    
                    dtm.addRow(datos[i]);
                }
                jt_ver.setModel(dtm);
            }
        }
        else {
            DefaultTableModel dtm=(DefaultTableModel)jt_ver.getModel();
            String [] datos = new String[6];
            precioTotal = resgistroDAO.calcularPrecioTotal(a.getCodigo());
            ArrayList<String> idTratamiento = registroTrataDAO.obtenerTratamientosPorRegistro(a.getCodigo());
            
            datos[0]=a.getCodigo();
            datos[1]=a.getFecha();
            datos[2]=a.getHora();
            datos[3]=a.getNombreCliente();
            datos[4] = String.valueOf(idTratamiento);
            datos[5] = String.valueOf(precioTotal);
            
            dtm.addRow(datos);
            jt_ver.setModel(dtm);    
        }               
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void btn_estadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estadisticasActionPerformed
        VentanaEstadisticas ventanaEstadisticas = new VentanaEstadisticas();
        ventanaEstadisticas.setTitle("Estadisticas");
        ventanaEstadisticas.setLocationRelativeTo(null);
        ventanaEstadisticas.setResizable(false); //modificar tamaño de la ventana
        ventanaEstadisticas.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //No cerrar la ventana con la X
        ventanaEstadisticas.setVisible(true);
    }//GEN-LAST:event_btn_estadisticasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_estadisticas;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt_ver;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
