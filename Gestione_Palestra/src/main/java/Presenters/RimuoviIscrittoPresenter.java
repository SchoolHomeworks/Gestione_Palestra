package Presenters;

import Controller.LogsController;
import Models.GestoreIscritti;
import Presenters.InterfaceViews.I_RimuoviIscrittoView;

public class RimuoviIscrittoPresenter {
    private final I_RimuoviIscrittoView _view;
    private final GestoreIscritti _iscManager;
    private final LogsController _logsC;
    
    public RimuoviIscrittoPresenter(I_RimuoviIscrittoView view){
        this._view = view;
        this._iscManager = GestoreIscritti.getInstance();
        this._logsC = LogsController.getInstance();
    }
    
    public void rimuoviIscritto(String id){
        if(this._iscManager.rimuoviIscritto(id)){
            this._view.outputIscrittoEliminato();
            this._logsC.appendMessaggioLogs("Iscritto rimosso con successo\n" + 
                    "ID Iscritto: " + id);
        }
        else{
            this._view.outputIscrittoNonTrovato();
            this._logsC.appendMessaggioLogs("Impossibile eliminare Iscritto\n" +
                    "Motivo: Iscritto non trovato!");
        }
    }
}
