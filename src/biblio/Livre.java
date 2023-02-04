package biblio;

import java.time.LocalDate;
import java.util.Objects;

public class Livre extends Ouvrage {
    private String isbn;
    private int nombrePages;
    private TypeLivre typeLivre;
    private Ouvrage ouvrage;

    //<-------------------Constructeur,getter,setter et equals-------------->
    public Livre(String titre, byte ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage, double prixLocation, String langue, String genre, String isbn, int nombrePages, TypeLivre typeLivre, Ouvrage ouvrage) {
        super(titre, ageMin, dateParution, typeOuvrage, prixLocation, langue, genre);
        this.isbn = isbn;
        this.nombrePages = nombrePages;
        this.typeLivre = typeLivre;
        this.ouvrage = ouvrage;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }

    public TypeLivre getTypeLivre() {
        return typeLivre;
    }

    public void setTypeLivre(TypeLivre typeLivre) {
        this.typeLivre = typeLivre;
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
        Livre livre = (Livre) o;
        return Objects.equals(isbn, livre.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    //<-------------------- Methodes -------------------->
    public double amendeRetard(int njours){
        return 4;
    }
}
