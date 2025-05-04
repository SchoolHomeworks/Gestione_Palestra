package Presenters;

import Controller.Controller;
import Presenters.InterfaceViews.I_MainView;
import Utils.OpzioneMenu;

public class MainPresenter {
    private final I_MainView _view;
    private final Controller _controller;
    
    public MainPresenter(I_MainView view){
        this._view = view;
        this._controller = Controller.getInstance();
        this._controller.setMainPresenter(this);
    }
    
    public void mostraOpzione(OpzioneMenu opzione){
        this._view.mostraOpzione(opzione);
    }
}
