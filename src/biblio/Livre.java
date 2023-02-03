package biblio;

import java.time.LocalDate;

public class Livre extends Ouvrage {
    private String isbn;
    private int nombrePages;
    private TypeLivre typeLivre;
    private Ouvrage ouvrage;

    public Livre(String titre, byte ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage, double prixLocation, String langue, String genre, String isbn, int nombrePages, TypeLivre typeLivre, Ouvrage ouvrage) {
        super(titre, ageMin, dateParution, typeOuvrage, prixLocation, langue, genre);
        this.isbn = isbn;
        this.nombrePages = nombrePages;
        this.typeLivre = typeLivre;
        this.ouvrage = ouvrage;
    }
}
