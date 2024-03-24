package Series.serie2.exercise10;

public class QuestionNote {
    Question q;
    private int bareme;
    QuestionNote(Question q,int bareme) {
        this.q=q;
        this.bareme=bareme;
    }

    public void setBareme(int bareme) {
        this.bareme = bareme;
    }

    public int getBareme() {
        return bareme;
    }
}
