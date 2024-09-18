package ageria.u5s7l3;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserData implements DataSource {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        this.nomeCompleto = ds.getNomeCompleto();
        this.eta = ds.getEta();
    }
}
