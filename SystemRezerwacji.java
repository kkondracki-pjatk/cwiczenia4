import java.util.ArrayList;

public class SystemRezerwacji {
    ArrayList<Wydarzenie> wydarzenia = new ArrayList<>();
    ArrayList<Klient> klienci = new ArrayList<>();

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        wydarzenia.add(wydarzenie);
    }

    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        klient.dodajRezerwację(wydarzenie);
    }
}
