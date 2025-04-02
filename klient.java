import java.util.ArrayList;

public class Klient {
    String imię;
    String nazwisko;
    String email;
    ArrayList<Wydarzenie> listaRezerwacji = new ArrayList<>();

    public Klient(String imię, String nazwisko, String email) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public void dodajRezerwację(Wydarzenie wydarzenie) {
        listaRezerwacji.add(wydarzenie);
        wydarzenie.zarezerwujMiejsce();
    }

    public void wyświetlRezerwacje() {
        for (Wydarzenie w : listaRezerwacji) {
            System.out.println(w);
        }
    }

    public void anulujRezerwację(Wydarzenie wydarzenie) {
        listaRezerwacji.remove(wydarzenie);
    }
}
