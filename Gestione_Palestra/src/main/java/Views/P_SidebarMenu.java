package Views;

import Presenters.InterfaceViews.I_MenuView;
import Presenters.MenuPresenter;
import Utils.OpzioneMenu;
import javax.swing.JOptionPane;

public class P_SidebarMenu extends javax.swing.JPanel implements I_MenuView{
    private final MenuPresenter _presenter;
    
    public P_SidebarMenu() {
        initComponents();
        this._presenter = new MenuPresenter(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Header = new javax.swing.JLabel();
        L_Menu = new javax.swing.JLabel();
        P_PulAdd = new javax.swing.JPanel();
        L_ImgAdd = new javax.swing.JLabel();
        L_Add = new javax.swing.JLabel();
        L_frAdd = new javax.swing.JLabel();
        P_PulSearch = new javax.swing.JPanel();
        L_ImgSearch = new javax.swing.JLabel();
        L_Search = new javax.swing.JLabel();
        L_frSearch = new javax.swing.JLabel();
        P_PulAddAbb = new javax.swing.JPanel();
        L_ImgAddAbb = new javax.swing.JLabel();
        L_AddAbb = new javax.swing.JLabel();
        L_frAddAbb = new javax.swing.JLabel();
        P_PulVisIscritti = new javax.swing.JPanel();
        L_ImgVisIscritti = new javax.swing.JLabel();
        L_VisIscritti = new javax.swing.JLabel();
        L_frVisIscritti = new javax.swing.JLabel();
        P_PulVisAbbAtt = new javax.swing.JPanel();
        L_ImgVisAbbAtt = new javax.swing.JLabel();
        L_VisAbbAtt = new javax.swing.JLabel();
        L_frVisAbbAtt = new javax.swing.JLabel();
        P_PulStAbbIscritto = new javax.swing.JPanel();
        L_ImgStAbbIscritto = new javax.swing.JLabel();
        L_StAbbIscritto = new javax.swing.JLabel();
        L_frStAbbIscritto = new javax.swing.JLabel();
        P_PulRem = new javax.swing.JPanel();
        L_ImgRem = new javax.swing.JLabel();
        L_Rem = new javax.swing.JLabel();
        L_frRem = new javax.swing.JLabel();
        Separatore = new javax.swing.JSeparator();
        P_PulTermAbb = new javax.swing.JPanel();
        L_ImgTermAbb = new javax.swing.JLabel();
        L_TermAbb = new javax.swing.JLabel();
        L_frTermAbb = new javax.swing.JLabel();
        P_PulSalva = new javax.swing.JPanel();
        L_ImgSalva = new javax.swing.JLabel();
        L_Salva = new javax.swing.JLabel();
        L_frSalva = new javax.swing.JLabel();

        setBackground(new java.awt.Color(10, 43, 73));
        setPreferredSize(new java.awt.Dimension(252, 521));

        L_Header.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        L_Header.setForeground(new java.awt.Color(255, 255, 255));
        L_Header.setText("Gestione Palestra");

        L_Menu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        L_Menu.setForeground(new java.awt.Color(237, 236, 236));
        L_Menu.setText("Menu");

        P_PulAdd.setBackground(new java.awt.Color(10, 43, 73));
        P_PulAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_PulAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_PulAddMouseClicked(evt);
            }
        });

        L_ImgAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\chris\\Documents\\GitHubScuolaPubblico\\Gestione_di_una_Palestra\\Gestione_Palestra\\src\\main\\java\\Images\\plus.png")); // NOI18N

        L_Add.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_Add.setForeground(new java.awt.Color(237, 236, 236));
        L_Add.setText("Aggiungi Iscritto");

        L_frAdd.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_frAdd.setForeground(new java.awt.Color(237, 236, 236));
        L_frAdd.setText(">");

        javax.swing.GroupLayout P_PulAddLayout = new javax.swing.GroupLayout(P_PulAdd);
        P_PulAdd.setLayout(P_PulAddLayout);
        P_PulAddLayout.setHorizontalGroup(
            P_PulAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_PulAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_ImgAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(L_frAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_PulAddLayout.setVerticalGroup(
            P_PulAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PulAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_PulAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L_ImgAdd)
                    .addGroup(P_PulAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_Add)
                        .addComponent(L_frAdd)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        P_PulSearch.setBackground(new java.awt.Color(10, 43, 73));
        P_PulSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_PulSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_PulSearchMouseClicked(evt);
            }
        });

        L_ImgSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\chris\\Documents\\GitHubScuolaPubblico\\Gestione_di_una_Palestra\\Gestione_Palestra\\src\\main\\java\\Images\\search.png")); // NOI18N

        L_Search.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_Search.setForeground(new java.awt.Color(237, 236, 236));
        L_Search.setText("Cerca Iscritto");

        L_frSearch.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_frSearch.setForeground(new java.awt.Color(237, 236, 236));
        L_frSearch.setText(">");

        javax.swing.GroupLayout P_PulSearchLayout = new javax.swing.GroupLayout(P_PulSearch);
        P_PulSearch.setLayout(P_PulSearchLayout);
        P_PulSearchLayout.setHorizontalGroup(
            P_PulSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_PulSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_ImgSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_Search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(L_frSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_PulSearchLayout.setVerticalGroup(
            P_PulSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PulSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_PulSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L_ImgSearch)
                    .addGroup(P_PulSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_Search)
                        .addComponent(L_frSearch)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        P_PulAddAbb.setBackground(new java.awt.Color(10, 43, 73));
        P_PulAddAbb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_PulAddAbb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_PulAddAbbMouseClicked(evt);
            }
        });

        L_ImgAddAbb.setIcon(new javax.swing.ImageIcon("C:\\Users\\chris\\Documents\\GitHubScuolaPubblico\\Gestione_di_una_Palestra\\Gestione_Palestra\\src\\main\\java\\Images\\add_subscription.png")); // NOI18N

        L_AddAbb.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_AddAbb.setForeground(new java.awt.Color(237, 236, 236));
        L_AddAbb.setText("Aggiungi Abbonamento");

        L_frAddAbb.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_frAddAbb.setForeground(new java.awt.Color(237, 236, 236));
        L_frAddAbb.setText(">");

        javax.swing.GroupLayout P_PulAddAbbLayout = new javax.swing.GroupLayout(P_PulAddAbb);
        P_PulAddAbb.setLayout(P_PulAddAbbLayout);
        P_PulAddAbbLayout.setHorizontalGroup(
            P_PulAddAbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_PulAddAbbLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_ImgAddAbb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_AddAbb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(L_frAddAbb, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_PulAddAbbLayout.setVerticalGroup(
            P_PulAddAbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PulAddAbbLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_PulAddAbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L_ImgAddAbb)
                    .addGroup(P_PulAddAbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_AddAbb)
                        .addComponent(L_frAddAbb)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        P_PulVisIscritti.setBackground(new java.awt.Color(10, 43, 73));
        P_PulVisIscritti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_PulVisIscritti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_PulVisIscrittiMouseClicked(evt);
            }
        });

        L_ImgVisIscritti.setIcon(new javax.swing.ImageIcon("C:\\Users\\chris\\Documents\\GitHubScuolaPubblico\\Gestione_di_una_Palestra\\Gestione_Palestra\\src\\main\\java\\Images\\visualizza_iscritti.png")); // NOI18N

        L_VisIscritti.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_VisIscritti.setForeground(new java.awt.Color(237, 236, 236));
        L_VisIscritti.setText("Visualizza Iscritti");

        L_frVisIscritti.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_frVisIscritti.setForeground(new java.awt.Color(237, 236, 236));
        L_frVisIscritti.setText(">");

        javax.swing.GroupLayout P_PulVisIscrittiLayout = new javax.swing.GroupLayout(P_PulVisIscritti);
        P_PulVisIscritti.setLayout(P_PulVisIscrittiLayout);
        P_PulVisIscrittiLayout.setHorizontalGroup(
            P_PulVisIscrittiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_PulVisIscrittiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_ImgVisIscritti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_VisIscritti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(L_frVisIscritti, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_PulVisIscrittiLayout.setVerticalGroup(
            P_PulVisIscrittiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PulVisIscrittiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_PulVisIscrittiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L_ImgVisIscritti)
                    .addGroup(P_PulVisIscrittiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_VisIscritti)
                        .addComponent(L_frVisIscritti)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        P_PulVisAbbAtt.setBackground(new java.awt.Color(10, 43, 73));
        P_PulVisAbbAtt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_PulVisAbbAtt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_PulVisAbbAttMouseClicked(evt);
            }
        });

        L_ImgVisAbbAtt.setIcon(new javax.swing.ImageIcon("C:\\Users\\chris\\Documents\\GitHubScuolaPubblico\\Gestione_di_una_Palestra\\Gestione_Palestra\\src\\main\\java\\Images\\on.png")); // NOI18N

        L_VisAbbAtt.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_VisAbbAtt.setForeground(new java.awt.Color(237, 236, 236));
        L_VisAbbAtt.setText("Visualizza Abb Attivi");

        L_frVisAbbAtt.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_frVisAbbAtt.setForeground(new java.awt.Color(237, 236, 236));
        L_frVisAbbAtt.setText(">");

        javax.swing.GroupLayout P_PulVisAbbAttLayout = new javax.swing.GroupLayout(P_PulVisAbbAtt);
        P_PulVisAbbAtt.setLayout(P_PulVisAbbAttLayout);
        P_PulVisAbbAttLayout.setHorizontalGroup(
            P_PulVisAbbAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_PulVisAbbAttLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_ImgVisAbbAtt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_VisAbbAtt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(L_frVisAbbAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_PulVisAbbAttLayout.setVerticalGroup(
            P_PulVisAbbAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PulVisAbbAttLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_PulVisAbbAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L_ImgVisAbbAtt)
                    .addGroup(P_PulVisAbbAttLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_VisAbbAtt)
                        .addComponent(L_frVisAbbAtt)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        P_PulStAbbIscritto.setBackground(new java.awt.Color(10, 43, 73));
        P_PulStAbbIscritto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_PulStAbbIscritto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_PulStAbbIscrittoMouseClicked(evt);
            }
        });

        L_ImgStAbbIscritto.setIcon(new javax.swing.ImageIcon("C:\\Users\\chris\\Documents\\GitHubScuolaPubblico\\Gestione_di_una_Palestra\\Gestione_Palestra\\src\\main\\java\\Images\\off.png")); // NOI18N

        L_StAbbIscritto.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_StAbbIscritto.setForeground(new java.awt.Color(237, 236, 236));
        L_StAbbIscritto.setText("Storico Abb Iscritto");

        L_frStAbbIscritto.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_frStAbbIscritto.setForeground(new java.awt.Color(237, 236, 236));
        L_frStAbbIscritto.setText(">");

        javax.swing.GroupLayout P_PulStAbbIscrittoLayout = new javax.swing.GroupLayout(P_PulStAbbIscritto);
        P_PulStAbbIscritto.setLayout(P_PulStAbbIscrittoLayout);
        P_PulStAbbIscrittoLayout.setHorizontalGroup(
            P_PulStAbbIscrittoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_PulStAbbIscrittoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_ImgStAbbIscritto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_StAbbIscritto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(L_frStAbbIscritto, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_PulStAbbIscrittoLayout.setVerticalGroup(
            P_PulStAbbIscrittoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PulStAbbIscrittoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_PulStAbbIscrittoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L_ImgStAbbIscritto)
                    .addGroup(P_PulStAbbIscrittoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_StAbbIscritto)
                        .addComponent(L_frStAbbIscritto)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        P_PulRem.setBackground(new java.awt.Color(10, 43, 73));
        P_PulRem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_PulRem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_PulRemMouseClicked(evt);
            }
        });

        L_ImgRem.setIcon(new javax.swing.ImageIcon("C:\\Users\\chris\\Documents\\GitHubScuolaPubblico\\Gestione_di_una_Palestra\\Gestione_Palestra\\src\\main\\java\\Images\\trash.png")); // NOI18N

        L_Rem.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_Rem.setForeground(new java.awt.Color(237, 236, 236));
        L_Rem.setText("Rimuovi Iscritto");

        L_frRem.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_frRem.setForeground(new java.awt.Color(237, 236, 236));
        L_frRem.setText(">");

        javax.swing.GroupLayout P_PulRemLayout = new javax.swing.GroupLayout(P_PulRem);
        P_PulRem.setLayout(P_PulRemLayout);
        P_PulRemLayout.setHorizontalGroup(
            P_PulRemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_PulRemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_ImgRem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_Rem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(L_frRem, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_PulRemLayout.setVerticalGroup(
            P_PulRemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PulRemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_PulRemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L_ImgRem)
                    .addGroup(P_PulRemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_Rem)
                        .addComponent(L_frRem)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        P_PulTermAbb.setBackground(new java.awt.Color(10, 43, 73));
        P_PulTermAbb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_PulTermAbb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_PulTermAbbMouseClicked(evt);
            }
        });

        L_ImgTermAbb.setIcon(new javax.swing.ImageIcon("C:\\Users\\chris\\Documents\\GitHubScuolaPubblico\\Gestione_di_una_Palestra\\Gestione_Palestra\\src\\main\\java\\Images\\stop_subscription.png")); // NOI18N

        L_TermAbb.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_TermAbb.setForeground(new java.awt.Color(237, 236, 236));
        L_TermAbb.setText("Termina Abbonamento");

        L_frTermAbb.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_frTermAbb.setForeground(new java.awt.Color(237, 236, 236));
        L_frTermAbb.setText(">");

        javax.swing.GroupLayout P_PulTermAbbLayout = new javax.swing.GroupLayout(P_PulTermAbb);
        P_PulTermAbb.setLayout(P_PulTermAbbLayout);
        P_PulTermAbbLayout.setHorizontalGroup(
            P_PulTermAbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_PulTermAbbLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_ImgTermAbb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_TermAbb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(L_frTermAbb, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_PulTermAbbLayout.setVerticalGroup(
            P_PulTermAbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PulTermAbbLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_PulTermAbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L_ImgTermAbb)
                    .addGroup(P_PulTermAbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_TermAbb)
                        .addComponent(L_frTermAbb)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        P_PulSalva.setBackground(new java.awt.Color(10, 43, 73));
        P_PulSalva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_PulSalva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_PulSalvaMouseClicked(evt);
            }
        });

        L_ImgSalva.setIcon(new javax.swing.ImageIcon("C:\\Users\\chris\\Documents\\GitHubScuolaPubblico\\Gestione_di_una_Palestra\\Gestione_Palestra\\src\\main\\java\\Images\\save.png")); // NOI18N

        L_Salva.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_Salva.setForeground(new java.awt.Color(237, 236, 236));
        L_Salva.setText("Salva le modifiche");

        L_frSalva.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        L_frSalva.setForeground(new java.awt.Color(237, 236, 236));
        L_frSalva.setText(">");

        javax.swing.GroupLayout P_PulSalvaLayout = new javax.swing.GroupLayout(P_PulSalva);
        P_PulSalva.setLayout(P_PulSalvaLayout);
        P_PulSalvaLayout.setHorizontalGroup(
            P_PulSalvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_PulSalvaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_ImgSalva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_Salva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(L_frSalva, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P_PulSalvaLayout.setVerticalGroup(
            P_PulSalvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_PulSalvaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_PulSalvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L_ImgSalva)
                    .addGroup(P_PulSalvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_Salva)
                        .addComponent(L_frSalva)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Separatore, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(L_Menu)
                                    .addComponent(P_PulSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(P_PulAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(P_PulRem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(L_Header))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(P_PulAddAbb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(P_PulVisIscritti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(P_PulVisAbbAtt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(P_PulStAbbIscritto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(P_PulTermAbb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(P_PulSalva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(L_Header, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(L_Menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(P_PulAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_PulSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_PulRem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separatore, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_PulAddAbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_PulTermAbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_PulVisIscritti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_PulVisAbbAtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_PulStAbbIscritto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_PulSalva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void P_PulAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_PulAddMouseClicked
        this._presenter.mostraOpzione(OpzioneMenu.AGGIUNGI_ISCRITTO);
    }//GEN-LAST:event_P_PulAddMouseClicked

    private void P_PulSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_PulSearchMouseClicked
        this._presenter.mostraOpzione(OpzioneMenu.CERCA_ISCRITTO);
    }//GEN-LAST:event_P_PulSearchMouseClicked

    private void P_PulAddAbbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_PulAddAbbMouseClicked
        this._presenter.mostraOpzione(OpzioneMenu.AGGIUNGI_ABBONAMENTO);
    }//GEN-LAST:event_P_PulAddAbbMouseClicked

    private void P_PulVisIscrittiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_PulVisIscrittiMouseClicked
        this._presenter.mostraOpzione(OpzioneMenu.VISUALIZZA_ISCRITTI);
    }//GEN-LAST:event_P_PulVisIscrittiMouseClicked

    private void P_PulVisAbbAttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_PulVisAbbAttMouseClicked
        this._presenter.mostraOpzione(OpzioneMenu.VISUALIZZA_ABBONAMENTI_ATTIVI);
    }//GEN-LAST:event_P_PulVisAbbAttMouseClicked

    private void P_PulStAbbIscrittoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_PulStAbbIscrittoMouseClicked
        this._presenter.mostraOpzione(OpzioneMenu.VISUALIZZA_STORICO_ABBONAMENTI);
    }//GEN-LAST:event_P_PulStAbbIscrittoMouseClicked

    private void P_PulRemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_PulRemMouseClicked
        this._presenter.mostraOpzione(OpzioneMenu.RIMUOVI_ISCRITTO);
    }//GEN-LAST:event_P_PulRemMouseClicked

    private void P_PulTermAbbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_PulTermAbbMouseClicked
        this._presenter.mostraOpzione(OpzioneMenu.TERMINA_ABBONAMENTO);
    }//GEN-LAST:event_P_PulTermAbbMouseClicked

    private void P_PulSalvaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_PulSalvaMouseClicked
        this._presenter.salvaModifiche();
    }//GEN-LAST:event_P_PulSalvaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_Add;
    private javax.swing.JLabel L_AddAbb;
    private javax.swing.JLabel L_Header;
    private javax.swing.JLabel L_ImgAdd;
    private javax.swing.JLabel L_ImgAddAbb;
    private javax.swing.JLabel L_ImgRem;
    private javax.swing.JLabel L_ImgSalva;
    private javax.swing.JLabel L_ImgSearch;
    private javax.swing.JLabel L_ImgStAbbIscritto;
    private javax.swing.JLabel L_ImgTermAbb;
    private javax.swing.JLabel L_ImgVisAbbAtt;
    private javax.swing.JLabel L_ImgVisIscritti;
    private javax.swing.JLabel L_Menu;
    private javax.swing.JLabel L_Rem;
    private javax.swing.JLabel L_Salva;
    private javax.swing.JLabel L_Search;
    private javax.swing.JLabel L_StAbbIscritto;
    private javax.swing.JLabel L_TermAbb;
    private javax.swing.JLabel L_VisAbbAtt;
    private javax.swing.JLabel L_VisIscritti;
    private javax.swing.JLabel L_frAdd;
    private javax.swing.JLabel L_frAddAbb;
    private javax.swing.JLabel L_frRem;
    private javax.swing.JLabel L_frSalva;
    private javax.swing.JLabel L_frSearch;
    private javax.swing.JLabel L_frStAbbIscritto;
    private javax.swing.JLabel L_frTermAbb;
    private javax.swing.JLabel L_frVisAbbAtt;
    private javax.swing.JLabel L_frVisIscritti;
    private javax.swing.JPanel P_PulAdd;
    private javax.swing.JPanel P_PulAddAbb;
    private javax.swing.JPanel P_PulRem;
    private javax.swing.JPanel P_PulSalva;
    private javax.swing.JPanel P_PulSearch;
    private javax.swing.JPanel P_PulStAbbIscritto;
    private javax.swing.JPanel P_PulTermAbb;
    private javax.swing.JPanel P_PulVisAbbAtt;
    private javax.swing.JPanel P_PulVisIscritti;
    private javax.swing.JSeparator Separatore;
    // End of variables declaration//GEN-END:variables

    @Override
    public void outputModificheSalvate() {
        JOptionPane.showMessageDialog(null, "Modfiche salvate con successo!");
    }
}
