package biblio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Exemplaire extends Ouvrage{

    private long matricule;
    private String descriptionEtat;
    private Rayon rayon;
    private List<Location> locations = new ArrayList<>();
    private Ouvrage ouvrage;

    public Exemplaire(String titre, byte ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage, double prixLocation, String langue, String genre, long matricule, String descriptionEtat, Rayon rayon, Ouvrage ouvrage) {
        super(titre, ageMin, dateParution, typeOuvrage, prixLocation, langue, genre);
        this.matricule = matricule;
        this.descriptionEtat = descriptionEtat;
        this.rayon = rayon;
        this.ouvrage = ouvrage;
    }
}
