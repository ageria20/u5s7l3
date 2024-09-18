package ageria.u5s7l3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class Libro implements Element {

    private List<Sezione> paginaList;
    private double price;
    private List<String> authorList;


    @Override
    public int getPages() {
        return this.paginaList.size();
    }

    @Override
    public String printPage() {
        return this.paginaList.stream().map(pagina -> pagina.getContent()).toString();
    }

    @Override
    public String toString() {
        return "Libro -> " +
                " paginaList: " + paginaList +
                ", price: " + price +
                ", authorList: " + authorList;
    }
}
