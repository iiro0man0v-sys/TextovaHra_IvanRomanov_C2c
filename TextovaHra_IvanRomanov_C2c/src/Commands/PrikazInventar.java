package Commands;
import Else.Nacitani;

public class PrikazInventar implements IPrikaz {
    private Nacitani n;

    public PrikazInventar(Nacitani n) {
        this.n = n;
    }

    @Override
    public String proved(String[] parametry) {
        return "V batohu máš: ";
    }

    @Override
    public String getNazev() {
        return "inventar";
    }
}