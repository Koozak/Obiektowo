public class Uczen extends Osoba implements Dyzurny{
    private int nrUcznia;
    private static int iluUczniow = 0;
    public Uczen(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek); //wywołanie konstruktora klasy bazowej
        iluUczniow++;
        nrUcznia = iluUczniow;
    }

    @Override
    public String toString() {
        return "Uczen{Imie: "+getImie()+" Nazwisko: "+getNazwisko()+" nr ucznia: "+nrUcznia+"}";
    }

    @Override
    public void dyzuruj() {
        System.out.println("wycieranie tablicy");
    }
}
