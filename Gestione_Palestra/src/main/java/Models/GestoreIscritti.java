package Models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class GestoreIscritti implements Iterable<Iscritto>{
    private static GestoreIscritti _instance;

    private ArrayList<Iscritto> _lista_iscritti;

    private GestoreIscritti(){
        this._lista_iscritti = new ArrayList<>();
    }
    
    public static GestoreIscritti getInstance(){
        if(_instance == null){
            _instance = new GestoreIscritti();
        }
        return _instance;
    }

    public void aggiungiIscritto(Iscritto iscritto){
        this._lista_iscritti.add(iscritto);
    }

    public Iscritto cercaIscritto(String ID){
        for(Iscritto isc : this._lista_iscritti){
            if(isc.getID().equals(ID)){
                return isc;
            }
        }
        return null;
    }

    public boolean rimuoviIscritto(String ID){
        Iscritto iscritto = this.cercaIscritto(ID);
        if(iscritto!=null){
            return this._lista_iscritti.remove(iscritto);
        }
        return false;
    }
    
    /*public void aggiornaScadenzaAbbonamenti(){
        LocalDate data_attuale = LocalDate.now();
        for(Iscritto iscritto : this._lista_iscritti){
            for(Abbonamento abbonamento : iscritto.getAbbonamentiAttivi()){
                if(data_attuale.isAfter(abbonamento.getDataFine())){
                    iscritto.terminaAbbonamento(abbonamento);
                }
            }
        }
    }*/
    
    public void caricaDaCsv(){
        CsvManager csvManager = CsvManager.getInstance();
        this._lista_iscritti = csvManager.caricaIscritti();
        csvManager.caricaAbbonamenti();
    }
    
    public void salvaSuCsv(){
        CsvManager csvManager = CsvManager.getInstance();
        csvManager.salvaIscritti();
        csvManager.salvaAbbonamenti();
    }
    
    @Override
    public Iterator<Iscritto> iterator()
    {
        return this._lista_iscritti.iterator();
    }
}
