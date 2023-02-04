package biblio;

import java.time.LocalDate;
import java.util.Objects;

public class Location {
    private LocalDate dateLoc;
    private LocalDate dateRestitution;
    private double amende;
    private Exemplaire exemplaire;
    private Lecteur lecteur;

    //<-------------------Constructeur,getter,setter et equals-------------->


    public Location(LocalDate dateLoc, Exemplaire exemplaire, Lecteur lecteur) {
        this.dateLoc = dateLoc;
        this.exemplaire = exemplaire;
        this.lecteur = lecteur;
    }

    public LocalDate getDateLoc() {
        return dateLoc;
    }

    public void setDateLoc(LocalDate dateLoc) {
        this.dateLoc = dateLoc;
    }

    public LocalDate getDateRestitution() {
        return dateRestitution;
    }

    public void setDateRestitution(LocalDate dateRestitution) {
        this.dateRestitution = dateRestitution;
    }

    public double getAmende() {
        return amende;
    }

    public void setAmende(double amende) {
        this.amende = amende;
    }

    public Exemplaire getExemplaire() {
        return exemplaire;
    }

    public void setExemplaire(Exemplaire exemplaire) {
        this.exemplaire = exemplaire;
    }

    public Lecteur getLecteur() {
        return lecteur;
    }

    public void setLecteur(Lecteur lecteur) {
        this.lecteur = lecteur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(dateLoc, location.dateLoc) && Objects.equals(exemplaire, location.exemplaire) && Objects.equals(lecteur, location.lecteur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateLoc, exemplaire, lecteur);
    }
    //<-------------------- Methodes -------------------->
    public void calculerAmende(){

    }
    public void enregisterRetour(){

    }
}
