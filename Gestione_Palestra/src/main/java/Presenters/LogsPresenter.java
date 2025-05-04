package Presenters;

import Controller.LogsController;
import Presenters.InterfaceViews.I_LogsView;

public class LogsPresenter {
    private final I_LogsView _view;
    private final LogsController _logs;
    
    public LogsPresenter(I_LogsView view){
        this._view = view;
        this._logs = LogsController.getInstance();
        this._logs.setLogsPresenter(this);
    }
    
    public void appendMessaggio(String text){
        String separatore = "\n------------------------------------------------------------------------\n";
        String new_text = separatore + text + separatore;
        this._view.appendMessaggio(new_text);
    }
    
    public void pulisci(){
        this._view.pulisci();
    }
}
