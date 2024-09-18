package ageria.u5s7l3;

import ageria.u5s7l3.adapter.UserInfoAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class U5s7l3Application {

    public static void main(String[] args) {
        SpringApplication.run(U5s7l3Application.class, args);

        System.out.println("-------------------------------- ES1 --------------------------------");
        Calendar cal = Calendar.getInstance();
        cal.set(1995, Calendar.APRIL, 30);
        Date birthDate = cal.getTime();
        Info infoUser = new Info("Andrea", "Geria", birthDate);
        UserData us = new UserData(infoUser.getNome() + infoUser.getCognome(), 29);

        UserInfoAdapter userInfoAdapter = new UserInfoAdapter(us.getNomeCompleto(), us.getEta(), infoUser);

        if (userInfoAdapter.getNomeCompleto().startsWith(infoUser.getNome())) {
            System.out.println("The nams starts with same letter");
        } else System.out.println("name not same");
        if (userInfoAdapter.getEta() == us.getEta()) {
            System.out.println("l'eta combacia");
        } else System.out.println("age does not equals");

        System.out.println(userInfoAdapter);
        System.out.printf(String.valueOf(infoUser.getDataDiNascita().getTime()));

        System.out.println("-------------------------------- ES2 --------------------------------");
        Pagina pagina = new Pagina("CIACIAOCIAICIACIACIACIACIACICIAAIEDO");
        Sezione sezione = new Sezione(pagina.getContent(), "CIAO CIAO");
        List<Sezione> pageList = new ArrayList<>();
        pageList.add(sezione);
        List<String> authorList = new ArrayList<>();
        Libro libro = new Libro(pageList, 4.99, authorList);
        libro.printPage();
    }

}
