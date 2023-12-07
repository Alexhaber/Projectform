package ProjectForm;

import java.sql.ResultSet;
import Dal.connection;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class RegistroItem extends javax.swing.JFrame {

    DefaultTableModel model;
    String txtName;
    String txtBrand;
    String txtCategory;
    float numPrice;
    int numQuantity;
    
    private static RegistroItem Ritem;
    
    //Se le dan los valore iniciales a tbltems, igual con su doppelgänger
    private RegistroItem() 
    {
        String[] titles = {"Nombre","Marca","Categoría","Precio","Cantidad_disponible"};
        initComponents();
        model = new DefaultTableModel(null,titles);
        tbltems.setModel(model);        
        integrarDatos();
    }
    
    //Patron Singleton para esta clase, y su doppelgänger "RegistroUser" tambien lo tendra aplicado
    public static RegistroItem getInstance()
    {
        if(Ritem == null){
            Ritem = new RegistroItem();
        }
            
        return Ritem;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbltems = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTree1);

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(207, 207, 207));
        setMaximumSize(new java.awt.Dimension(582, 278));
        setMinimumSize(new java.awt.Dimension(520, 278));

        btnAgregar.setBackground(new java.awt.Color(128, 128, 240));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-agregar-propiedad-24.png"))); // NOI18N
        btnAgregar.setText("Añadir");
        btnAgregar.setToolTipText("Edite los datos un usuario, menos el nombre de usuario");
        btnAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tbltems.setBackground(new java.awt.Color(51, 204, 255));
        tbltems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbltems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "Name", "Last_name", "Phone_number", "Email"
            }
        ));
        tbltems.setToolTipText("Lista de usuarios, todos los usuarios tienen un Username único, no se pueden repetir registros");
        tbltems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbltemsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbltems);

        btnCerrar.setBackground(new java.awt.Color(222, 19, 30));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-izquierda-24.png"))); // NOI18N
        btnCerrar.setText("Volver");
        btnCerrar.setToolTipText("Volver a la panatalla del login");
        btnCerrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 326, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //En el boton de agregar se crea una instancia de "EditarTablas" y se ocultan los dos botones que no se
    //utilizaran
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        EditarTablas edittbl = new EditarTablas();
        edittbl.btnGuardar.hide();
        edittbl.btnBorrar.hide();
        edittbl.campo1Switch();
        edittbl.setCampo1(null);
        edittbl.setCampo2(null);
        edittbl.setCampo3(null);
        edittbl.setCampo4(null);
        edittbl.setCampo5(null);
        edittbl.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    //Dota de valores la tabla, ademas se usa para actualizarla cuando se alteran los datos
    //su clase doppelgänger "RegistoUser" tiene un casi identico
    public void integrarDatos()
    {
        while(model.getRowCount()>0){
            model.removeRow(0);
        }
        connection objConnection = new connection("b");
        try
        {   
            ResultSet retorno = objConnection.Consultasql("Select * from Productos");

            while(retorno.next())
            {
                System.out.println(retorno.getString("Name"));
                System.out.println(retorno.getString("Brand"));
                System.out.println(retorno.getString("Category"));
                System.out.println(retorno.getString("Price"));
                System.out.println(retorno.getString("Quantity_available"));
                
                Object[] objItem = {retorno.getString("Name"), retorno.getString("Brand"),retorno.getString("Category"), retorno.getString("Price"), retorno.getString("Quantity_available")};
                model.addRow(objItem);
            }
        }
        catch(Exception e)
        {
            System.out.println("Conexion fallada" + e);
        }
    }
    
    //Simplemente cierra el Jframe
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        SelectFrm SelectFr = new SelectFrm();
        SelectFr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed
    
    //Se obtienen los valores de donde se hace click y se guardan en variables, su doppelgänger hace lo mismo
    //con variables de tipos diferentes
    private void tbltemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbltemsMouseClicked
        if(evt.getClickCount() == 1)
        {
            JTable recept = (JTable)evt.getSource();
            
            txtName = recept.getModel().getValueAt(recept.getSelectedRow(), 0).toString();
            txtBrand = recept.getModel().getValueAt(recept.getSelectedRow(),1).toString();
            txtCategory = recept.getModel().getValueAt(recept.getSelectedRow(),2).toString();
            numPrice = Float.parseFloat(recept.getModel().getValueAt(recept.getSelectedRow(),3).toString());
            numQuantity = Integer.parseInt(recept.getModel().getValueAt(recept.getSelectedRow(),4).toString());
               
            //El valor de las 5 variables de arriba se mananda a los campos de "EditarTablas"
            //Se oculta el boton add, pues no se va a necesitar en este contexto
            //Se le pasa a "setSelect()" el valor b para que solo se realizen acciones relacionadas con este Jframe
            EditarTablas edittbl = new EditarTablas();
            edittbl.setCampo1(txtName);
            edittbl.setCampo2(txtBrand);
            edittbl.setCampo3(txtCategory);
            edittbl.setCampo4(String.valueOf(numPrice));
            edittbl.setCampo5(String.valueOf(numQuantity));
            edittbl.btnadd.setVisible(false);
            edittbl.setSelect("b");
            
            edittbl.setVisible(true);       
        }
    }//GEN-LAST:event_tbltemsMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JTable tbltems;
    // End of variables declaration//GEN-END:variables
}
