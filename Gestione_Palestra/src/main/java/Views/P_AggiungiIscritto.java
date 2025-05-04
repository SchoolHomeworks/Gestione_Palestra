package Views;

import Presenters.AggiungiIscrittoPresenter;
import Presenters.InterfaceViews.I_AggiungiIscrittoView;
import javax.swing.JOptionPane;

public class P_AggiungiIscritto extends javax.swing.JPanel implements I_AggiungiIscrittoView{

    private AggiungiIscrittoPresenter _presenter;
    
    public P_AggiungiIscritto() {
        initComponents();
        this._presenter = new AggiungiIscrittoPresenter(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Header = new javax.swing.JLabel();
        L_Nome = new javax.swing.JLabel();
        Fld_Nome = new javax.swing.JTextField();
        L_Cognome = new javax.swing.JLabel();
        Fld_Cognome = new javax.swing.JTextField();
        P_PulAggiungi = new javax.swing.JPanel();
        L_PulAggiungi = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(628, 521));

        L_Header.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        L_Header.setForeground(new java.awt.Color(84, 85, 84));
        L_Header.setText("Aggiungi Iscritto");

        L_Nome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        L_Nome.setForeground(new java.awt.Color(84, 85, 84));
        L_Nome.setText("Nome");

        Fld_Nome.setToolTipText("Inserisci il nome");

        L_Cognome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        L_Cognome.setForeground(new java.awt.Color(84, 85, 84));
        L_Cognome.setText("Cognome");

        Fld_Cognome.setToolTipText("Inserisci il cognome");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(146, 146, 146)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(L_Cognome)
                        .addComponent(Fld_Cognome, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Fld_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L_Nome)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(L_Header))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(P_PulAggiungi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(146, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(L_Header)
                    .addGap(28, 28, 28)
                    .addComponent(L_Nome)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Fld_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(L_Cognome)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Fld_Cognome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(127, 127, 127)
                    .addComponent(P_PulAggiungi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(152, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void P_PulAggiungiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_PulAggiungiMouseClicked
        this._presenter.aggiungiIscritto(Fld_Nome.getText(), Fld_Cognome.getText());
    }//GEN-LAST:event_P_PulAggiungiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fld_Cognome;
    private javax.swing.JTextField Fld_Nome;
    private javax.swing.JLabel L_Cognome;
    private javax.swing.JLabel L_Header;
    private javax.swing.JLabel L_Nome;
    private javax.swing.JLabel L_PulAggiungi;
    private javax.swing.JPanel P_PulAggiungi;
    // End of variables declaration//GEN-END:variables

    @Override
    public void outputAggiuntoConSuccesso() {
        JOptionPane.showMessageDialog(null, "Iscritto aggiunto con Successo!");
    }
}
