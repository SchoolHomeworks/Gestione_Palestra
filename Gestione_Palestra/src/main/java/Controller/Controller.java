package Controller;

import Presenters.MainPresenter;
import Utils.OpzioneMenu;

public class Controller {
    private static Controller _instance;
    
    private MainPresenter _mainP;
    
    public static Controller getInstance(){
        if(_instance == null){
            _instance = new Controller();
        }
        return _instance;
    }
    
    public void setMainPresenter(MainPresenter mainP){
        this._mainP = mainP;
    }
    
    public void mostraOpzione(OpzioneMenu opzione){
        this._mainP.mostraOpzione(opzione);
    }
}
