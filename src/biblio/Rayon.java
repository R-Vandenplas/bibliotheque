package biblio;

import java.util.ArrayList;
import java.util.List;

public class Rayon {
    private String codeRayon;
    private String genre;
    private List<Exemplaire> exemplaires = new ArrayList<>();

    //<-------------------Constructeur,getter,setter et equals-------------->
    public Rayon(String codeRayon, String genre) {
        this.codeRayon = codeRayon;
        this.genre = genre;
    }
    public String getCodeRayon() {
        return codeRayon;
    }

    public void setCodeRayon(String codeRayon) {
        this.codeRayon = codeRayon;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Exemplaire> getExemplaires() {
        return exemplaires;
    }

    public void setExemplaires(List<Exemplaire> exemplaires) {
        this.exemplaires = exemplaires;
    }

    //<-------------------- Methodes -------------------->
    public void listerExemplaires(){

    }
}
