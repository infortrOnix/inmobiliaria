
package Vista;

/**
 *
 * @kaiserkey
 * 
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    /**
     * Creates new form VistaInmobiliaria
     */
    public MenuPrincipal() {
        initComponents();
        setTitle("Inmobiliaria");
        setSize(1280,720);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        bMenu = new javax.swing.JMenuBar();
        menu0 = new javax.swing.JMenu();
        mSalir = new javax.swing.JMenuItem();
        menuInmueble = new javax.swing.JMenu();
        mInmueble = new javax.swing.JMenuItem();
        menuInquilino = new javax.swing.JMenu();
        menuContrato = new javax.swing.JMenu();
        menuPropietario = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        menu0.setText("Archivo");

        mSalir.setText("Salir");
        menu0.add(mSalir);

        bMenu.add(menu0);

        menuInmueble.setText("Inmueble");

        mInmueble.setText("Inmueble");
        mInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInmuebleActionPerformed(evt);
            }
        });
        menuInmueble.add(mInmueble);

        bMenu.add(menuInmueble);

        menuInquilino.setText("Inquilino");
        bMenu.add(menuInquilino);

        menuContrato.setText("Contrato");
        bMenu.add(menuContrato);

        menuPropietario.setText("Propietario");
        bMenu.add(menuPropietario);

        setJMenuBar(bMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mInmuebleActionPerformed

    }//GEN-LAST:event_mInmuebleActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane Escritorio;
    public javax.swing.JMenuBar bMenu;
    public javax.swing.JMenuItem mInmueble;
    public javax.swing.JMenuItem mSalir;
    public javax.swing.JMenu menu0;
    public javax.swing.JMenu menuContrato;
    public javax.swing.JMenu menuInmueble;
    public javax.swing.JMenu menuInquilino;
    private javax.swing.JMenu menuPropietario;
    // End of variables declaration//GEN-END:variables
}