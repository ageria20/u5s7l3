package ageria.u5s7l3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

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
        System.out.println("Autori: " + this.authorList.stream().collect(Collectors.joining()));
        System.out.println("-------------------------------");

    }

}
