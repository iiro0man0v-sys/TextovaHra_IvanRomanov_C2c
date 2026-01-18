package Else;

public class Nacitani {
    private Prostor aktualniProstor;
    private Inventar batoh;

    public void nacitani() {
        batoh = new Inventar();

    }

    public void nactiZeSouboru(String cesta) {

    }

    public Prostor getAktualniProstor() {
        return aktualniProstor;
    }

    public void setAktualniProstor(Prostor prostor) {
        this.aktualniProstor = prostor;
    }

    public Inventar getBatoh() {
        return batoh;
    }
}
