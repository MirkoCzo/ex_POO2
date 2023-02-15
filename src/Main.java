package bibliotheque;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //a.getOuvrage(l)
        Auteur a = new Auteur("Poriaux","Michel","Belge");
        Livre l = new Livre("Java pour les nuls",17,"01/09/2023",25,"Français","Informatiques","01",360,TypeLivre.DOCUMENTAIRE,"Apprentisage du java");
        a.getLouvrage().add(l);
        l.getLauteurs().add(a);
        Exemplaire e1 = new Exemplaire("001","Bon état",l);
        Rayon r = new Rayon("ABC","Informatiques");
        r.getLex().add(e1);
        Lecteur lecteur = new Lecteur(1,"Dupont","Jean", LocalDate.now(),"Champ de mars","Jean.Dupont@hotmail.com","0472543345");
        Location loc = new Location(LocalDate.of(2023,9,01),LocalDate.of(2023,9,30),lecteur,e1);
        lecteur.getLloc().add(loc);
        System.out.println(a);
        System.out.println(l);
        System.out.println(e1);
        System.out.println(r);
        System.out.println(lecteur);



    }
}