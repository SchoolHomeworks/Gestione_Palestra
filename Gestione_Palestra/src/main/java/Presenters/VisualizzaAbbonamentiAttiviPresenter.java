package Presenters;

import Controller.LogsController;
import Models.Abbonamento;
import Models.GestoreIscritti;
import Models.Iscritto;
import Presenters.InterfaceViews.I_VisualizzaAbbonamentiAttiviView;

public class VisualizzaAbbonamentiAttiviPresenter {
    
    private final I_VisualizzaAbbonamentiAttiviView _view;
    private final GestoreIscritti _iscManager;
    private final LogsController _logsC;
    
    public VisualizzaAbbonamentiAttiviPresenter(I_VisualizzaAbbonamentiAttiviView view){
        this._view = view;
        this._iscManager = GestoreIscritti.getInstance();
        this._logsC = LogsController.getInstance();
    }
    
    public void visualizzaAbbonamentiAttivi(String id){
        Iscritto iscritto = this._iscManager.cercaIscritto(id);
        if(iscritto != null){
            for(Abbonamento abbonamento : iscritto.getAbbonamentiAttivi()){
                String[] info_abbonamento = new String[3];
                info_abbonamento[0] = abbonamento.getOggettoAbbonamento();
                info_abbonamento[1] = abbonamento.getDataInizio().toString();
                info_abbonamento[2] = abbonamento.getDataFine().toString();
                this._view.outputVisualizzaAbbonamento(info_abbonamento);
            }
            this._logsC.appendMessaggioLogs("Abbonamenti attivi visualizzati");
        }
        else{
            this._view.outputIscrittoNonTrovato();
            this._logsC.appendMessaggioLogs("Impossibile visualizzare gli Abbonamenti Attivi\n" +
                    "Motivo: Iscritto non trovato!");
        }
    }
}
