package biblio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Exemplaire{

    private long matricule;
    private String descriptionEtat;
    private Rayon rayon;
    private List<Location> locations = new ArrayList<>();
    private Ouvrage ouvrage;

    public Exemplaire(long matricule, String descriptionEtat, Rayon rayon, List<Location> locations, Ouvrage ouvrage) {
        this.matricule = matricule;
        this.descriptionEtat = descriptionEtat;
        this.rayon = rayon;
        this.locations = locations;
        this.ouvrage = ouvrage;
    }
}
