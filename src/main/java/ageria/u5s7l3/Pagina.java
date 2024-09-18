package ageria.u5s7l3;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Pagina implements Element {
    private String content;


    @Override
    public int getPages() {
        return 1;
    }

    @Override
    public void printPage() {
        System.out.println(this.content);
    }

    @Override
    public String toString() {
        return "Pagina: " +
                " content: '" + content;
    }
}
