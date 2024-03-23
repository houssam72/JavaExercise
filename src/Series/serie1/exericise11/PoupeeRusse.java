package Series.serie1.exericise11;

public class PoupeeRusse {
    private int taille;
    private boolean ouvert;
    private PoupeeRusse PoupeMere , PoupeEnfant;

    public PoupeeRusse(int taille){
        this.taille=taille;
        this.ouvert=false;
    }


    public void ouvrir() throws Exception {
        if(!this.ouvert && this.PoupeMere==null)
            this.ouvert=true;
        else if(this.ouvert)
        throw new Exception("Poupe deja ouverte");
        else
            throw new Exception("Impossible de l'ouvrir , cette Poupe est dans une autre Poupe");
    }

    public void fermer()  throws Exception{
        if(this.ouvert && this.PoupeMere==null)
            this.ouvert=false;
        else if(!this.ouvert)
            throw new Exception("Poupe deja fermer");
        else
            throw new Exception("Impossible de le fermer , cette Poupe est dans une autre Poupe");
    }

    public void placerDans(PoupeeRusse p) throws Exception{
        if(!this.ouvert && this.PoupeMere==null && p.ouvert && p.PoupeEnfant==null && p.taille>this.taille){
            this.PoupeMere=p;
            p.PoupeEnfant=this;
        }
        else if (this.ouvert)
            throw new Exception("Faut fermer la poupe courante");
        else if (this.PoupeMere!=null)
            throw new Exception("La poupe courante est a l'interieur d'une autre poupe");
        else if (!p.ouvert)
            throw new Exception("La Poupet P est ouverte");
        else if (p.PoupeEnfant!=null)
            throw new Exception("La Poupet P a deja une poupe a l'interieur");
        else if ( p.taille<this.taille)
            throw new Exception("La poupe courante est plus grande que la poupe P");


    }

    public void sortieDe(PoupeeRusse p) throws Exception{
        if(this.PoupeMere==p && p.PoupeEnfant==this && p.ouvert){
            this.PoupeMere=null;
            p.PoupeEnfant=null;
        }
        else if (this.PoupeMere!=p)
            throw new Exception("La poupe courante n'existe pas dand la poupe P");
        else if (p.PoupeEnfant!=this)
            throw new Exception("La poupe P n'as pas une poupe a son interieur");
        else if (!p.ouvert)
            throw new Exception("La Poupet P est ferme il faut l'ouvrir");


    }



}
