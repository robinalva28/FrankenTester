package selenium2test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    //INSTANCIA DE CLASE QUE CONTIENE LOS METODOS A USAR
    Metodos metodos = new Metodos();
    Date fecha = new java.util.Date();
    String linea, fila[],lineaTemp;

    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("FrankenTester Ultra 2.0");

    }

    //LLAMADA A METODOS                                             
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnIniciarTest = new javax.swing.JButton();
        txtweb = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboBoxlistaNavegadores = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        menuSitios = new javax.swing.JMenuItem();
        menuLimpiar = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(102, 204, 255));

        lblTitulo.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 0, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("TESTING EN SELENIUM");

        btnIniciarTest.setBackground(new java.awt.Color(51, 0, 0));
        btnIniciarTest.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIniciarTest.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarTest.setText("Iniciar Test");
        btnIniciarTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarTestActionPerformed(evt);
            }
        });

        txtweb.setBackground(new java.awt.Color(204, 204, 255));
        txtweb.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtweb.setForeground(new java.awt.Color(0, 0, 0));
        txtweb.setText("http://ifts20.com.ar/testing/");
        txtweb.setToolTipText("");
        txtweb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwebActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Sitio Web");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        comboBoxlistaNavegadores.setBackground(new java.awt.Color(102, 102, 102));
        comboBoxlistaNavegadores.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        comboBoxlistaNavegadores.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxlistaNavegadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Navegador", "Google Chrome", "Mozilla Firefox", "Opera" }));
        comboBoxlistaNavegadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxlistaNavegadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtweb, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIniciarTest)
                            .addComponent(comboBoxlistaNavegadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtweb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(comboBoxlistaNavegadores, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnIniciarTest)
                .addGap(38, 38, 38))
        );

        jMenu.setText("Menu");
        jMenu.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        menuSitios.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        menuSitios.setText("Sitios testeados");
        menuSitios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSitiosActionPerformed(evt);
            }
        });
        jMenu.add(menuSitios);

        menuLimpiar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        menuLimpiar.setText("Limpiar todo");
        menuLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLimpiarActionPerformed(evt);
            }
        });
        jMenu.add(menuLimpiar);

        menuSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu.add(menuSalir);

        jMenuBar1.add(jMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//SELECCION DEL NAVEGADOR CON EL CUAL SE TESTEA, EN CADA CASO SE INSTANCIA
    //UN OBJETO DE AUTOMATIZACION SEGUN CORRESPONDA LA OPCION Y SE LLAMA EL METODO QUE LANZA EL TEST
    private boolean comboBoxSeleccion(boolean pruebaExitosa) {
        if (comboBoxlistaNavegadores.getSelectedIndex() == 0) {
            pruebaExitosa = false;
            JOptionPane.showMessageDialog(null, "Seleccione un Navegador donde se hara el test");

        } else if (comboBoxlistaNavegadores.getSelectedIndex() < 4) {
            metodos.seleniumTestNav(txtweb.getText(), leerDatosTxt());
        }
        return pruebaExitosa;
    }

    //METODO PARA EL BOTON PRINCIPAL DE ACCION "TESTEAR"
    public void validarSitio() throws IOException {
        //VARIABLE BOOLEANA QUE DETERMINARA SI SE DOCUMENTA O NO LA PRUEBA
        boolean pruebaExitosa = true;

        // CONDICIONAL CON ALGUNAS VALIDACIONES QUE COMPRUEBEN QUE EL SITIO 
        //TIENE FORMATO CORRECTO O ALGO PARECIDO
        if (!txtweb.getText().equals("") && txtweb.getText().contains(".")
                && !txtweb.getText().contains(",") && !txtweb.getText().contains(" ")) {
            //retorno valor booleano que me dice si se va a documentar o no
            pruebaExitosa = comboBoxSeleccion(pruebaExitosa);
        } else if (txtweb.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Introduzca una Url correcta");
            //retorno valor booleano que me dice si se va a documentar o no
            pruebaExitosa = false;
        }
        //SI EL VALOR BOOLEANO ES CORRECTO, SE DOCUMENTA EL TEST EN EL ARCHIVO DE TEXTO
        if (pruebaExitosa) {
            metodos.addSitioADoc(txtweb.getText());
        }
    }

    public String[] leerDatosTxt() {
        
        try {
            FileReader lector = new FileReader("datos.txt");
            BufferedReader contenido = new BufferedReader(lector);
            linea = contenido.readLine();

            while (linea != null) {
                fila = linea.split(",");
                linea = contenido.readLine();
            }
            

        } catch (IOException ex) {
            System.err.println("Error, " + ex);
        }
        return fila;
    }


    private void btnIniciarTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarTestActionPerformed
        metodos.cargarDrivers(comboBoxlistaNavegadores.getSelectedIndex());
        try {
            validarSitio();
            metodos.cerrar();
        } catch (IOException ex) {
            metodos.cartelito("error al testear, " + ex);
        } catch (Exception ex) {
            metodos.cartelito("Error, " + ex);
        }

    }//GEN-LAST:event_btnIniciarTestActionPerformed


    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void txtwebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwebActionPerformed

    private void menuLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLimpiarActionPerformed
        metodos.limpiarLista();
    }//GEN-LAST:event_menuLimpiarActionPerformed

    private void menuSitiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSitiosActionPerformed
        metodos.crearArchivoTxt();
        ventanaSitios sitios = new ventanaSitios();
        sitios.setVisible(true);
    }//GEN-LAST:event_menuSitiosActionPerformed

    private void comboBoxlistaNavegadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxlistaNavegadoresActionPerformed

    }//GEN-LAST:event_comboBoxlistaNavegadoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarTest;
    private javax.swing.JComboBox<String> comboBoxlistaNavegadores;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuItem menuLimpiar;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem menuSitios;
    private javax.swing.JTextField txtweb;
    // End of variables declaration//GEN-END:variables
}
