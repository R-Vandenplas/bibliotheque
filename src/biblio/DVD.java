package biblio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class DVD extends Ouvrage{
    private long code;
    private LocalTime dureeTotal;
    private byte nbreBonus;
    private List<String> autresLangues= new ArrayList<>();
    private List<String> sousTitres= new ArrayList<>();
    private Ouvrage ouvrage;

    public DVD(String titre, byte ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage, double prixLocation, String langue, String genre, long code, LocalTime dureeTotal, byte nbreBonus, List<String> autresLangues, List<String> sousTitres, Ouvrage ouvrage) {
        super(titre, ageMin, dateParution, typeOuvrage, prixLocation, langue, genre);
        this.code = code;
        this.dureeTotal = dureeTotal;
        this.nbreBonus = nbreBonus;
        this.autresLangues = autresLangues;
        this.sousTitres = sousTitres;
        this.ouvrage = ouvrage;
    }
}
