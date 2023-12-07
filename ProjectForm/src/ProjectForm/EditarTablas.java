package ProjectForm;

import BL.ItemsBL;
import BL.UserBL;
import Dal.connection;
import javax.swing.JTextField;

public class EditarTablas extends javax.swing.JFrame {

    //Se cosigue la instancia de ambas clases "Registro"
    RegistroItem regisItem = RegistroItem.getInstance();
    RegistroUser regisUser = RegistroUser.getInstance();
    
    public EditarTablas() {
        initComponents();
    }
    
    //Se utiliza cuando lo llama otra clase y los botones revisan que su valor sea "a" o "b" y ejecutan su codigo
    //respectivo de cada valor(trabajan con una de las databases)
    //btnadd no la utiliza
    private String Select;
    public void setSelect(String Select) {
        this.Select = Select;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campo1 = new javax.swing.JTextField();
        campo2 = new javax.swing.JTextField();
        campo5 = new javax.swing.JTextField();
        campo3 = new javax.swing.JTextField();
        campo4 = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu para editar datos");
        setMinimumSize(new java.awt.Dimension(245, 310));

        campo1.setEditable(false);
        campo1.setText("Sample1");
        campo1.setToolTipText("");
        campo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo1.setEnabled(false);
        campo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo1ActionPerformed(evt);
            }
        });

        campo2.setText("Sample2");
        campo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campo5.setText("Sample5");
        campo5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo5ActionPerformed(evt);
            }
        });

        campo3.setText("Sample3");
        campo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campo4.setText("Sample4");
        campo4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBorrar.setBackground(new java.awt.Color(243, 19, 9));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-eliminar-24.png"))); // NOI18N
        btnBorrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 112, 215));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-guardar-24 (1).png"))); // NOI18N
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(51, 255, 51));
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-guardar-24 (1).png"))); // NOI18N
        btnadd.setToolTipText("Boton para introducir datos en la database de inventario,\nal presionarlo se cierra solo si todo esta correcto.");
        btnadd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //getter y setters, importante el que sea neutral porque sirve para ambas tablas(de usuarios e inventario)
    public JTextField getCampo1() {
        return campo1;
    }

    public void setCampo1(String campo1) {
        this.campo1.setText(campo1);
    }

    public JTextField getCampo2() {
        return campo2;
    }

    public void setCampo2(String campo2) {
        this.campo2.setText(campo2);
    }

    public JTextField getCampo3() {
        return campo3;
    }

    public void setCampo3(String campo3) {
        this.campo3.setText(campo3);
    }

    public JTextField getCampo4() {
        return campo4;
    }

    public void setCampo4(String campo4) {
        this.campo4.setText(campo4);
    }

    public JTextField getCampo5() {
        return campo5;
    }

    public void setCampo5(String campo5) {
        this.campo5.setText(campo5);
    }
    
    //Modificado justo despues de hacer el video, ahora tambien hace un set a los tooltiptexts de los campos
    public void campo1Switch()
    {
        campo1.setEnabled(true);
        campo1.setEditable(true);
        campo1.setToolTipText("Coloque el nombre del producto");
        campo2.setToolTipText("Coloque la marca del producto");
        campo3.setToolTipText("Coloque la categoría del producto");
        campo4.setToolTipText("Coloque el precio del producto");
        campo5.setToolTipText("Coloque la cantida disponible del producto");
    }
                  
    private void campo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo1ActionPerformed

    private void campo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo5ActionPerformed
    
    //Boton que se utiliza para borrar datos de una db(depende de la variable Select) den base al Jframe que la llama
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if(Select.equals("a")){
            connection objConnection = new connection("a");
            UserBL objUserBL = obtenerUsers();
            
            String txtDelete = String.format("DELETE FROM usuarios WHERE Username = '%s'",objUserBL.getUsername());
            objConnection.EjecutarSql(txtDelete);
            regisUser.integrarDatos();
            this.dispose();
        }
        else if (Select.equals("b")){
            connection objConnection = new connection("b");    
            ItemsBL objItemBL = ObtenerItems();
            String txtDelete = String.format("DELETE FROM Productos WHERE Name = '%s'",objItemBL.getName());
            objConnection.EjecutarSql(txtDelete);
            regisItem.integrarDatos();
            this.dispose();
        }    
            
    }//GEN-LAST:event_btnBorrarActionPerformed

    //Como el nombre lo indica, este boton con polimorfismo(no exactanente, depnede de la variable "Select") edita los valores en las tablas de el Jframe (RegistroItem, RegistroUser) 
    //que llame a este Jframe
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
            if(Select.equals("a")){
                connection objConnection = new connection("a");    
                UserBL objUserBL = obtenerUsers();
                
                String user = objUserBL.getUsername();
                String Update = String.format("Update usuarios Set Name = '%s', Last_name = '%s', Phone_number = '%s', Email = '%s' Where Username = '%s'",objUserBL.getName(),objUserBL.getLast_name(),objUserBL.getPhone_number(),objUserBL.getEmail(), user);
                objConnection.EjecutarSql(Update);
                regisUser.integrarDatos();
                this.dispose();
            }
            else if(Select.equals("b")){
                connection objConnection = new connection("b");    
                ItemsBL objItemBL = ObtenerItems();
                
                String proName = objItemBL.getName();
                //Mucho texto
                String Update = String.format("Update Productos Set Brand = '%s', Category = '%s', Price = '%s', Quantity_available = '%s' Where Name = '%s'",objItemBL.getBrand(),objItemBL.getCategory(),objItemBL.getPrice(),objItemBL.getQuantityAvailable(), proName);
                objConnection.EjecutarSql(Update);
                regisItem.integrarDatos();
                this.dispose();
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    //Boton hecho para agregar datos a la tabla "Productos" de la db "registro_item"
    //solo se hace visible desde "RegistroItem", y los otros 2 se ocultan
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        try{
            connection objConnection = new connection("b");    
            ItemsBL objItemBL = ObtenerItems();
            
            String txtInsert = String.format("Insert into Productos (Name, Brand, Category, Price, Quantity_available)"
              + "values ('%s', '%s', '%s', '%s', '%s')",objItemBL.getName(),objItemBL.getBrand(),objItemBL.getCategory(),objItemBL.getPrice(),objItemBL.getQuantityAvailable());
            objConnection.EjecutarSql(txtInsert);
            regisItem.integrarDatos();  
            this.dispose();
        }
        catch(Exception e){
            System.out.println(e);
        }   
    }//GEN-LAST:event_btnaddActionPerformed

    //Los datos que se obtienen cuando se hace click en la table en "RegistroItem" se guardan aqui, o bueno el valor
    //de las variables se manda a "ItemsBL" para usarse en las diferentes acciones que la involucran
    private ItemsBL ObtenerItems()
    {
        ItemsBL objItemBL = new ItemsBL();
               
        objItemBL.setName(campo1.getText());
        objItemBL.setBrand(campo2.getText());
        objItemBL.setCategory(campo3.getText());
        objItemBL.setPrice(Float.parseFloat(campo4.getText()));
        objItemBL.setQuantityAvailable(Integer.parseInt(campo5.getText()));
        
        return objItemBL;
    }
    
    //Lo mismo que "obtenerUsers" pero  manda los datos a "UserBL"
    private UserBL obtenerUsers()
    {
        UserBL objUserBL = new UserBL();
        
        objUserBL.setUsername(campo1.getText());
        objUserBL.setName(campo2.getText());
        objUserBL.setLast_name(campo3.getText());
        objUserBL.setPhone_number(campo4.getText());
        objUserBL.setEmail(campo5.getText());
        
        return objUserBL;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBorrar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnadd;
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JTextField campo3;
    private javax.swing.JTextField campo4;
    private javax.swing.JTextField campo5;
    // End of variables declaration//GEN-END:variables
}
