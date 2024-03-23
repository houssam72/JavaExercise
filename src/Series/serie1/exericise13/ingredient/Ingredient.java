package Series.serie1.exericise13.ingredient;

import Series.serie1.exericise13.Enum.Etat;
import Series.serie1.exericise13.Enum.Unite;

import java.util.HashSet;

public class Ingredient {
    String nom_aliment;
    HashSet<Etat> etat;
    int quantite;
    Unite unite;

  public  Ingredient(String n, Etat e, int q, Unite unite) {
        this.nom_aliment = n;

         this.etat=new HashSet<>();
         this.etat.add(e);

        this.quantite = q;
        this.unite = unite;
    }

   public Ingredient(String n, HashSet<Etat> e, int q, Unite unite) {
        this.nom_aliment = n;
        this.etat=e;
        this.quantite = q;
        this.unite = unite;
    }

     public boolean equals(Object O){
         return  O instanceof Ingredient && ((Ingredient) O).nom_aliment.equals(this.nom_aliment) && ((Ingredient) O).etat.equals(this.etat);
     }



}
