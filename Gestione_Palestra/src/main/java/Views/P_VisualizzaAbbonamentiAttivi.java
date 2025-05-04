package Views;

import Presenters.InterfaceViews.I_VisualizzaAbbonamentiAttiviView;
import Presenters.VisualizzaAbbonamentiAttiviPresenter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class P_VisualizzaAbbonamentiAttivi extends javax.swing.JPanel implements I_VisualizzaAbbonamentiAttiviView{

    private VisualizzaAbbonamentiAttiviPresenter _presenter;
    
    public P_VisualizzaAbbonamentiAttivi() {
        initComponents();
        this._presenter = new VisualizzaAbbonamentiAttiviPresenter(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Header = new javax.swing.JLabel();
        L_ID = new javax.swing.JLabel();
        Fld_ID = new javax.swing.JTextField();
        P_PulVisualizza = new javax.swing.JPanel();
        L_PulVisualizza = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tbl_AbbAttivi = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(628, 521));

        L_Header.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        L_Header.setForeground(new java.awt.Color(84, 85, 84));
        L_Header.setText("Visualizza Abbonamenti Attivi");

        L_ID.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        L_ID.setForeground(new java.awt.Color(84, 85, 84));
        L_ID.setText("ID Iscritto");

        Fld_ID.setToolTipText("Inserisci il nome");

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

        Tbl_AbbAttivi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Abbonamento", "Data Inizio", "Data Scadenza"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tbl_AbbAttivi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(L_Header))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(P_PulVisualizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(146, 146, 146)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Fld_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L_ID))
                    .addContainerGap(146, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(L_Header)
                .addGap(123, 123, 123)
                .addComponent(P_PulVisualizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(345, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addComponent(L_ID)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Fld_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(401, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(287, 287, 287)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(107, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void P_PulVisualizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_PulVisualizzaMouseClicked
        DefaultTableModel model = (DefaultTableModel) Tbl_AbbAttivi.getModel();
        model.setRowCount(0);
        this._presenter.visualizzaAbbonamentiAttivi(Fld_ID.getText());
    }//GEN-LAST:event_P_PulVisualizzaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fld_ID;
    private javax.swing.JLabel L_Header;
    private javax.swing.JLabel L_ID;
    private javax.swing.JLabel L_PulVisualizza;
    private javax.swing.JPanel P_PulVisualizza;
    private javax.swing.JTable Tbl_AbbAttivi;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void outputVisualizzaAbbonamento(String[] info_abbonamento) {
        DefaultTableModel model = (DefaultTableModel) Tbl_AbbAttivi.getModel();
        model.addRow(info_abbonamento);
    }

    @Override
    public void outputIscrittoNonTrovato() {
        JOptionPane.showMessageDialog(null, "Iscritto non trovato!");
    }
}
