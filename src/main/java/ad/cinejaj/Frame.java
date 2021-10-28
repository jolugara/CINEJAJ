package ad.cinejaj;

import java.awt.CardLayout;

public class Frame extends javax.swing.JFrame {
    // Layout de los paneles con información
    private CardLayout card;
    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
        this.setLocationRelativeTo(null);
        // Inicialización del layout de los paneles centrales
        card = (CardLayout)jPanelCentral.getLayout();
        // Inicio de la aplicación con el panel 0 de información
        card.show(jPanelCentral, "Panel0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelSuperior = new javax.swing.JPanel();
        jButtonDia1 = new javax.swing.JButton();
        jButtonDia2 = new javax.swing.JButton();
        jButtonDia3 = new javax.swing.JButton();
        jPanelCentral = new javax.swing.JPanel();
        jPanel0 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jPanelSuperior.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSuperior.setLayout(new java.awt.GridLayout(1, 0));

        jButtonDia1.setBackground(new java.awt.Color(12, 84, 109));
        jButtonDia1.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jButtonDia1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDia1.setText("Día 1");
        jButtonDia1.setToolTipText("");
        jButtonDia1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonDia1.setBorderPainted(false);
        jButtonDia1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jButtonDia1.setFocusPainted(false);
        jButtonDia1.setFocusable(false);
        jButtonDia1.setMaximumSize(new java.awt.Dimension(50, 25));
        jButtonDia1.setMinimumSize(new java.awt.Dimension(50, 25));
        jButtonDia1.setPreferredSize(new java.awt.Dimension(50, 25));
        jButtonDia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDia1ActionPerformed(evt);
            }
        });
        jPanelSuperior.add(jButtonDia1);

        jButtonDia2.setBackground(new java.awt.Color(12, 84, 109));
        jButtonDia2.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jButtonDia2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDia2.setText("Día 2");
        jButtonDia2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonDia2.setBorderPainted(false);
        jButtonDia2.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jButtonDia2.setFocusPainted(false);
        jButtonDia2.setFocusable(false);
        jButtonDia2.setMaximumSize(new java.awt.Dimension(50, 25));
        jButtonDia2.setMinimumSize(new java.awt.Dimension(50, 25));
        jButtonDia2.setPreferredSize(new java.awt.Dimension(50, 25));
        jButtonDia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDia2ActionPerformed(evt);
            }
        });
        jPanelSuperior.add(jButtonDia2);

        jButtonDia3.setBackground(new java.awt.Color(12, 84, 109));
        jButtonDia3.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jButtonDia3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDia3.setText("Día 3");
        jButtonDia3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonDia3.setBorderPainted(false);
        jButtonDia3.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jButtonDia3.setFocusPainted(false);
        jButtonDia3.setFocusable(false);
        jButtonDia3.setMaximumSize(new java.awt.Dimension(50, 25));
        jButtonDia3.setMinimumSize(new java.awt.Dimension(50, 25));
        jButtonDia3.setPreferredSize(new java.awt.Dimension(50, 25));
        jButtonDia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDia3ActionPerformed(evt);
            }
        });
        jPanelSuperior.add(jButtonDia3);

        jPanelCentral.setLayout(new java.awt.CardLayout());

        jPanel0.setBackground(new java.awt.Color(12, 84, 109));
        jPanel0.setPreferredSize(new java.awt.Dimension(626, 508));

        jLabel5.setBackground(new java.awt.Color(12, 84, 109));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ad/img/TRABAJOENEEQUIPO.jpg"))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Festival de Málaga nació en 1998 y en cada una de sus ediciones ha pretendido alcanzar una serie de objetivos, entre ellos,\nfavorecer la difusión y promoción de la cinematografía española, convertirnos en un referente a nivel nacional \ne internacional en el ámbito de las manifestaciones cinematográficas y contribuir al desarrollo de Málaga como una \nciudad abierta y cultural.\n\nFestival de Málaga, que este año cumple su vigésima quinta edición, contribuye poderosamente al desarrollo del cine \nen español presentando sus mejores documentales, cortometrajes, etc., además de rendir homenaje a diferentes \npersonalidades de la industria cinematográfica y organizar numerosos ciclos, exposiciones y actividades paralelas. \nFestival de Málaga quiere llegar a todos los públicos y en su deseo de presentar y potenciar un amplio panorama de la \ncultura cinematográfica pretende estar siempre atento a la formación, a la creatividad y a la innovación, \nenmarcadas dentro de una actividad que destaca por su carácter dinámico en continua evolución y transformación.");

        javax.swing.GroupLayout jPanel0Layout = new javax.swing.GroupLayout(jPanel0);
        jPanel0.setLayout(jPanel0Layout);
        jPanel0Layout.setHorizontalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel0Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextArea1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel0Layout.setVerticalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel0Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCentral.add(jPanel0, "Panel0");

        jPanel1.setBackground(new java.awt.Color(12, 84, 109));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ad/img/estrenos-marzo-2019.jpg"))); // NOI18N

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea2.setRows(5);
        jTextArea2.setText("Tercera sesion, dia 25  [21:00]\n\nMULA\t\t\n\nSesion +18");
        jTextArea2.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea2);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea3.setColumns(20);
        jTextArea3.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea3.setRows(5);
        jTextArea3.setText("Segunda sesion, dia 25  [18:00]\n\nCapitana MARVEL\n\nSesion marvel");
        jTextArea3.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea3);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea4.setColumns(20);
        jTextArea4.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea4.setRows(5);
        jTextArea4.setText("Primera sesion, dia 25  [16:00]\n\nDUMBO\n\nSesion infantil");
        jTextArea4.setFocusable(false);
        jScrollPane3.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanelCentral.add(jPanel1, "Panel1");

        jPanel2.setBackground(new java.awt.Color(12, 84, 109));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ad/img/estrenos-marzo2-2019.jpg"))); // NOI18N

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea5.setColumns(20);
        jTextArea5.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea5.setRows(5);
        jTextArea5.setText("Tercera sesión, dia 26  [21:00]\n\nJohn Wick 3\t\n\nSesión +18");
        jTextArea5.setFocusable(false);
        jScrollPane4.setViewportView(jTextArea5);

        jTextArea6.setEditable(false);
        jTextArea6.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea6.setColumns(20);
        jTextArea6.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea6.setRows(5);
        jTextArea6.setText("Segunda sesión, dia 26 18:00\n\nAlddin\n\nSesión Disnet");
        jTextArea6.setFocusable(false);
        jScrollPane5.setViewportView(jTextArea6);

        jTextArea7.setEditable(false);
        jTextArea7.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea7.setColumns(20);
        jTextArea7.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea7.setRows(5);
        jTextArea7.setText("Primera sesión, dia 26  [16:00]\n\nDetective PIKACHU\n\nSesión infantil");
        jTextArea7.setFocusable(false);
        jScrollPane6.setViewportView(jTextArea7);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanelCentral.add(jPanel2, "Panel2");

        jPanel3.setBackground(new java.awt.Color(12, 84, 109));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ad/img/ba2fe60adf69e21ee5cfec8cc06718b2.jpg"))); // NOI18N

        jTextArea8.setEditable(false);
        jTextArea8.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea8.setColumns(20);
        jTextArea8.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea8.setRows(5);
        jTextArea8.setText("Tercera sesión, dia 26  [21:00]\n\nJohn Wick 3\t\n\nSesión +18");
        jTextArea8.setFocusable(false);
        jScrollPane7.setViewportView(jTextArea8);

        jTextArea9.setEditable(false);
        jTextArea9.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea9.setColumns(20);
        jTextArea9.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea9.setRows(5);
        jTextArea9.setText("Segunda sesión, dia 26  [18:00]\n\nCAZAFANTASMAS\n\nSesión Miedo");
        jTextArea9.setFocusable(false);
        jScrollPane8.setViewportView(jTextArea9);

        jTextArea10.setEditable(false);
        jTextArea10.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea10.setColumns(20);
        jTextArea10.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea10.setRows(5);
        jTextArea10.setText("Primera sesion, dia 27  [16:00]\n\nEscuadron suicida\n\nSesión DC");
        jTextArea10.setFocusable(false);
        jScrollPane9.setViewportView(jTextArea10);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanelCentral.add(jPanel3, "Panel3");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDia1ActionPerformed
        // Deshabilita el botón presionado
        jButtonDia1.setEnabled(false);
        // Cambia la vista al panel 1
        card.show(jPanelCentral, "Panel1");
        // Si los otros botones están deshabilitados los habilita
        if(!jButtonDia2.isEnabled()){
            jButtonDia2.setEnabled(true);
        }
        if(!jButtonDia3.isEnabled()){
            jButtonDia3.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonDia1ActionPerformed

    private void jButtonDia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDia2ActionPerformed
        // Deshabilita el botón presionado
        jButtonDia2.setEnabled(false);
        // Cambia la vista al panel 2
        card.show(jPanelCentral, "Panel2");
        // Si los otros botones están deshabilitados los habilita
        if(!jButtonDia1.isEnabled()){
            jButtonDia1.setEnabled(true);
        }
        if(!jButtonDia3.isEnabled()){
            jButtonDia3.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonDia2ActionPerformed

    private void jButtonDia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDia3ActionPerformed
        // Deshabilita el botón presionado
        jButtonDia3.setEnabled(false);
        // Cambia la vista al panel 3
        card.show(jPanelCentral, "Panel3");
        // Si los otros botones están deshabilitados los habilita
        if(!jButtonDia1.isEnabled()){
            jButtonDia1.setEnabled(true);
        }
        if(!jButtonDia2.isEnabled()){
            jButtonDia2.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonDia3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDia1;
    private javax.swing.JButton jButtonDia2;
    private javax.swing.JButton jButtonDia3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel0;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    // End of variables declaration//GEN-END:variables
}
