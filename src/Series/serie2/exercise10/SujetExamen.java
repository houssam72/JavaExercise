package Series.serie2.exercise10;

import java.util.ArrayList;
import java.util.List;

public class SujetExamen {

    List<Question> ListOfQuestions;

    SujetExamen(){
        ListOfQuestions =new ArrayList<Question>();
    }

    public List<Question> getListOfQuestions() {
        return ListOfQuestions;
    }

    public void addQuestion(Question Question) {
        ListOfQuestions.add(Question);
    }

    public int DifficulteMoyen(){

        int Somme=0;

        for (Question question : this.ListOfQuestions)
        {
            Somme+=question.getDifficulte();
        }

        return Somme/ListOfQuestions.size();
    }
}
