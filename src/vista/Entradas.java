package vista;

import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Nombres_p;
import modelo.Nombres_pDAO;
import modelo.Producto;
import modelo.ProductoDAO;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


public class Entradas extends javax.swing.JPanel {
    
    private TextAutoCompleter ac;
    Producto p = new Producto();
    ProductoDAO pdao = new ProductoDAO();
    Nombres_p np = new Nombres_p();
    Nombres_pDAO npdao = new Nombres_pDAO();
    DefaultTableModel modelo = new DefaultTableModel();
    TableRowSorter tr;
    int id;
    
    public Entradas() {
        initComponents();
        listarEntrada();
        desabilitar();
        agregarauto();
        
        btnactualizar.setEnabled(false);
        btnagregar.setEnabled(false);
        btneliminar.setEnabled(false);
        
        Tabla.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        Tabla.getTableHeader().setOpaque(false);
        Tabla.getTableHeader().setBackground(new Color(129, 236, 236));
        Tabla.getTableHeader().setForeground(new Color(255, 255, 255));
        Tabla.setRowHeight(25);
        ponerFecha();
    }
    
    void ponerFecha(){
        Calendar cal = Calendar.getInstance();
        String fecha = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MARCH) + 1) + "/" + cal.get(Calendar.YEAR);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fechaDate = formato.parse(fecha);
            jDateChooser1.setDate(fechaDate);
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
    void ponerFecha(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fechaDate = formato.parse(fecha);
            jDateChooser1.setDate(fechaDate);
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
    void listarEntrada(){
        List<Producto> lista = pdao.listar();
        modelo = (DefaultTableModel) Tabla.getModel();
        Object[] ob = new Object[7];
        for(int i = 0; i < lista.size(); i++){
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getPrecio_venta();
            ob[3] = lista.get(i).getCantidad();
            ob[4] = lista.get(i).getFecha();
            ob[5] = lista.get(i).getPrecia_entrada();
            ob[6] = lista.get(i).getPrecio_venta()-lista.get(i).getPrecia_entrada();
            modelo.addRow(ob);
        }
        Tabla.setModel(modelo);
    }
    
    void agregarauto(){
        ac = new TextAutoCompleter(txtnombre);
        List<Producto> lista = pdao.listar();
        for(int i = 0; i < lista.size(); i++){
            ac.addItem(lista.get(i).getNombre());
        }
    }
    
    void desabilitar(){
        txtnombre.setEditable(false);
        txtcantidad.setEditable(false);
        txtprecio.setEditable(false);
        txtprecio_entrada.setEditable(false);
    }
    
    void limpiar(){
        txtnombre.setText("");
        txtcantidad.setText("");
        txtprecio.setText("");
        txtprecio_entrada.setText("");
        ponerFecha();
    }
    
    void habilitar(){
        txtnombre.setEditable(true);
        txtcantidad.setEditable(true);
        txtprecio.setEditable(true);
        txtprecio_entrada.setEditable(true);
        jDateChooser1.setEnabled(true);
    }
    
    void vaciarTabla(){
        String titulos[] = {"ID","NOMBRE","PRECIO","STOCK","FECHA","PRECIOE","GANANCIA"};
        modelo = new DefaultTableModel(null,titulos);
        Tabla.setModel(modelo);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtprecio_entrada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(162, 155, 254));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cantidad:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Precio:");

        txtnombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtcantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });

        txtprecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });

        btnagregar.setBackground(new java.awt.Color(116, 185, 255));
        btnagregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnactualizar.setBackground(new java.awt.Color(116, 185, 255));
        btnactualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(116, 185, 255));
        btneliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnnuevo.setBackground(new java.awt.Color(116, 185, 255));
        btnnuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jDateChooser1.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Fecha");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("FILTRO:");

        txtprecio_entrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtprecio_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecio_entradaActionPerformed(evt);
            }
        });
        txtprecio_entrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecio_entradaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Precio entrada");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcantidad))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27)
                                .addComponent(txtprecio))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtprecio_entrada)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 420, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnactualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnagregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnnuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtprecio_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel4)))))
                .addGap(38, 38, 38))
        );

        Tabla.setBackground(new java.awt.Color(162, 155, 254));
        Tabla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "STOCK", "FECHA", "PRECIOE", "GANANCIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setFocusable(false);
        Tabla.setRowHeight(25);
        Tabla.setRowMargin(0);
        Tabla.setSelectionBackground(new java.awt.Color(116, 185, 255));
        Tabla.setShowVerticalLines(false);
        Tabla.getTableHeader().setReorderingAllowed(false);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        agregar();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        limpiar();
        habilitar();
        btnnuevo.setEnabled(false);
        btnagregar.setEnabled(true);
        btnactualizar.setEnabled(false);
        btneliminar.setEnabled(false);
        txtnombre.requestFocus();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        txtcantidad.transferFocus();
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        char c = evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_txtprecioKeyTyped

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        txtprecio.transferFocus();
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c))
        {
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        txtnombre.transferFocus();
    }//GEN-LAST:event_txtnombreActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        try {
            int fila = Tabla.getSelectedRow();
            id = Integer.parseInt(Tabla.getValueAt(fila, 0).toString());
            txtnombre.setText(Tabla.getValueAt(fila, 1).toString());
            txtcantidad.setText(Tabla.getValueAt(fila, 3).toString());
            txtprecio.setText(Tabla.getValueAt(fila, 2).toString());
            txtprecio_entrada.setText(Tabla.getValueAt(fila, 5).toString());
            ponerFecha(Tabla.getValueAt(fila, 4).toString());
            
            btnactualizar.setEnabled(true);
            btneliminar.setEnabled(true);
            btnagregar.setEnabled(false);
            btnnuevo.setEnabled(true);
            habilitar();
        } catch (Exception e) {
            System.out.println("ERROR AL SELECCIONAR UN EQUIPO : " + e.getMessage());
        }
    }//GEN-LAST:event_TablaMouseClicked

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

    private void txtprecio_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecio_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecio_entradaActionPerformed

    private void txtprecio_entradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecio_entradaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecio_entradaKeyTyped

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_btnactualizarActionPerformed

    void agregar(){
        Date fecha1 = jDateChooser1.getDate();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
        
        String fecha = f.format(fecha1);
        
        if(txtnombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL NOMBRE", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtnombre.requestFocus(); //pone el puntero en el textfield
        }else if(txtcantidad.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA CANTIDAD", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtcantidad.requestFocus(); //pone el puntero en el textfield
        }else if(txtprecio.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL PRECIO", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtcantidad.requestFocus(); //pone el puntero en el textfield
        }else if(fecha1 == null){
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA FECHA", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else if(txtprecio_entrada.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL PRECIO ENTRADA", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtprecio_entrada.requestFocus(); //pone el puntero en el textfield
        }else{
            String nombre = txtnombre.getText();
            int cantidad = Integer.parseInt(txtcantidad.getText());
            double precio = Double.parseDouble(txtprecio.getText());
            double precioe = Double.parseDouble(txtprecio_entrada.getText());
            
            Object[] ob = new Object[5];
            ob[0] = nombre;
            ob[1] = cantidad;
            ob[2] = precio;
            ob[3] = fecha;
            ob[4] = precioe;
            pdao.add(ob);
            npdao.add(ob);
            
            JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE");
            limpiar();
            vaciarTabla();
            listarEntrada();
            btnnuevo.setEnabled(true);
            btnactualizar.setEnabled(false);
            btnagregar.setEnabled(false);
            btneliminar.setEnabled(false);
            desabilitar();
        }
    }
    
    void actualizar(){
        int fila = Tabla.getSelectedRow();
        
        Date fecha1 = jDateChooser1.getDate();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
        
        String fecha = f.format(fecha1);
        
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }else{
            if(txtnombre.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL NOMBRE", "Advertencia", JOptionPane.WARNING_MESSAGE);
                txtnombre.requestFocus(); //pone el puntero en el textfield
            }else if(txtcantidad.getText().isEmpty() || txtcantidad.getText().equals("0")){
                JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA CANTIDAD", "Advertencia", JOptionPane.WARNING_MESSAGE);
                txtcantidad.requestFocus(); //pone el puntero en el textfield
            }else if(txtprecio.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL PRECIO", "Advertencia", JOptionPane.WARNING_MESSAGE);
                txtprecio.requestFocus(); //pone el puntero en el textfield
            }else if(fecha1 == null){
                JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA FECHA", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }else if(txtprecio_entrada.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL PRECIO ENTRADA", "Advertencia", JOptionPane.WARNING_MESSAGE);
                txtprecio_entrada.requestFocus(); //pone el puntero en el textfield
            }else{
                String nombre = txtnombre.getText();
                int cantidad = Integer.parseInt(txtcantidad.getText());
                double precio = Double.parseDouble(txtprecio.getText());
                double precioe = Double.parseDouble(txtprecio_entrada.getText());
                
                Object[] ob = new Object[6];
                ob[0] = nombre;
                ob[1] = cantidad;
                ob[2] = precio;
                ob[3] = fecha;
                ob[4] = precioe;
                ob[5] = id;
                pdao.actualizar(ob);
                
                JOptionPane.showMessageDialog(this, "DATOS ACTUALIZADOS CORRECTAMENTE");
                
                limpiar();
                vaciarTabla();
                listarEntrada();
                btnactualizar.setEnabled(false);
                btnagregar.setEnabled(false);
                btneliminar.setEnabled(false);
                btnnuevo.setEnabled(true);
                desabilitar();
            }
        }
    }
    
    void eliminar(){
        
        int fila = Tabla.getSelectedRow();
        
        Date fecha1 = jDateChooser1.getDate();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
        
        String fecha = f.format(fecha1);
        
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }else{
            if(txtnombre.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL NOMBRE", "Advertencia", JOptionPane.WARNING_MESSAGE);
                txtnombre.requestFocus(); //pone el puntero en el textfield
            }else if(txtcantidad.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA CANTIDAD", "Advertencia", JOptionPane.WARNING_MESSAGE);
                txtcantidad.requestFocus(); //pone el puntero en el textfield
            }else if(txtprecio.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "FALTA INGRESAR EL PRECIO", "Advertencia", JOptionPane.WARNING_MESSAGE);
                txtcantidad.requestFocus(); //pone el puntero en el textfield
            }else if(fecha1 == null){
                JOptionPane.showMessageDialog(this, "FALTA INGRESAR LA FECHA", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }else{
                pdao.eliminar(id);
                JOptionPane.showMessageDialog(this, "DATOS Eliminados CORRECTAMENTE");
                
                limpiar();
                vaciarTabla();
                listarEntrada();
                btnactualizar.setEnabled(false);
                btnagregar.setEnabled(false);
                btneliminar.setEnabled(false);
                btnnuevo.setEnabled(true);
                desabilitar();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnnuevo;
    public static com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtprecio_entrada;
    // End of variables declaration//GEN-END:variables
}
