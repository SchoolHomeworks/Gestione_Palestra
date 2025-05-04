package Models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CsvManager {
    
    private static CsvManager _instance;
    private static final String PATH_ISCRITTI = "iscritti.csv";
    private static final String PATH_ABBONAMENTI = "abbonamenti.csv";
    
    private CsvManager() {}

    public static CsvManager getInstance() {
        if (_instance == null) {
            _instance = new CsvManager();
        }
        return _instance;
    }
    
    protected ArrayList<Iscritto> caricaIscritti(){
        ArrayList<Iscritto> lista = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH_ISCRITTI))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] campi = line.split(",");
                if (campi.length >= 3) {
                    String nome = campi[0];
                    String cognome = campi[1];
                    String id = campi[2];
                    lista.add(new Iscritto(nome, cognome, id));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    protected void caricaAbbonamenti(){
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH_ABBONAMENTI))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] campi = line.split(",");
                if (campi.length >= 5) {
                    String id = campi[0];
                    String oggetto = campi[1];
                    String data_inizio = campi[2];
                    String data_fine = campi[3];
                    String scaduto = campi[4];
                    
                    this.aggiungiAbbonamento(id, oggetto, data_inizio, data_fine, scaduto);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private boolean aggiungiAbbonamento(String id_iscritto, String oggetto_abbonamento, String data_inizio, String data_fine, String scaduto){
        Iscritto iscritto = GestoreIscritti.getInstance().cercaIscritto(id_iscritto);
        if(iscritto != null){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate inizio = LocalDate.parse(data_inizio, formatter);
            LocalDate fine = LocalDate.parse(data_fine, formatter);
            
            Abbonamento abbonamento = new Abbonamento(oggetto_abbonamento, inizio, fine);
            iscritto.aggiungiAbbonamento(abbonamento);
            
            if(scaduto.equalsIgnoreCase("true")){
                iscritto.terminaAbbonamento(abbonamento.getOggettoAbbonamento());
            }
        }
        return false;
    }
    
    protected void salvaIscritti(){
        try (PrintWriter writer = new PrintWriter(new FileWriter(PATH_ISCRITTI))) {
            for (Iscritto i : GestoreIscritti.getInstance()) {
                writer.println(i.getNome() + "," + i.getCognome() + "," + i.getID());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    protected void salvaAbbonamenti(){
        try (PrintWriter writer = new PrintWriter(new FileWriter(PATH_ABBONAMENTI))) {
            for(Iscritto i : GestoreIscritti.getInstance()){
                for(Abbonamento a : i.getAbbonamentiAttivi()){
                    writer.println(i.getID() + "," + a.getOggettoAbbonamento() + "," + a.getDataInizio().toString() + "," + a.getDataFine().toString() + "," + a.getScaduto());
                }
                for(Abbonamento a : i.getAbbonamentiScaduti()){
                    writer.println(i.getID() + "," + a.getOggettoAbbonamento() + "," + a.getDataInizio().toString() + "," + a.getDataFine().toString() + "," + a.getScaduto());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}