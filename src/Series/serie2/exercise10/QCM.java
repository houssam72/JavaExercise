package Series.serie2.exercise10;

import java.util.ArrayList;
import java.util.List;

public class QCM extends Question{

    List<Reponse> reponseList;
    QCM(String enonce) {
        super(enonce);
        this.reponseList = new ArrayList<Reponse>();
    }

    public void addReponse(Reponse reponse){
        this.reponseList.add(reponse);
    }

    public List<Reponse> getReponseList() {
        return reponseList;
    }
}