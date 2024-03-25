package Series.serie2.exercise11;

import java.util.Objects;

public class EluMafieux extends Elu{
    EluMafieux(String nom, String prenom) {
        super(nom, prenom);
    }

    public void addAssisstant(Object personne) throws Exception {
        if(personne instanceof Personne) {
            if(Objects.equals(this.getNom(), ((Personne) personne).getNom())) {
                assistantsList.add((Personne) personne);
            }else {
                throw new Exception("on peut pas ajouter cette persoone car il est pas de la meme famille");
            }
        }else {
            throw new Exception("Please use a Personne");
        }
    }



}
