package biblio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionBiblio {
    private static List<Auteur> laut = new ArrayList<>();
    private static List<Lecteur> llect = new ArrayList<>();
    private static List<Ouvrage> louv= new ArrayList<>();
    private static List<Rayon> lrayon= new ArrayList<>();
    private static List<Location> lloc = new ArrayList<>();
    private Scanner sc =new Scanner(System.in);

    public GestionBiblio() {
        menu();
    }

    public void menu() {
        String liste = "\t1.Ajout Auteur\n\t2.Ajout Ouvrage\n\t3.Ajout Lecteur\n\t4.Ajout Rayon\n\t5.Ajout Exemplaire\n\t6.Louer\n\t7.Rendre\n\t8.fin ";
        int choix;
        do {
            System.out.println("" + liste);
            choix=entree_num(1,8);
            switch (choix) {
                case 1 -> System.out.println(1);
                case 2 -> System.out.println(2);
                case 3 -> System.out.println(3);
                case 4 -> System.out.println(4);
                case 5 -> System.out.println(5);
                case 6 -> System.out.println(6);
                case 7 -> System.out.println(7);
                case 8 -> System.out.println("fin");
            }
        } while (choix !=8);

    }
    int entree_num(int min,int max){
        String option;
        int rep;
        do {
            do {
                option = sc.nextLine();
                if(!option.matches("[0-9]*")){
                    System.out.println("Erreur entrez uniquement un nombre");
                }
            } while (!option.matches("[0-9]*"));
            rep= Integer.parseInt(option);
            if(rep<min || rep >max){
                System.out.println("Nombre en dehors de l'intervalle");
            }
        }while (rep<min || rep >max);
        return rep;
    }
}
