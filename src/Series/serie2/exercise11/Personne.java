package Series.serie2.exercise11;

class Personne {
    private String nom, prenom;
    private int compteBancaire; // montant de son compte en euros

    Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.compteBancaire = 0;
    }

    void addSous(int montant) {
        this.compteBancaire = this.compteBancaire + montant;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getCompteBancaire() {
        return compteBancaire;
    }
}
