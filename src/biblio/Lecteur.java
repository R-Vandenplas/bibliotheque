package biblio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lecteur {
    private long numLecteur;
    private String nom;
    private String prenom;
    private LocalDate dateNaiss;
    private String mail;
    private String adresse;
    private String tel;
    private List<Location>locations=new ArrayList<>();
}
