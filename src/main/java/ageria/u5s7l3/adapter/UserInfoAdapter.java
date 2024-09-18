package ageria.u5s7l3.adapter;

import ageria.u5s7l3.DataSource;
import ageria.u5s7l3.Info;

import java.time.LocalDate;
import java.time.ZoneId;

public class UserInfoAdapter implements DataSource {
    private Info info;


    public UserInfoAdapter(Info info) {
        this.info = info;
    }


    @Override
    public String getNomeCompleto() {
        return this.info.getNome() + this.info.getCognome();
    }

    @Override
    public int getEta() {
        LocalDate birthDate = this.info.getDataDiNascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return LocalDate.now().getYear() - birthDate.getYear();
    }


    @Override
    public String toString() {
        return "UserInfoAdapter{" +
                "info=" + info +
                '}';
    }
}
