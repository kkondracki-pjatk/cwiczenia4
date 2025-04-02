public class Wydarzenie {
    String nazwa;
    String data;
    String miejsce;
    int maxLiczbaMiejsc = 100;
    int dostępneMiejsca = 0;
    double cena;

    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Wydarzenie(String nazwa, double cena, String data) {
        this(nazwa, cena);
        this.data = data;
    }

    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this(nazwa, cena, data);
        this.miejsce = miejsce;
    }

    public void zarezerwujMiejsce() {
        if (dostępneMiejsca < maxLiczbaMiejsc) {
            dostępneMiejsca++;
        }
    }

    public String toString() {
        return "Wydarzenie: " + nazwa + ", Data: " + data + ", Miejsce: " + miejsce + ", Cena: " + cena;
    }
}
