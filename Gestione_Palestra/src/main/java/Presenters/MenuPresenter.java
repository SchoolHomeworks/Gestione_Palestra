package Presenters;

import Controller.Controller;
import Controller.LogsController;
import Models.GestoreIscritti;
import Presenters.InterfaceViews.I_MenuView;
import Utils.OpzioneMenu;

public class MenuPresenter {
    private final I_MenuView _view;
    private final Controller _controller;
    private final LogsController _logsC;
    private final GestoreIscritti _iscManager;
    
    public MenuPresenter(I_MenuView view){
        this._controller = Controller.getInstance();
        this._logsC = LogsController.getInstance();
        this._iscManager = GestoreIscritti.getInstance();
        this._view = view;
        this._iscManager.caricaDaCsv();
    }
    
    public void mostraOpzione(OpzioneMenu opzione){
        this._controller.mostraOpzione(opzione);
        this._logsC.appendMessaggioLogs("Opzione selezionata -> " + opzione.toString());
    }
    
    public void salvaModifiche(){
        this._iscManager.salvaSuCsv();
        this._view.outputModificheSalvate();
        this._logsC.appendMessaggioLogs("Modifiche salvate con successo su CSV");
    }
}
