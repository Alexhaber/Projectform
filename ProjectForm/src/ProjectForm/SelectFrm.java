package ProjectForm;


public class SelectFrm extends javax.swing.JFrame {

    
    
    public SelectFrm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInventory = new javax.swing.JButton();
        btnUsers = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInventory.setBackground(new java.awt.Color(0, 255, 255));
        btnInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-caja-30.png"))); // NOI18N
        btnInventory.setText("Inventario");
        btnInventory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnInventory.setVerifyInputWhenFocusTarget(false);
        btnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryActionPerformed(evt);
            }
        });

        btnUsers.setBackground(new java.awt.Color(0, 255, 255));
        btnUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-lista-30.png"))); // NOI18N
        btnUsers.setText("Usuarios");
        btnUsers.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(222, 19, 30));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-salida-de-emergencia-24.png"))); // NOI18N
        btnCerrar.setText("Cerrar sesión");
        btnCerrar.setToolTipText("Volver a la panatalla del login");
        btnCerrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //No pude colocar los iconos de manera exacta a como estaba en el ejemplo, osea, arriba del texto
    
    //Obtiene la instancia de "RegistroItem" y se abre el Jframe
    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
        try{
            RegistroItem regisItem = RegistroItem.getInstance();
            regisItem.setVisible(true);
            this.dispose();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnInventoryActionPerformed

    //Lo mismo, pero con "RegistroUser"
    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed
        try{
            RegistroUser regisUser = RegistroUser.getInstance();
            regisUser.setVisible(true);
            this.dispose();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnUsersActionPerformed

    //Crea una instancia de "FormLogin" y lo abre
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        FormLogin LoginFr = new FormLogin();
        LoginFr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnUsers;
    // End of variables declaration//GEN-END:variables
}
