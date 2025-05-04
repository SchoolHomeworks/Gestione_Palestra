package Presenters;

import Models.AbbonamentoAnnuale;
import Models.AbbonamentoMensile;
import Models.GestoreIscritti;
import Models.Iscritto;
import Presenters.InterfaceViews.I_AggiungiAbbonamentoView;
import Controller.LogsController;

public class AggiungiAbbonamentoPresenter {
    private final GestoreIscritti _iscManager;
    private final I_AggiungiAbbonamentoView _view;
    private final LogsController _logsC;
    
    public AggiungiAbbonamentoPresenter(I_AggiungiAbbonamentoView view){
        this._view = view;
        this._iscManager = GestoreIscritti.getInstance();
        this._logsC = LogsController.getInstance();
    }
    
    public void aggiungiAbbonamento(String ID, String oggetto_abbonamento, String scadenza){
        Iscritto iscritto = this._iscManager.cercaIscritto(ID);
        if(iscritto != null){
            if(scadenza.equalsIgnoreCase("mensile")){
                AbbonamentoMensile abbonamento = new AbbonamentoMensile(oggetto_abbonamento);
                iscritto.aggiungiAbbonamento(abbonamento);
                this._view.outputAbbonamentoAggiuntoConSuccesso();
                
                this._logsC.appendMessaggioLogs("L' abbonamento: " + abbonamento.toString() +
                        "\nè stato aggiunto con successo " + 
                        "\nall' Iscritto: " + iscritto.toString()
                );
            }
            else if(scadenza.equalsIgnoreCase("annuale")){
                AbbonamentoAnnuale abbonamento = new AbbonamentoAnnuale(oggetto_abbonamento);
                iscritto.aggiungiAbbonamento(abbonamento);
                this._view.outputAbbonamentoAggiuntoConSuccesso();
                
                this._logsC.appendMessaggioLogs("L' abbonamento: " + abbonamento.toString() +
                        "\nè stato aggiunto con successo " + 
                        "\nall' Iscritto: " + iscritto.toString()
                );
            }
            //todo Semplificare questa parte
            else{
                this._view.outputAbbonamentoNonValido();
                this._logsC.appendMessaggioLogs("Impossibile aggiungere l' abbonamento: \n" + 
                        "Motivo: Abbonamento non valido!");
            }
        }
        else{
            this._view.outputIscrittoNonTrovato();
            this._logsC.appendMessaggioLogs("Impossibile aggiungere l' abbonamento:\n" +
                    "Motivo: Iscritto non trovato!");
        }
    }
}
