
package Presentacion;

/**
 *
 * @author codefutura
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnEstudiante = new javax.swing.JButton();
        btnCursos = new javax.swing.JButton();
        btnNotas = new javax.swing.JButton();
        btnCxc = new javax.swing.JButton();
        btnNomina1 = new javax.swing.JButton();
        btnNomina = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Luz del Futuro, sistema de gestión de colegios");
        setPreferredSize(new java.awt.Dimension(800, 600));

        jToolBar1.setRollover(true);

        btnEstudiante.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/students.png"))); // NOI18N
        btnEstudiante.setText("Estudiantes");
        btnEstudiante.setBorderPainted(false);
        btnEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstudiante.setFocusable(false);
        btnEstudiante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEstudiante.setMaximumSize(new java.awt.Dimension(96, 81));
        btnEstudiante.setMinimumSize(new java.awt.Dimension(96, 81));
        btnEstudiante.setOpaque(false);
        btnEstudiante.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEstudiante);

        btnCursos.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/classroom.png"))); // NOI18N
        btnCursos.setText("Cursos");
        btnCursos.setToolTipText("");
        btnCursos.setBorderPainted(false);
        btnCursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCursos.setFocusable(false);
        btnCursos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCursos.setMaximumSize(new java.awt.Dimension(96, 81));
        btnCursos.setMinimumSize(new java.awt.Dimension(96, 81));
        btnCursos.setOpaque(false);
        btnCursos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCursos);

        btnNotas.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/student_calification.png"))); // NOI18N
        btnNotas.setText("Notas");
        btnNotas.setBorderPainted(false);
        btnNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNotas.setFocusable(false);
        btnNotas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNotas.setMaximumSize(new java.awt.Dimension(96, 81));
        btnNotas.setMinimumSize(new java.awt.Dimension(96, 81));
        btnNotas.setOpaque(false);
        btnNotas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnNotas);

        btnCxc.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCxc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/duration_finance.png"))); // NOI18N
        btnCxc.setText("Ctas. x Cobrar");
        btnCxc.setToolTipText("");
        btnCxc.setBorderPainted(false);
        btnCxc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCxc.setFocusable(false);
        btnCxc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCxc.setOpaque(false);
        btnCxc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCxc);

        btnNomina1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnNomina1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/recibo.png"))); // NOI18N
        btnNomina1.setText("Recibo");
        btnNomina1.setBorderPainted(false);
        btnNomina1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNomina1.setFocusable(false);
        btnNomina1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNomina1.setMaximumSize(new java.awt.Dimension(96, 81));
        btnNomina1.setMinimumSize(new java.awt.Dimension(96, 81));
        btnNomina1.setOpaque(false);
        btnNomina1.setPreferredSize(new java.awt.Dimension(96, 81));
        btnNomina1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnNomina1);

        btnNomina.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnNomina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/money_transfer.png"))); // NOI18N
        btnNomina.setText("Nomina");
        btnNomina.setBorderPainted(false);
        btnNomina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNomina.setFocusable(false);
        btnNomina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNomina.setMaximumSize(new java.awt.Dimension(96, 81));
        btnNomina.setMinimumSize(new java.awt.Dimension(96, 81));
        btnNomina.setOpaque(false);
        btnNomina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnNomina);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Luz del Futuro");
        jLabel1.setToolTipText("");

        lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aveNacional.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(lbImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 147, Short.MAX_VALUE)
                .addComponent(lbImagen))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCursos;
    private javax.swing.JButton btnCxc;
    private javax.swing.JButton btnEstudiante;
    private javax.swing.JButton btnNomina;
    private javax.swing.JButton btnNomina1;
    private javax.swing.JButton btnNotas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbImagen;
    // End of variables declaration//GEN-END:variables
}
