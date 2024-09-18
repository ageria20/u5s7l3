package ageria.u5s7l3;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Sezione extends Pagina {
    private String title;


    public Sezione(String content, String title) {
        super(content);
        this.title = title;
    }


}
