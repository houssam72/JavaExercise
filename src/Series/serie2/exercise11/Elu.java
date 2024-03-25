package Series.serie2.exercise11;

import java.util.ArrayList;
import java.util.List;

public class Elu extends Personne{


    List<Personne>  assistantsList;
    Elu(String nom, String prenom) {
        super(nom, prenom);
        assistantsList=new ArrayList<Personne>();
    }

    public void addAssisstant(Object personne) throws Exception {
         if(personne instanceof Personne) {
             assistantsList.add((Personne) personne);
         }else {
             throw new Exception("Please use a Personne");
         }
    }

    public void removeAssisstant(Object personne) throws Exception {
        if(personne instanceof Personne) {
            if (assistantsList.contains(personne)) {
                assistantsList.remove(personne);
            } else {
                throw new Exception("Personne NotFound");
            }
        }else {
            throw new Exception("Please use a Personne");
        }
    }

    public void distrubutiondotation(int dotation){
        final int dotationPerPersonne=dotation/assistantsList.size();
        assistantsList.forEach(assisstant->{
            assisstant.addSous(dotationPerPersonne);
        });

    }
}
