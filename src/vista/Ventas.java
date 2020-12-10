package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Salida;
import modelo.SalidaDAO;

public class Ventas extends javax.swing.JPanel {
    
    Salida s = new Salida();
    SalidaDAO sdao = new SalidaDAO();
    int id;
    TableRowSorter tr;
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    Calendar cal = Calendar.getInstance();
    String fechaM = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MARCH)) + "/" + cal.get(Calendar.YEAR);
    String fecha = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MARCH) + 1) + "/" + cal.get(Calendar.YEAR);
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    public Ventas() {
        initComponents();
        vaciarTabla();
        listarsalida();
        ventas();
        
        Tabla.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        Tabla.getTableHeader().setOpaque(false);
        Tabla.getTableHeader().setBackground(new Color(129, 236, 236));
        Tabla.getTableHeader().setForeground(new Color(255, 255, 255));
        Tabla.setRowHeight(25);
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btncalcular = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnvaciar = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 206, 201));

        Tabla.setBackground(new java.awt.Color(116, 185, 255));
        Tabla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FECHA", "NOMBRE", "CANTIDAD", "PRECIOV", "PRECIOE", "TOTALV", "TOTALG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setFocusable(false);
        Tabla.setRowHeight(25);
        Tabla.setRowMargin(0);
        Tabla.setSelectionBackground(new java.awt.Color(204, 0, 51));
        Tabla.setShowVerticalLines(false);
        Tabla.getTableHeader().setReorderingAllowed(false);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(116, 185, 255));

        jPanel3.setBackground(new java.awt.Color(0, 206, 201));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sell.png"))); // NOI18N

        jTextField1.setBackground(new java.awt.Color(0, 206, 201));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0");
        jTextField1.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Total venta");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(12, 12, 12))
        );

        jComboBox1.setBackground(new java.awt.Color(0, 206, 201));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MENSUAL", "SEMANAL", "QUINCENAL" }));

        btncalcular.setBackground(new java.awt.Color(0, 206, 201));
        btncalcular.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btncalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calculator.png"))); // NOI18N
        btncalcular.setText("CALCULAR");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(0, 206, 201));
        btneliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash.png"))); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.setEnabled(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnvaciar.setBackground(new java.awt.Color(214, 48, 49));
        btnvaciar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnvaciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        btnvaciar.setText("VACIAR");
        btnvaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvaciarActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("FILTRO:");

        jPanel4.setBackground(new java.awt.Color(0, 206, 201));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sell.png"))); // NOI18N

        jTextField3.setBackground(new java.awt.Color(0, 206, 201));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("0");
        jTextField3.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total ganancia");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncalcular)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnvaciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btncalcular)
                                .addComponent(btneliminar))
                            .addGap(18, 18, 18)
                            .addComponent(btnvaciar)
                            .addGap(3, 3, 3)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        try {
            int fila = Tabla.getSelectedRow();
            id = Integer.parseInt(Tabla.getValueAt(fila, 0).toString());
            btneliminar.setEnabled(true);
            
        } catch (Exception e) {
            System.out.println("ERROR AL SELECCIONAR UN EQUIPO : " + e.getMessage());
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        calcular();
    }//GEN-LAST:event_btncalcularActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        sdao.eliminar(id);
        vaciarTabla();
        listarsalida();
        btneliminar.setEnabled(false);
        JOptionPane.showMessageDialog(this, "DATOS Eliminados CORRECTAMENTE");
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnvaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvaciarActionPerformed
        vaciar();
    }//GEN-LAST:event_btnvaciarActionPerformed
    
    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c))
        {
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        
        jTextField2.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent e) {
                tr.setRowFilter(RowFilter.regexFilter("(?i)"+jTextField2.getText(),1));
            }
        });
        
        tr = new TableRowSorter(modelo);
        Tabla.setRowSorter(tr);
    }//GEN-LAST:event_jTextField2KeyTyped
    
    void ventas(){
        double tpagar = 0;
        double tpagarg = 0;
        double pre;
        double pree;
        int cant;
        for (int i = 0; i < Tabla.getRowCount(); i++) {
            cant = Integer.parseInt(Tabla.getValueAt(i, 3).toString());
            pre = Double.parseDouble(Tabla.getValueAt(i, 4).toString());
            pree = Double.parseDouble(Tabla.getValueAt(i, 5).toString());
            tpagarg = tpagarg + (pre-pree)*cant;
            tpagar = tpagar + (cant*pre);
        }
        jTextField3.setText(""+tpagarg);
        jTextField1.setText(""+tpagar);
    }
    
    void calcular(){
        vaciarTabla();
        if(jComboBox1.getSelectedItem().equals("MENSUAL")){
            listarM();
        }else if(jComboBox1.getSelectedItem().equals("SEMANAL")){
            listarS();
        }else listarQ();
        ventas();
    }
    
    void vaciarTabla(){
        String titulos[] = {"ID","FECHA","NOMBRE","CANTIDAD","PRECIOV","PRECIOE","TOTALV","TOTALG"};
        modelo = new DefaultTableModel(null,titulos);
        Tabla.setModel(modelo);
    }
    
    void listarsalida(){
        List<Salida> lista = sdao.listar();
        modelo = (DefaultTableModel) Tabla.getModel();
        Object[] ob = new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId_salida();
            ob[1] = lista.get(i).getFecha();
            ob[2] = lista.get(i).getNombre();            
            ob[3] = lista.get(i).getCantidad();
            ob[4] = lista.get(i).getPrecio();
            ob[5] = lista.get(i).getPrecioe();
            ob[6] = lista.get(i).getTotal();
            ob[7] = (lista.get(i).getPrecio() - lista.get(i).getPrecioe()) * lista.get(i).getCantidad();
            modelo.addRow(ob);
        }
        Tabla.setModel(modelo);
    }
    
    void listarM(){
        List<Salida> lista = sdao.listar();
        modelo = (DefaultTableModel) Tabla.getModel();
        Object[] ob = new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            try {
                Date date1 = formato.parse(fechaM);
                Date date2 = formato.parse(lista.get(i).getFecha());
                if(date1.compareTo(date2) == -1){
                    ob[0] = lista.get(i).getId_salida();
                    ob[1] = lista.get(i).getFecha();
                    ob[2] = lista.get(i).getNombre();            
                    ob[3] = lista.get(i).getCantidad();
                    ob[4] = lista.get(i).getPrecio();
                    ob[5] = lista.get(i).getPrecioe();
                    ob[6] = lista.get(i).getTotal();
                    ob[7] = (lista.get(i).getPrecio() - lista.get(i).getPrecioe()) * lista.get(i).getCantidad();
                    modelo.addRow(ob);
                }
            } catch (ParseException ex) {
                System.out.println("Error:" + ex);
            }
        }
        Tabla.setModel(modelo);
    }
    
    void listarS(){
        List<Salida> lista = sdao.listar();
        modelo = (DefaultTableModel) Tabla.getModel();
        Object[] ob = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            try {
                Date date1 = sumarRestarDiasFecha(formato.parse(fecha),-7);
                Date date2 = formato.parse(lista.get(i).getFecha());
                if(date1.compareTo(date2) == -1){
                    ob[0] = lista.get(i).getId_salida();
                    ob[1] = lista.get(i).getFecha();
                    ob[2] = lista.get(i).getNombre();            
                    ob[3] = lista.get(i).getCantidad();
                    ob[4] = lista.get(i).getPrecio();
                    ob[5] = lista.get(i).getPrecioe();
                    ob[6] = lista.get(i).getTotal();
                    ob[7] = (lista.get(i).getPrecio() - lista.get(i).getPrecioe()) * lista.get(i).getCantidad();
                    modelo.addRow(ob);
                }
            } catch (ParseException ex) {
                System.out.println("Error:" + ex);
            }
        }
    }
    
    void listarQ(){
        List<Salida> lista = sdao.listar();
        modelo = (DefaultTableModel) Tabla.getModel();
        Object[] ob = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            try {
                Date date1 = sumarRestarDiasFecha(formato.parse(fecha),-15);
                Date date2 = formato.parse(lista.get(i).getFecha());
                if(date1.compareTo(date2) == -1){
                    ob[0] = lista.get(i).getId_salida();
                    ob[1] = lista.get(i).getFecha();
                    ob[2] = lista.get(i).getNombre();            
                    ob[3] = lista.get(i).getCantidad();
                    ob[4] = lista.get(i).getPrecio();
                    ob[5] = lista.get(i).getPrecioe();
                    ob[6] = lista.get(i).getTotal();
                    ob[7] = (lista.get(i).getPrecio() - lista.get(i).getPrecioe()) * lista.get(i).getCantidad();
                    modelo.addRow(ob);
                }
            } catch (ParseException ex) {
                System.out.println("Error:" + ex);
            }
        }
    }
    
    public Date sumarRestarDiasFecha(Date fecha, int dias){	
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
	
        calendar.add(Calendar.DAY_OF_YEAR, dias);  // numero de días a añadir, o restar en caso de días<0
	
        return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
    }
    
    public void vaciar(){
        int seguro = JOptionPane.showConfirmDialog(null, "Seguro quieres eliminar todo","CUIDADO",JOptionPane.YES_NO_OPTION);
        if(seguro == JOptionPane.YES_OPTION){
            sdao.vaciar();
            vaciarTabla();
        }else{
            JOptionPane.showMessageDialog(null, "SAPO");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnvaciar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
