package biblio;

import java.time.LocalTime;

public class CD {
    private long code;
    private byte nbrePlages;
    private LocalTime dureeTotale;
    private Ouvrage ouvrage;

    public CD(long code, byte nbrePlages, LocalTime dureeTotale, Ouvrage ouvrage) {
        this.code = code;
        this.nbrePlages = nbrePlages;
        this.dureeTotale = dureeTotale;
        this.ouvrage = ouvrage;
    }
}
