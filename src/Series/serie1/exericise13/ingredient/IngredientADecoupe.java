package Series.serie1.exericise13.ingredient;

import Series.serie1.exericise13.Enum.Etat;
import Series.serie1.exericise13.Enum.Unite;

import java.util.HashSet;

public class IngredientADecoupe extends Ingredient{


    public IngredientADecoupe(String n,  int q, Unite unite ) {
        super(n, Etat.Decoupe, q, unite);
    }

    public void Decoupe(){

    }

}
