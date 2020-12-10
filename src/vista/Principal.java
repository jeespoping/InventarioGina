package vista;

import java.awt.Color;
import paneles.CambiaPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Timer;

public class Principal extends javax.swing.JFrame {
    
    private Timer timer;
    
    Principal() {
           initComponents();
           setLocationRelativeTo(null);
           new CambiaPanel (jPanel1, new Inicio());
       }
    
    public class cronometro implements ActionListener{
           @Override
           public void actionPerformed(ActionEvent evt){
               GregorianCalendar tiempo = new GregorianCalendar();
               int hora,minutos,segundos;
               hora=tiempo.get(Calendar.HOUR);
               minutos=tiempo.get(Calendar.MINUTE);
               segundos=tiempo.get(Calendar.SECOND);
               txtHora1.setText(String.valueOf(hora));
               txtMinutos1.setText(String.valueOf(minutos));
               txtSegundos1.setText(String.valueOf(segundos));
           }
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        seis = new rsbuttom.RSButtonMetro();
        cuatro = new rsbuttom.RSButtonMetro();
        tres = new rsbuttom.RSButtonMetro();
        dos = new rsbuttom.RSButtonMetro();
        uno = new rsbuttom.RSButtonMetro();
        cinco = new rsbuttom.RSButtonMetro();
        siete = new rsbuttom.RSButtonMetro();
        jPanel2 = new javax.swing.JPanel();
        txtSegundos1 = new javax.swing.JLabel();
        txtMinutos1 = new javax.swing.JLabel();
        txtHora1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(9, 132, 227));

