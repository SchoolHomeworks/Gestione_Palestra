package Presenters;

import Controller.LogsController;
import Models.GestoreIscritti;
import Models.Iscritto;
import Presenters.InterfaceViews.I_CercaIscrittoView;

public class CercaIscrittoPresenter {
    private final I_CercaIscrittoView _view;
    private final GestoreIscritti _iscManager;
    private final LogsController _logsC;
    
    public CercaIscrittoPresenter(I_CercaIscrittoView view){
        this._view = view;
        this._iscManager = GestoreIscritti.getInstance();
        this._logsC = LogsController.getInstance();
    }
    
    public void cercaIscritto(String id){
        Iscritto iscritto = this._iscManager.cercaIscritto(id);
        if(iscritto != null){
            this._view.outputUtenteTrovato(new String[]{iscritto.getNome(), iscritto.getCognome(), iscritto.getID()});
            this._logsC.appendMessaggioLogs("Utente trovato: \n" + iscritto.toString());
        }
        else{
            this._view.outputUtenteNonTrovato();
            this._logsC.appendMessaggioLogs("Utente non trovato!");
        }
    }
}
