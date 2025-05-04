package Presenters;

import Controller.LogsController;
import Models.GestoreIscritti;
import Models.Iscritto;
import Presenters.InterfaceViews.I_TerminaAbbonamentoView;

public class TerminaAbbonamentoPresenter {
    private final I_TerminaAbbonamentoView _view;
    private final GestoreIscritti _iscManager;
    private final LogsController _logsC;
    
    public TerminaAbbonamentoPresenter(I_TerminaAbbonamentoView view){
        this._view = view;
        this._iscManager = GestoreIscritti.getInstance();
        this._logsC = LogsController.getInstance();
    }
    
    public void terminaAbbonamento(String id_iscritto, String oggetto_abbonamento){
        Iscritto iscritto = this._iscManager.cercaIscritto(id_iscritto);
        if(iscritto != null){
            if(iscritto.terminaAbbonamento(oggetto_abbonamento)){
                this._view.outputAbbonamentoTerminato();
                this._logsC.appendMessaggioLogs("L' Abbonamento: " + oggetto_abbonamento +
                        "\ndell' Iscritto: " + iscritto.toString() +
                        "\nè stato terminato con successo!");
            }
            else{
                this._view.outputAbbonamentoNonTrovato();
                this._logsC.appendMessaggioLogs("Impossibile terminare l' Abbonamenton\n" + 
                        "Motivo: Abbonamento non trovato!");
            }
        }
        else{
            this._view.outputUtenteNonTrovato();
            this._logsC.appendMessaggioLogs("Impossibile terminare l' Abbonamento\n" + 
                    "Motivo: Iscritto non trovato!");
        }
    }
}
