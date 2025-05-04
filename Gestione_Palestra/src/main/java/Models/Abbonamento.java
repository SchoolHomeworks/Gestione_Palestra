package Models;

import java.time.LocalDate;

public class Abbonamento {
    private final String _oggetto_abbonamento;
    private final LocalDate _data_inizio;
    private final LocalDate _data_fine;
    private boolean _scaduto;

    public Abbonamento(String oggetto_abbonamento, LocalDate data_inizio, LocalDate data_fine){
        this._oggetto_abbonamento = oggetto_abbonamento;
        this._data_inizio = data_inizio;
        this._data_fine = data_fine;
        this._scaduto = false;
    }

    public String getOggettoAbbonamento(){
        return this._oggetto_abbonamento;
    }

    public LocalDate getDataInizio(){
        return this._data_inizio;
    }

    public LocalDate getDataFine(){
        return this._data_fine;
    }

    public void setScaduto(){
        this._scaduto = true;
    }

    public boolean getScaduto(){
        return this._scaduto;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null && obj instanceof Abbonamento){
            return this.getOggettoAbbonamento().equals(((Abbonamento)obj).getOggettoAbbonamento());
        }
        return true;
    }

    @Override
    public String toString(){
        return this._oggetto_abbonamento + " " + this._data_inizio.toString() + " " + this._data_fine.toString() + " " + this._scaduto;
    }
}
