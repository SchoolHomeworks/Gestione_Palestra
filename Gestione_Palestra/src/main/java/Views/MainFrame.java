package Views;

import Presenters.InterfaceViews.I_MainView;
import Presenters.MainPresenter;
import Utils.OpzioneMenu;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class MainFrame extends JFrame implements I_MainView {
    private final MainPresenter _presenter;
    private final HashMap<OpzioneMenu, JPanel> _hmPanels;

    private JPanel _sidePanel;
    private JPanel _cardPanel;
    private CardLayout _cardLayout;
    private JPanel _pLogs;

    public MainFrame() {
        this.setupFrame();

        this._presenter = new MainPresenter(this);
        this._hmPanels = new HashMap<>();
        
        this.initComponents();
    }

    private void setupFrame() {
        setTitle("Gestione Palestra");
        setSize(930, 690);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());
    }

    private void initComponents() {
        this.initSidebarMenuPanel();
        this.initMainPanels();
        this.initLogPanel();
        this.creaLayout();
    }

    private void initSidebarMenuPanel() {
        this._sidePanel = new P_SidebarMenu();
        add(this._sidePanel, BorderLayout.WEST);
    }

    private void initMainPanels() {
        this._cardLayout = new CardLayout();
        this._cardPanel = new JPanel(this._cardLayout);
        this._hmPanels.clear();

        aggiungiPanel(OpzioneMenu.AGGIUNGI_ISCRITTO, new P_AggiungiIscritto());
        aggiungiPanel(OpzioneMenu.CERCA_ISCRITTO, new P_CercaIscritto());
        aggiungiPanel(OpzioneMenu.RIMUOVI_ISCRITTO, new P_RimuoviIscritto());
        aggiungiPanel(OpzioneMenu.VISUALIZZA_ISCRITTI, new P_VisualizzaIscritti());
        aggiungiPanel(OpzioneMenu.AGGIUNGI_ABBONAMENTO, new P_AggiungiAbbonamento());
        aggiungiPanel(OpzioneMenu.TERMINA_ABBONAMENTO, new P_TerminaAbbonamento());
        aggiungiPanel(OpzioneMenu.VISUALIZZA_ABBONAMENTI_ATTIVI, new P_VisualizzaAbbonamentiAttivi());
        aggiungiPanel(OpzioneMenu.VISUALIZZA_STORICO_ABBONAMENTI, new P_VisualizzaStoricoAbbonamenti());
    }

    private void aggiungiPanel(OpzioneMenu opzione, JPanel panel) {
        this._hmPanels.put(opzione, panel);
        this._cardPanel.add(panel, opzione.name());
    }

    private void initLogPanel() {
        this._pLogs = new P_Logs();
    }

    private void creaLayout() {
        JPanel centralContainer = new JPanel(new BorderLayout());
        centralContainer.add(this._cardPanel, BorderLayout.CENTER);
        centralContainer.add(this._pLogs, BorderLayout.SOUTH);
        add(centralContainer, BorderLayout.CENTER);
    }

    @Override
    public void mostraOpzione(OpzioneMenu opzione) {
        this._cardLayout.show(this._cardPanel, opzione.name());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
