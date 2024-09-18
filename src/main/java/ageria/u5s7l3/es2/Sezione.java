package ageria.u5s7l3.es2;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Sezione extends Pagina {
    private String title;
    private List<Sezione> sottoSezione;

    public Sezione(String content, String title) {
        super(content);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Sezione: " +
                " title:'" + title +
                " content: " + this.getContent();
    }
}
