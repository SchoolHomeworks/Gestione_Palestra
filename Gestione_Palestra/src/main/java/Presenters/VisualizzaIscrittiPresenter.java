package Presenters;

import Controller.LogsController;
import Models.GestoreIscritti;
import Models.Iscritto;
import Presenters.InterfaceViews.I_VisualizzaIscrittiView;

public class VisualizzaIscrittiPresenter {
    private final I_VisualizzaIscrittiView _view;
    private final GestoreIscritti _iscManager;
    private final LogsController _logsC;
    
    public VisualizzaIscrittiPresenter(I_VisualizzaIscrittiView view){
        this._view = view;
        this._iscManager = GestoreIscritti.getInstance();
        this._logsC = LogsController.getInstance();
    }
    
    public void visualizzaIscritti(){
        for(Iscritto iscritto : this._iscManager){
            String[] info = new String[5];
            info[0] = iscritto.getID();
            info[1] = iscritto.getNome();
            info[2] = iscritto.getCognome();
            info[3] = String.valueOf(iscritto.getAbbonamentiAttivi().size());
            info[4] = String.valueOf(iscritto.getAbbonamentiScaduti().size());
            this._view.outputVisualizzaIscritto(info);
        }
        this._logsC.appendMessaggioLogs("Iscritti visualizzati");
    }
}
