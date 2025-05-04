package Views;

import Presenters.AggiungiAbbonamentoPresenter;
import Presenters.InterfaceViews.I_AggiungiAbbonamentoView;
import javax.swing.JOptionPane;

public class P_AggiungiAbbonamento extends javax.swing.JPanel implements I_AggiungiAbbonamentoView{
    private AggiungiAbbonamentoPresenter _presenter;
    
    public P_AggiungiAbbonamento() {
        initComponents();
        this._presenter = new AggiungiAbbonamentoPresenter(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Header = new javax.swing.JLabel();
        L_ID = new javax.swing.JLabel();
        Fld_ID = new javax.swing.JTextField();
        P_PulAggiungi = new javax.swing.JPanel();
        L_PulAggiungi = new javax.swing.JLabel();
        Fld_OggAbb = new javax.swing.JTextField();
        L_OggAbb = new javax.swing.JLabel();
        Rb_Mensile = new javax.swing.JRadioButton();
        Rb_Annuale = new javax.swing.JRadioButton();
        L_Scadenza = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(628, 521));

        L_Header.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        L_Header.setForeground(new java.awt.Color(84, 85, 84));
        L_Header.setText("Aggiungi Abbonamento");

        L_ID.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        L_ID.setForeground(new java.awt.Color(84, 85, 84));
        L_ID.setText("ID Iscritto");

        Fld_ID.setToolTipText("Inserisci il nome");

        P_PulAggiungi.setBackground(new java.awt.Color(1, 116, 153));
        P_PulAggiungi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_PulAggiungi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_PulAggiungiMouseClicked(evt);
            }
        });

        L_PulAggiungi.setBackground(new java.awt.Color(255, 255, 255));
        L_PulAggiungi.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        L_PulAggiungi.setForeground(new java.awt.Color(255, 255, 255));
        L_PulAggiungi.setText("Aggiungi");

        javax.swing.GroupLayout P_PulAggiungiLayout = new javax.swing.GroupLayout(P_PulAggiungi);
        P_PulAggiungi.setLayout(P_PulAggiungiLayout);
        P_PulAggiungiLayout.setHorizontalGroup(
            P_PulAggiungiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PulAggiungiLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(L_PulAggiungi)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        P_PulAggiungiLayout.setVerticalGroup(
            P_PulAggiungiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_PulAggiungiLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(L_PulAggiungi)
                .addContainerGap())
        );

        Fld_OggAbb.setToolTipText("Inserisci il nome");

        L_OggAbb.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        L_OggAbb.setForeground(new java.awt.Color(84, 85, 84));
        L_OggAbb.setText("Oggetto Abbonamento");

        Rb_Mensile.setText("Mensile");
        Rb_Mensile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb_MensileActionPerformed(evt);
            }
        });

        Rb_Annuale.setText("Annuale");
        Rb_Annuale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb_AnnualeActionPerformed(evt);
            }
        });

        L_Scadenza.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        L_Scadenza.setForeground(new java.awt.Color(84, 85, 84));
        L_Scadenza.setText("Scadenza");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(L_Header)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(P_PulAggiungi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(L_ID)
                                .addComponent(Fld_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(L_Scadenza)
                                .addComponent(Fld_OggAbb, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(L_OggAbb)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Rb_Mensile)
                                    .addGap(28, 28, 28)
                                    .addComponent(Rb_Annuale))))
                        .addGap(140, 140, 140))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(L_Header)
                .addGap(60, 60, 60)
                .addComponent(L_ID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fld_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(L_OggAbb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fld_OggAbb, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(L_Scadenza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rb_Mensile)
                    .addComponent(Rb_Annuale))
                .addGap(18, 18, 18)
                .addComponent(P_PulAggiungi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Rb_MensileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb_MensileActionPerformed
        Rb_Annuale.setSelected(false);
    }//GEN-LAST:event_Rb_MensileActionPerformed

    private void Rb_AnnualeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb_AnnualeActionPerformed
        Rb_Mensile.setSelected(false);
    }//GEN-LAST:event_Rb_AnnualeActionPerformed

    private void P_PulAggiungiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_PulAggiungiMouseClicked
        if(Rb_Mensile.isSelected()){
            this._presenter.aggiungiAbbonamento(Fld_ID.getText(), Fld_OggAbb.getText(), "Mensile");
        }
        if(Rb_Annuale.isSelected()){
            this._presenter.aggiungiAbbonamento(Fld_ID.getText(), Fld_OggAbb.getText(), "Annuale");
        }
    }//GEN-LAST:event_P_PulAggiungiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fld_ID;
    private javax.swing.JTextField Fld_OggAbb;
    private javax.swing.JLabel L_Header;
    private javax.swing.JLabel L_ID;
    private javax.swing.JLabel L_OggAbb;
    private javax.swing.JLabel L_PulAggiungi;
    private javax.swing.JLabel L_Scadenza;
    private javax.swing.JPanel P_PulAggiungi;
    private javax.swing.JRadioButton Rb_Annuale;
    private javax.swing.JRadioButton Rb_Mensile;
    // End of variables declaration//GEN-END:variables

    @Override
    public void outputAbbonamentoAggiuntoConSuccesso() {
        JOptionPane.showMessageDialog(null, "Abbonamento aggiunto con successo!");
    }

    @Override
    public void outputIscrittoNonTrovato() {
        JOptionPane.showMessageDialog(null, "Impossibile aggiungere, iscritto non trovato!");
    }

    @Override
    public void outputAbbonamentoNonValido() {
        JOptionPane.showMessageDialog(null, "Impossibile aggiungere, abbonamento non valido!");
    }
}
