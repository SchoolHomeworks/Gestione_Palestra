package Presenters;

import Controller.LogsController;
import Models.GestoreIscritti;
import Models.Iscritto;
import Presenters.InterfaceViews.I_AggiungiIscrittoView;

public class AggiungiIscrittoPresenter {
    private final I_AggiungiIscrittoView _view;
    private final GestoreIscritti _iscManager;
    private final LogsController _logsC;
    
    public AggiungiIscrittoPresenter(I_AggiungiIscrittoView view){
        this._view = view;
        this._iscManager = GestoreIscritti.getInstance();
        this._logsC = LogsController.getInstance();
    }
    
    public void aggiungiIscritto(String nome, String cognome){
        Iscritto iscritto = new Iscritto(nome, cognome);
        this._iscManager.aggiungiIscritto(iscritto);
        this._view.outputAggiuntoConSuccesso();
        this._logsC.appendMessaggioLogs("Iscritto aggiunto con successo: \n" + iscritto.toString());
    }
}
