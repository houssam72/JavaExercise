package Series.serie1.exericise13.ingredient;

import Series.serie1.exericise13.Enum.Etat;
import Series.serie1.exericise13.Enum.Unite;

import java.util.HashSet;

public class IngredientACuire extends Ingredient{

    private int temperature;

    public IngredientACuire(String n, int q, Unite unite,int t) {
        super(n,Etat.Cuit , q, unite);
        this.temperature=t;
    }

    public void Cuire(){

    }

}
