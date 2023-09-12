public final class Wychowawca extends Nauczyciel{
    //final nie można z tej klasy dziedziczyć
    private  Klasa klasa;

    public Wychowawca(String imie, String nazwisko, Klasa klasa, String... przedmioty) {
        super(imie, nazwisko, przedmioty);
        this.klasa = klasa;
    }
}
