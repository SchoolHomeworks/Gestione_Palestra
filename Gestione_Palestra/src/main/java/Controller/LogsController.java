package Controller;

import Presenters.LogsPresenter;

public class LogsController {
    private static LogsController _instance;
    
    private LogsPresenter _logsPresenter;
    
    public static LogsController getInstance(){
        if(_instance == null){
            _instance = new LogsController();
        }
        return _instance;
    }
    
    public void setLogsPresenter(LogsPresenter logs){
        this._logsPresenter = logs;
    }
    
    public void appendMessaggioLogs(String text){
        this._logsPresenter.appendMessaggio(text);
    }
    
    public void pulisciLogs(){
        this._logsPresenter.pulisci();
    }
}
