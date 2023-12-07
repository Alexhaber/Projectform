package ProjectForm;

import java.sql.ResultSet;
import Dal.connection;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//Me refiero a esta clase como doppelgänger de "RegistroItem", porque todas las explicaciones de metodos y
//tal, tambien aplican aqui (cuando digo todo, es absolutamente todo).

public class RegistroUser extends javax.swing.JFrame {

    DefaultTableModel model;
    String txtUsername;
    String txtName;
    String txtLastname;
    String txtNum_telefono;
    String txtEmail;
    
    private static RegistroUser Ruser;
    
    private RegistroUser() 
    {
        String[] titles = {"Usuario","Nombre","Apellido","Num_telefono","Email"};
        initComponents();
        model = new DefaultTableModel(null,titles);
        tblUsers.setModel(model);        
        integrarDatos();
    }
    
    //Patron singleton
    public static RegistroUser getInstance()
    {
        if(Ruser == null){
            Ruser = new RegistroUser();
        }
            
        return Ruser;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTree1);

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(207, 207, 207));

        tblUsers.setBackground(new java.awt.Color(51, 204, 255));
        tblUsers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
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
        tblUsers.setToolTipText("Lista de usuarios, todos los usuarios tienen un Username único, no se pueden repetir registros");
        tblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblUsers);

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
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(463, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void integrarDatos()
    {
        while(model.getRowCount()>0){
            model.removeRow(0);
        }
        connection objConnection = new connection("a");
        try
        {   
            
                
            
            ResultSet retorno = objConnection.Consultasql("Select * from usuarios");

            while(retorno.next())
            {
                System.out.println(retorno.getString("Username"));
                System.out.println(retorno.getString("Name"));
                System.out.println(retorno.getString("Last_name"));
                System.out.println(retorno.getString("Phone_number"));
                System.out.println(retorno.getString("Email"));
                
                Object[] objUser = {retorno.getString("Username"), retorno.getString("Name"),retorno.getString("Last_name"), retorno.getString("Phone_number"), retorno.getString("Email")};
                model.addRow(objUser);
            }
        }
        catch(Exception e)
        {
            System.out.println("Conexion fallada" + e);
        }
    }
    
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        SelectFrm selectfr = new SelectFrm();
        selectfr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void tblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMouseClicked
        if(evt.getClickCount() == 1)
        {
            JTable recept = (JTable)evt.getSource();
            
            txtUsername = recept.getModel().getValueAt(recept.getSelectedRow(),0).toString();
            txtName = recept.getModel().getValueAt(recept.getSelectedRow(),1).toString();
            txtLastname = recept.getModel().getValueAt(recept.getSelectedRow(),2).toString();
            txtNum_telefono = recept.getModel().getValueAt(recept.getSelectedRow(),3).toString();
            txtEmail = recept.getModel().getValueAt(recept.getSelectedRow(),4).toString();  
            
            EditarTablas edittbl = new EditarTablas();
            edittbl.setCampo1(txtUsername);
            edittbl.setCampo2(txtName);
            edittbl.setCampo3(txtLastname);
            edittbl.setCampo4(String.valueOf(txtNum_telefono));
            edittbl.setCampo5(String.valueOf(txtEmail));
            edittbl.btnadd.setVisible(false);
            edittbl.setSelect("a");
            
            edittbl.setVisible(true);
        }
    }//GEN-LAST:event_tblUsersMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JTable tblUsers;
    // End of variables declaration//GEN-END:variables
}