        jPanel4.setBackground(new java.awt.Color(116, 185, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventory.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Inventario");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(9, 132, 227));

        seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        seis.setText("Salir");
        seis.setColorHover(new java.awt.Color(116, 185, 255));
        seis.setColorNormal(new java.awt.Color(9, 132, 227));
        seis.setColorPressed(new java.awt.Color(116, 185, 255));
        seis.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        seis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        seis.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        seis.setIconTextGap(30);
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sales.png"))); // NOI18N
        cuatro.setText("Ventas");
        cuatro.setColorHover(new java.awt.Color(116, 185, 255));
        cuatro.setColorNormal(new java.awt.Color(9, 132, 227));
        cuatro.setColorPressed(new java.awt.Color(116, 185, 255));
        cuatro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cuatro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cuatro.setIconTextGap(30);
        cuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuatroMousePressed(evt);
            }
        });
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/package.png"))); // NOI18N
        tres.setText("Salidas");
        tres.setColorHover(new java.awt.Color(116, 185, 255));
        tres.setColorNormal(new java.awt.Color(9, 132, 227));
        tres.setColorPressed(new java.awt.Color(116, 185, 255));
        tres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tres.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        tres.setIconTextGap(30);
        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tresMousePressed(evt);
            }
        });
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/parcel.png"))); // NOI18N
        dos.setText("Entradas");
        dos.setColorHover(new java.awt.Color(116, 185, 255));
        dos.setColorNormal(new java.awt.Color(9, 132, 227));
        dos.setColorPressed(new java.awt.Color(116, 185, 255));
        dos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dos.setIconTextGap(30);
        dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dosMousePressed(evt);
            }
        });
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sydney-opera-house.png"))); // NOI18N
        uno.setText("Inicio");
        uno.setColorHover(new java.awt.Color(116, 185, 255));
        uno.setColorNormal(new java.awt.Color(116, 185, 255));
        uno.setColorPressed(new java.awt.Color(116, 185, 255));
        uno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        uno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        uno.setIconTextGap(30);
        uno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                unoMousePressed(evt);
            }
        });
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/parcel.png"))); // NOI18N
        cinco.setText("Inventario");
        cinco.setColorHover(new java.awt.Color(116, 185, 255));
        cinco.setColorNormal(new java.awt.Color(9, 132, 227));
        cinco.setColorPressed(new java.awt.Color(116, 185, 255));
        cinco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cinco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cinco.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cinco.setIconTextGap(30);
        cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cincoMousePressed(evt);
            }
        });
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/parcel.png"))); // NOI18N
        siete.setText("Efectivo");
        siete.setColorHover(new java.awt.Color(116, 185, 255));
        siete.setColorNormal(new java.awt.Color(9, 132, 227));
        siete.setColorPressed(new java.awt.Color(116, 185, 255));
        siete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        siete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        siete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        siete.setIconTextGap(30);
        siete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sieteMousePressed(evt);
            }
        });
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cuatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(seis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(siete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(uno, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(dos, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addComponent(tres, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(cuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cinco, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(siete, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addComponent(seis, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(9, 132, 227));

        txtSegundos1.setFont(new java.awt.Font("Decker", 1, 25)); // NOI18N
        txtSegundos1.setForeground(new java.awt.Color(255, 255, 255));
        txtSegundos1.setText("00");

        txtMinutos1.setFont(new java.awt.Font("Decker", 1, 25)); // NOI18N
        txtMinutos1.setForeground(new java.awt.Color(255, 255, 255));
        txtMinutos1.setText("00");

        txtHora1.setFont(new java.awt.Font("Decker", 1, 25)); // NOI18N
        txtHora1.setForeground(new java.awt.Color(255, 255, 255));
        txtHora1.setText("00");

        jLabel8.setFont(new java.awt.Font("Decker", 1, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HORA:");

        jLabel6.setFont(new java.awt.Font("Decker", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(":");

        jLabel7.setFont(new java.awt.Font("Decker", 1, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(":");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/android1.png"))); // NOI18N
        jLabel3.setText("CELU TETCH");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/maintenance.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/phone.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/speaker.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHora1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMinutos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSegundos1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(492, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtHora1)
                        .addComponent(txtMinutos1)
                        .addComponent(txtSegundos1)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8)))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(162, 155, 254));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        new CambiaPanel(jPanel1, new Entradas());
        if (this.dos.isSelected()) {
            this.dos.setColorNormal(new Color(116, 185, 255));
            this.uno.setColorNormal(new Color(9,132,227));
            this.tres.setColorNormal(new Color(9,132,227));
            this.cinco.setColorNormal(new Color(9,132,227));
            this.cuatro.setColorNormal(new Color(9,132,227));
            this.siete.setColorNormal(new Color(9,132,227));
        }
    }//GEN-LAST:event_dosActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        new CambiaPanel(jPanel1, new Inicio());
        if (this.uno.isSelected()) {
            this.uno.setColorNormal(new Color(116, 185, 255));
            this.dos.setColorNormal(new Color(9,132,227));
            this.tres.setColorNormal(new Color(9,132,227));
            this.cinco.setColorNormal(new Color(9,132,227));
            this.cuatro.setColorNormal(new Color(9,132,227));
            this.siete.setColorNormal(new Color(9,132,227));
        }
    }//GEN-LAST:event_unoActionPerformed

    private void unoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoMousePressed
        this.uno.setSelected(true);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.siete.setSelected(false);
    }//GEN-LAST:event_unoMousePressed

    private void dosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosMousePressed
        this.dos.setSelected(true);
        this.uno.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.siete.setSelected(false);
    }//GEN-LAST:event_dosMousePressed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        new CambiaPanel(jPanel1, new Salidas());
        if (this.tres.isSelected()) {
            this.tres.setColorNormal(new Color(116, 185, 255));
            this.dos.setColorNormal(new Color(9,132,227));
            this.uno.setColorNormal(new Color(9,132,227));
            this.cinco.setColorNormal(new Color(9,132,227));
            this.cuatro.setColorNormal(new Color(9,132,227));
            this.siete.setColorNormal(new Color(9,132,227));
        }
    }//GEN-LAST:event_tresActionPerformed

    private void tresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresMousePressed
        this.tres.setSelected(true);
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.siete.setSelected(false);
    }//GEN-LAST:event_tresMousePressed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        new CambiaPanel(jPanel1, new Ventas());
        if (this.cuatro.isSelected()) {
            this.cuatro.setColorNormal(new Color(116, 185, 255));
            this.dos.setColorNormal(new Color(9,132,227));
            this.cinco.setColorNormal(new Color(9,132,227));
            this.tres.setColorNormal(new Color(9,132,227));
            this.uno.setColorNormal(new Color(9,132,227));
            this.siete.setColorNormal(new Color(9,132,227));
        }
    }//GEN-LAST:event_cuatroActionPerformed

    private void cuatroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuatroMousePressed
        this.cuatro.setSelected(true);
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cinco.setSelected(false);
        this.siete.setSelected(false);
    }//GEN-LAST:event_cuatroMousePressed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        System.exit(0);
    }//GEN-LAST:event_seisActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        timer=new Timer(1000,new cronometro());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void cincoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincoMousePressed
        this.cuatro.setSelected(false);
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.siete.setSelected(false);
        this.cinco.setSelected(true);
    }//GEN-LAST:event_cincoMousePressed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        new CambiaPanel(jPanel1, new Inventario());
        if (this.cinco.isSelected()) {
            this.dos.setColorNormal(new Color(9,132,227));
            this.cinco.setColorNormal(new Color(116, 185, 255));
            this.uno.setColorNormal(new Color(9,132,227));
            this.tres.setColorNormal(new Color(9,132,227));
            this.cuatro.setColorNormal(new Color(9,132,227));
            this.siete.setColorNormal(new Color(9,132,227));
        }
    }//GEN-LAST:event_cincoActionPerformed

    private void sieteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sieteMousePressed
        this.cuatro.setSelected(false);
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cinco.setSelected(false);
        this.siete.setSelected(true);
    }//GEN-LAST:event_sieteMousePressed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        new CambiaPanel(jPanel1, new Efectivos());
        if (this.siete.isSelected()) {
            this.dos.setColorNormal(new Color(9,132,227));
            this.siete.setColorNormal(new Color(116, 185, 255));
            this.uno.setColorNormal(new Color(9,132,227));
            this.tres.setColorNormal(new Color(9,132,227));
            this.cuatro.setColorNormal(new Color(9,132,227));
            this.cinco.setColorNormal(new Color(9,132,227));
        }
    }//GEN-LAST:event_sieteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro cinco;
    private rsbuttom.RSButtonMetro cuatro;
    private rsbuttom.RSButtonMetro dos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private rsbuttom.RSButtonMetro seis;
    private rsbuttom.RSButtonMetro siete;
    private rsbuttom.RSButtonMetro tres;
    private javax.swing.JLabel txtHora1;
    private javax.swing.JLabel txtMinutos1;
    private javax.swing.JLabel txtSegundos1;
    private rsbuttom.RSButtonMetro uno;
    // End of variables declaration//GEN-END:variables
}
