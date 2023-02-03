package biblio;

import java.time.LocalDate;

public abstract class Ouvrage {
 protected String titre;
 protected byte ageMin;
 protected LocalDate dateParution;
 protected TypeOuvrage typeOuvrage;
 protected double prixLocation;
 protected String langue;
 protected String genre;
}
