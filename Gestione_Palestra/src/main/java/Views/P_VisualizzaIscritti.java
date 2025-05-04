package Views;

import Presenters.InterfaceViews.I_VisualizzaIscrittiView;
import Presenters.VisualizzaIscrittiPresenter;
import javax.swing.table.DefaultTableModel;


public class P_VisualizzaIscritti extends javax.swing.JPanel implements I_VisualizzaIscrittiView{
    
    private VisualizzaIscrittiPresenter _presenter;
            
    public P_VisualizzaIscritti() {
        initComponents();
        this._presenter = new VisualizzaIscrittiPresenter(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Header = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tbl_Iscritti = new javax.swing.JTable();
        P_PulVisualizza = new javax.swing.JPanel();
        L_PulVisualizza = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(628, 521));

        L_Header.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        L_Header.setForeground(new java.awt.Color(84, 85, 84));
        L_Header.setText("Elenco Persone");

        Tbl_Iscritti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Cognome", "N Abb Attivi", "N Abb Scaduti"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tbl_Iscritti);

        P_PulVisualizza.setBackground(new java.awt.Color(1, 116, 153));
        P_PulVisualizza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_PulVisualizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_PulVisualizzaMouseClicked(evt);
            }
        });

        L_PulVisualizza.setBackground(new java.awt.Color(255, 255, 255));
        L_PulVisualizza.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        L_PulVisualizza.setForeground(new java.awt.Color(255, 255, 255));
        L_PulVisualizza.setText("Visualizza");

        javax.swing.GroupLayout P_PulVisualizzaLayout = new javax.swing.GroupLayout(P_PulVisualizza);
        P_PulVisualizza.setLayout(P_PulVisualizzaLayout);
        P_PulVisualizzaLayout.setHorizontalGroup(
            P_PulVisualizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PulVisualizzaLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(L_PulVisualizza)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        P_PulVisualizzaLayout.setVerticalGroup(
            P_PulVisualizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_PulVisualizzaLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(L_PulVisualizza)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(L_Header))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(P_PulVisualizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(L_Header)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(P_PulVisualizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void P_PulVisualizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_PulVisualizzaMouseClicked
        DefaultTableModel model = (DefaultTableModel) Tbl_Iscritti.getModel();
        model.setRowCount(0);
        this._presenter.visualizzaIscritti();
    }//GEN-LAST:event_P_PulVisualizzaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_Header;
    private javax.swing.JLabel L_PulVisualizza;
    private javax.swing.JPanel P_PulVisualizza;
    private javax.swing.JTable Tbl_Iscritti;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void outputVisualizzaIscritto(String[] info_iscritto) {
        DefaultTableModel model = (DefaultTableModel) Tbl_Iscritti.getModel();
        model.addRow(info_iscritto);
    }
}
