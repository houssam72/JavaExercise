import Series.serie1.exericise11.PoupeeRusse;


public class Main {
    public static void main(String[] args) throws Exception {

        PoupeeRusse p1=new PoupeeRusse(10);
        PoupeeRusse p2=new PoupeeRusse(11);
        PoupeeRusse p3=new PoupeeRusse(12);
        PoupeeRusse p4=new PoupeeRusse(13);
        PoupeeRusse p5=new PoupeeRusse(14);

        p2.ouvrir();
        p1.placerDans(p2);

        p2.fermer();
        p3.ouvrir();
        p2.placerDans(p3);

        p3.fermer();
        p4.ouvrir();
        p3.placerDans(p4);

        p4.fermer();
        p5.ouvrir();
        p4.placerDans(p5);

        p4.sortieDe(p5);

        p4.ouvrir();
        p3.sortieDe(p4);

        p3.ouvrir();
        p2.sortieDe(p3);

        p2.ouvrir();
        p1.sortieDe(p2);





    }
}