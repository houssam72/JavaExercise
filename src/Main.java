import Series.serie1.exericise11.PoupeeRusse;
import Series.serie1.exericise13.Enum.Etat;
import Series.serie1.exericise13.Enum.Unite;
import Series.serie1.exericise13.ingredient.Ingredient;

import java.util.Arrays;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) throws Exception {

        Ingredient I1 = new Ingredient("choucroute", Etat.Cuit,500, Unite.GRAMME);
        Ingredient I2= new Ingredient("lard",new HashSet<Etat>(Arrays.asList(Etat.Cuit,Etat.Entier)),150,Unite.GRAMME);
        Ingredient I3= new Ingredient("saucisse",new HashSet<Etat>(Arrays.asList(Etat.Cuit,Etat.Entier)),2,Unite.UNITE);

    }
}