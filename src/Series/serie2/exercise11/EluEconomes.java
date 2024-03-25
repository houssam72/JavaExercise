package Series.serie2.exercise11;

public class EluEconomes extends Elu {

    EluEconomes(String nom, String prenom) {
        super(nom, prenom);
    }

    public void distrubutiondotation(int dotation){

        for(Personne assisstant : assistantsList) {
            if (dotation >=1480) {
                assisstant.addSous(dotation);
                dotation-=1480;
            }
            else {
                break;
            }
        }

    }
}
