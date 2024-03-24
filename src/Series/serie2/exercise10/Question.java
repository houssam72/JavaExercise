package Series.serie2.exercise10;

class Question{
    private  String enonce;
    private  int difficulte=50; // la difficulte varie de 0 à 100
    Question(String e){
        this.enonce = e;
    }
    void setDifficulte(int d){
        this.difficulte = d;
    }
    int getDifficulte(){
        return this.difficulte;
    }
    String getEnonce(){
        return this.enonce;
    }
}

