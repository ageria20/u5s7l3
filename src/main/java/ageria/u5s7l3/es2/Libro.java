package ageria.u5s7l3.es2;

import ageria.u5s7l3.Element;
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
    public void printPage() {
        System.out.println("-------------------------------");
        System.out.println("Titolo:");
        this.paginaList.stream().map(pagina -> pagina.getTitle()).forEach(System.out::println);
        System.out.println("Contenuto:");
        this.paginaList.stream().map(pagina -> pagina.getContent()).forEach(System.out::println);
        System.out.println("Price: " + this.price);
        System.out.println("Autori");
        this.authorList.stream().forEach(System.out::println);
        System.out.println("-------------------------------");

    }

}
