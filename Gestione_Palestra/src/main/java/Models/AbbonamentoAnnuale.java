package Models;

import java.time.LocalDate;

public class AbbonamentoAnnuale extends Abbonamento{
    public AbbonamentoAnnuale(String oggetto_abbonamento){
        super(oggetto_abbonamento, LocalDate.now(), LocalDate.now().plusYears(1));
    }
}
