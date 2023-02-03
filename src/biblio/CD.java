package biblio;

import java.time.LocalDate;
import java.time.LocalTime;

public class CD extends Ouvrage {
    private long code;
    private byte nbrePlages;
    private LocalTime dureeTotale;
    private Ouvrage ouvrage;

    public CD(String titre, byte ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage, double prixLocation, String langue, String genre, long code, byte nbrePlages, LocalTime dureeTotale, Ouvrage ouvrage) {
        super(titre, ageMin, dateParution, typeOuvrage, prixLocation, langue, genre);
        this.code = code;
        this.nbrePlages = nbrePlages;
        this.dureeTotale = dureeTotale;
        this.ouvrage = ouvrage;
    }
}
