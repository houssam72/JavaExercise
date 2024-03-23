package Series.serie1.exericise13.plat;

import Series.serie1.exericise13.ingredient.Ingredient;

import java.util.ArrayList;

public class Plat {
    String nom;
    ArrayList<Ingredient> ingredients;

    Plat(String nom) {
        this.nom = nom;
    }

    Plat(String nom, Ingredient ingredient) {
        this.nom = nom;

        this.ingredients=new ArrayList<>();
        this.ingredients.add(ingredient);
    }

    Plat(String nom, ArrayList<Ingredient> ingredients) {
        this.nom = nom;
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        this.nom = nom;
        this.ingredients.add(ingredient);
    }

    public boolean equals(Object O) {

        if (O instanceof Plat &&this.ingredients.size() == ((Plat) O).ingredients.size()) {

            for(Ingredient I1 : this.ingredients){
              if(!((Plat) O).ingredients.contains(I1)) return false;
            }
            return true;
        }
      return false;
    }
}
