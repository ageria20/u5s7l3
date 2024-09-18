package ageria.u5s7l3.adapter;

import ageria.u5s7l3.Info;
import ageria.u5s7l3.UserData;

import java.util.Date;

public class UserInfoAdapter extends Info {
    private UserData userData;


    public UserInfoAdapter(String nome, String cognome, Date dataDiNascita) {
        super(nome, cognome, dataDiNascita);
    }
}
