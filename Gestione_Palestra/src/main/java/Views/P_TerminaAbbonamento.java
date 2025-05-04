package Views;

import Presenters.InterfaceViews.I_TerminaAbbonamentoView;
import Presenters.TerminaAbbonamentoPresenter;
import javax.swing.JOptionPane;

public class P_TerminaAbbonamento extends javax.swing.JPanel implements I_TerminaAbbonamentoView{

    private TerminaAbbonamentoPresenter _presenter;
    public P_TerminaAbbonamento() {
        initComponents();
        this._presenter = new TerminaAbbonamentoPresenter(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Header = new javax.swing.JLabel();
        L_ID = new javax.swing.JLabel();
        Fld_ID = new javax.swing.JTextField();
        L_OggAbb = new javax.swing.JLabel();
        Fld_OggAbb = new javax.swing.JTextField();
        P_PulTermina = new javax.swing.JPanel();
        L_PulTermina = new javax.swing.JLabel();

        L_Header.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        L_Header.setForeground(new java.awt.Color(84, 85, 84));
        L_Header.setText("Termina Abbonamento");

        L_ID.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        L_ID.setForeground(new java.awt.Color(84, 85, 84));
        L_ID.setText("ID Iscritto");

        Fld_ID.setToolTipText("Inserisci il nome");

        L_OggAbb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        L_OggAbb.setForeground(new java.awt.Color(84, 85, 84));
        L_OggAbb.setText("Oggetto Abbonamento");

        Fld_OggAbb.setToolTipText("Inserisci il nome");

        P_PulTermina.setBackground(new java.awt.Color(1, 116, 153));
        P_PulTermina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_PulTermina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_PulTerminaMouseClicked(evt);
            }
        });

        L_PulTermina.setBackground(new java.awt.Color(255, 255, 255));
        L_PulTermina.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        L_PulTermina.setForeground(new java.awt.Color(255, 255, 255));
        L_PulTermina.setText("Termina");

        javax.swing.GroupLayout P_PulTerminaLayout = new javax.swing.GroupLayout(P_PulTermina);
        P_PulTermina.setLayout(P_PulTerminaLayout);
        P_PulTerminaLayout.setHorizontalGroup(
            P_PulTerminaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PulTerminaLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(L_PulTermina)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        P_PulTerminaLayout.setVerticalGroup(
            P_PulTerminaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_PulTerminaLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(L_PulTermina)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(L_Header))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(P_PulTermina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(145, 145, 145)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(L_ID)
                        .addComponent(Fld_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Fld_OggAbb, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L_OggAbb))
                    .addContainerGap(146, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(L_Header)
                .addGap(271, 271, 271)
                .addComponent(P_PulTermina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(178, 178, 178)
                    .addComponent(L_ID)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Fld_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(L_OggAbb)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Fld_OggAbb, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(179, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void P_PulTerminaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_PulTerminaMouseClicked
        this._presenter.terminaAbbonamento(Fld_ID.getText(), Fld_OggAbb.getText());
    }//GEN-LAST:event_P_PulTerminaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fld_ID;
    private javax.swing.JTextField Fld_OggAbb;
    private javax.swing.JLabel L_Header;
    private javax.swing.JLabel L_ID;
    private javax.swing.JLabel L_OggAbb;
    private javax.swing.JLabel L_PulTermina;
    private javax.swing.JPanel P_PulTermina;
    // End of variables declaration//GEN-END:variables

    @Override
    public void outputAbbonamentoTerminato() {
        JOptionPane.showMessageDialog(null, "Abbonamento terminato con Successo!");
    }

    @Override
    public void outputUtenteNonTrovato() {
        JOptionPane.showMessageDialog(null, "Impossibile terminare, iscritto non trovato!");
    }

    @Override
    public void outputAbbonamentoNonTrovato() {
        JOptionPane.showMessageDialog(null, "Impossibile terminare, abbonamento non trovato!");
    }
}
