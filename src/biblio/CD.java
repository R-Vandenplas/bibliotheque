package biblio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class CD extends Ouvrage {
    private long code;
    private byte nbrePlages;
    private LocalTime dureeTotale;
    private Ouvrage ouvrage;

    //<-------------------Constructeur,getter,setter et equals-------------->
    public CD(String titre, byte ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage, double prixLocation, String langue, String genre, long code, byte nbrePlages, LocalTime dureeTotale, Ouvrage ouvrage) {
        super(titre, ageMin, dateParution, typeOuvrage, prixLocation, langue, genre);
        this.code = code;
        this.nbrePlages = nbrePlages;
        this.dureeTotale = dureeTotale;
        this.ouvrage = ouvrage;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public byte getNbrePlages() {
        return nbrePlages;
    }

    public void setNbrePlages(byte nbrePlages) {
        this.nbrePlages = nbrePlages;
    }

    public LocalTime getDureeTotale() {
        return dureeTotale;
    }

    public void setDureeTotale(LocalTime dureeTotale) {
        this.dureeTotale = dureeTotale;
    }

    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    public void setOuvrage(Ouvrage ouvrage) {
        this.ouvrage = ouvrage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CD cd = (CD) o;
        return code == cd.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
    //<-------------------- Methodes -------------------->
    public double amendeRetard(int njours){
        return 4;
    }
}
