package Views;

import Presenters.CercaIscrittoPresenter;
import Presenters.InterfaceViews.I_CercaIscrittoView;
import javax.swing.JOptionPane;

public class P_CercaIscritto extends javax.swing.JPanel implements I_CercaIscrittoView{

    private final CercaIscrittoPresenter _presenter;
    
    public P_CercaIscritto() {
        initComponents();
        this._presenter = new CercaIscrittoPresenter(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Header = new javax.swing.JLabel();
        L_ID = new javax.swing.JLabel();
        Fld_ID = new javax.swing.JTextField();
        P_PulCerca = new javax.swing.JPanel();
        L_PulCerca = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(628, 521));

        L_Header.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        L_Header.setForeground(new java.awt.Color(84, 85, 84));
        L_Header.setText("Cerca Iscritto");

        L_ID.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        L_ID.setForeground(new java.awt.Color(84, 85, 84));
        L_ID.setText("ID Iscritto");

        Fld_ID.setToolTipText("Inserisci il nome");

        P_PulCerca.setBackground(new java.awt.Color(1, 116, 153));
        P_PulCerca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_PulCerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_PulCercaMouseClicked(evt);
            }
        });

        L_PulCerca.setBackground(new java.awt.Color(255, 255, 255));
        L_PulCerca.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        L_PulCerca.setForeground(new java.awt.Color(255, 255, 255));
        L_PulCerca.setText("Cerca");

        javax.swing.GroupLayout P_PulCercaLayout = new javax.swing.GroupLayout(P_PulCerca);
        P_PulCerca.setLayout(P_PulCercaLayout);
        P_PulCercaLayout.setHorizontalGroup(
            P_PulCercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PulCercaLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(L_PulCerca)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        P_PulCercaLayout.setVerticalGroup(
            P_PulCercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_PulCercaLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(L_PulCerca)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(L_Header))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(P_PulCerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(146, 146, 146)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Fld_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L_ID))
                    .addContainerGap(146, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(L_Header)
                .addGap(164, 164, 164)
                .addComponent(P_PulCerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addComponent(L_ID)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Fld_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(401, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void P_PulCercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_PulCercaMouseClicked
        this._presenter.cercaIscritto(Fld_ID.getText());
    }//GEN-LAST:event_P_PulCercaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fld_ID;
    private javax.swing.JLabel L_Header;
    private javax.swing.JLabel L_ID;
    private javax.swing.JLabel L_PulCerca;
    private javax.swing.JPanel P_PulCerca;
    // End of variables declaration//GEN-END:variables

    @Override
    public void outputUtenteTrovato(String[] info_iscritto) {
        String mess = "Iscritto trovato: " + info_iscritto[0] + " " + info_iscritto[1] + " " + info_iscritto[2];
        JOptionPane.showMessageDialog(null, mess);
    }

    @Override
    public void outputUtenteNonTrovato() {
        JOptionPane.showMessageDialog(null, "Iscritto NON trovato");
    }
}
