package biblio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Ouvrage {
 protected String titre;
 protected byte ageMin;
 protected LocalDate dateParution;
 protected TypeOuvrage typeOuvrage;
 protected double prixLocation;
 protected String langue;
 protected String genre;
 protected List<Auteur>auteurs=new ArrayList<>();
 protected List<Exemplaire>exemplaires=new ArrayList<>();

 public Ouvrage(String titre, byte ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage, double prixLocation, String langue, String genre) {
  this.titre = titre;
  this.ageMin = ageMin;
  this.dateParution = dateParution;
  this.typeOuvrage = typeOuvrage;
  this.prixLocation = prixLocation;
  this.langue = langue;
  this.genre = genre;
 }
}
