package Views;

import Presenters.InterfaceViews.I_RimuoviIscrittoView;
import Presenters.RimuoviIscrittoPresenter;
import javax.swing.JOptionPane;

public class P_RimuoviIscritto extends javax.swing.JPanel implements I_RimuoviIscrittoView{

    private RimuoviIscrittoPresenter _presenter;
    public P_RimuoviIscritto() {
        initComponents();
        this._presenter = new RimuoviIscrittoPresenter(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Header = new javax.swing.JLabel();
        L_ID = new javax.swing.JLabel();
        Fld_ID = new javax.swing.JTextField();
        P_PulRimuovi = new javax.swing.JPanel();
        L_PulRimuovi = new javax.swing.JLabel();

        L_Header.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        L_Header.setForeground(new java.awt.Color(84, 85, 84));
        L_Header.setText("Rimuovi Iscritto");

        L_ID.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        L_ID.setForeground(new java.awt.Color(84, 85, 84));
        L_ID.setText("ID Iscritto");

        Fld_ID.setToolTipText("Inserisci il nome");

        P_PulRimuovi.setBackground(new java.awt.Color(1, 116, 153));
        P_PulRimuovi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_PulRimuovi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_PulRimuoviMouseClicked(evt);
            }
        });

        L_PulRimuovi.setBackground(new java.awt.Color(255, 255, 255));
        L_PulRimuovi.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        L_PulRimuovi.setForeground(new java.awt.Color(255, 255, 255));
        L_PulRimuovi.setText("Rimuovi");

        javax.swing.GroupLayout P_PulRimuoviLayout = new javax.swing.GroupLayout(P_PulRimuovi);
        P_PulRimuovi.setLayout(P_PulRimuoviLayout);
        P_PulRimuoviLayout.setHorizontalGroup(
            P_PulRimuoviLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PulRimuoviLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(L_PulRimuovi)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        P_PulRimuoviLayout.setVerticalGroup(
            P_PulRimuoviLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_PulRimuoviLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(L_PulRimuovi)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(L_Header))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fld_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L_ID)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(P_PulRimuovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(L_Header)
                .addGap(39, 39, 39)
                .addComponent(L_ID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fld_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(P_PulRimuovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void P_PulRimuoviMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_PulRimuoviMouseClicked
        this._presenter.rimuoviIscritto(Fld_ID.getText());
    }//GEN-LAST:event_P_PulRimuoviMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fld_ID;
    private javax.swing.JLabel L_Header;
    private javax.swing.JLabel L_ID;
    private javax.swing.JLabel L_PulRimuovi;
    private javax.swing.JPanel P_PulRimuovi;
    // End of variables declaration//GEN-END:variables

    @Override
    public void outputIscrittoEliminato() {
        JOptionPane.showMessageDialog(null, "Iscritto eliminato con Sucesso!");
    }

    @Override
    public void outputIscrittoNonTrovato() {
        JOptionPane.showMessageDialog(null, "Impossibile eliminare, iscritto NON trovato!");
    }
}
