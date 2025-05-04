package Models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Iscritto {
    private final String _nome;
    private final String _cognome;
    private final String _ID;

    private final ArrayList<Abbonamento> _abbonamenti_attivi;
    private final ArrayList<Abbonamento> _abbonamenti_scaduti;

    public Iscritto(String nome, String cognome){
        this._nome = nome;
        this._cognome = cognome;

        this._abbonamenti_attivi = new ArrayList<>();
        this._abbonamenti_scaduti = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyHHmm");
        String dataOra = LocalDateTime.now().format(formatter);

        this._ID = "" + nome.charAt(0) + cognome.charAt(0) + dataOra;
    }
    
    protected Iscritto(String nome, String cognome, String id){
        this._nome = nome;
        this._cognome = cognome;
        this._ID = id;
        
        this._abbonamenti_attivi = new ArrayList<>();
        this._abbonamenti_scaduti = new ArrayList<>();
    }

    public void aggiungiAbbonamento(Abbonamento abbonamento){
        this._abbonamenti_attivi.add(abbonamento);
    }

    public boolean terminaAbbonamento(String oggetto_abbonamento){
        for(Abbonamento abbonamento : this._abbonamenti_attivi){
            if(abbonamento.getOggettoAbbonamento().equals(oggetto_abbonamento)){
                abbonamento.setScaduto();
                this._abbonamenti_attivi.remove(abbonamento);
                this._abbonamenti_scaduti.add(abbonamento);
                return true;
            }
        }
        
        return false;
    }

    public String getNome(){
        return this._nome;
    }

    public String getCognome(){
        return this._cognome;
    }

    public String getID(){
        return this._ID;
    }

    public ArrayList<Abbonamento> getAbbonamentiAttivi() {
        return new ArrayList<>(this._abbonamenti_attivi);
    }

    public ArrayList<Abbonamento> getAbbonamentiScaduti(){
        return new ArrayList<>(this._abbonamenti_scaduti);
    }

    @Override
    public boolean equals(Object obj){
        return this.toString().equals(obj.toString());
    }

    @Override
    public String toString(){
        return this.getNome() + " " + this.getCognome() + " " + this.getID();
    }
}
