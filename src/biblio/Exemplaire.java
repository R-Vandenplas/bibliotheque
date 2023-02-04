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

    //<-------------------Constructeur,getter,setter et equals-------------->


    public Exemplaire(long matricule, String descriptionEtat, Ouvrage ouvrage) {
        this.matricule = matricule;
        this.descriptionEtat = descriptionEtat;
        this.ouvrage = ouvrage;
    }

    public long getMatricule() {
        return matricule;
    }

    public void setMatricule(long matricule) {
        this.matricule = matricule;
    }

    public String getDescriptionEtat() {
        return descriptionEtat;
    }

    public void setDescriptionEtat(String descriptionEtat) {
        this.descriptionEtat = descriptionEtat;
    }

    public Rayon getRayon() {
        return rayon;
    }

    public void setRayon(Rayon rayon) {
        this.rayon = rayon;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    public void setOuvrage(Ouvrage ouvrage) {
        this.ouvrage = ouvrage;
    }

    //<-------------------- Methodes -------------------->
    public void modifierEtat(){

    }
    public void lecteurActuel(){

    }
    public void lecteurs(){

    }
    public void envoiMailLecteurActuel(Mail mail){

    }
    public void envoiMailLecteur(Mail mail){

    }
    public boolean enRetard(){
        return false;
    }
    public int joursRetard(){
        return 4;
    }
    public boolean enLocation(){
        return false;
    }
    public void rendre(){

    }
}
