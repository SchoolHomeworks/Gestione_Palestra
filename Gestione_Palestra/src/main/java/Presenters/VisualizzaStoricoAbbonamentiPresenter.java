package Presenters;

import Controller.LogsController;
import Models.Abbonamento;
import Models.GestoreIscritti;
import Models.Iscritto;
import Presenters.InterfaceViews.I_VisualizzaStoricoAbbonamentiView;

public class VisualizzaStoricoAbbonamentiPresenter {
    private final I_VisualizzaStoricoAbbonamentiView _view;
    private final GestoreIscritti _iscManager;
    private final LogsController _logsC;
    
    public VisualizzaStoricoAbbonamentiPresenter(I_VisualizzaStoricoAbbonamentiView view){
        this._view = view;
        this._iscManager = GestoreIscritti.getInstance();
        this._logsC = LogsController.getInstance();
    }
    
    public void visualizzaStoricoAbbonamenti(String id){
        Iscritto iscritto = this._iscManager.cercaIscritto(id);
        if(iscritto != null){
            for(Abbonamento abbonamento : iscritto.getAbbonamentiScaduti()){
                String[] info_abbonamento = new String[3];
                info_abbonamento[0] = abbonamento.getOggettoAbbonamento();
                info_abbonamento[1] = abbonamento.getDataInizio().toString();
                info_abbonamento[2] = abbonamento.getDataFine().toString();
                this._view.outputVisualizzaAbbonamento(info_abbonamento);
            }
            this._logsC.appendMessaggioLogs("Storico abbonamenti visualizzato");
        }
        else{
            this._view.outputIscrittoNonTrovato();
            this._logsC.appendMessaggioLogs("Impossibile visualizzare storico abbonamenti\n" + 
                    "Motivo: Iscritto non trovato!");
        }
    }
}
