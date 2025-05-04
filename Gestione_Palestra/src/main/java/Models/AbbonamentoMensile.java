package Models;

import java.time.LocalDate;

public class AbbonamentoMensile extends Abbonamento{

    public AbbonamentoMensile(String oggetto_abbonamento){
        super(oggetto_abbonamento, LocalDate.now(), LocalDate.now().plusMonths(1));
    }
}
