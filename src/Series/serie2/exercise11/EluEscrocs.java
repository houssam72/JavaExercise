package Series.serie2.exercise11;

public class EluEscrocs extends Elu{

    private int compteSuisse;

    EluEscrocs(String nom, String prenom) {
        super(nom, prenom);
        this.compteSuisse=0;
    }

    public void distrubutiondotation(int dotation){

        for(Personne assisstant : assistantsList) {
            if (dotation >=1480) {
                assisstant.addSous(dotation);
                dotation-=1480;
            }
            else {
                this.compteSuisse+=dotation;
                break;
            }
        }

    }

}
