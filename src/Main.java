public class Main {
    public static void main(String[] args) {
        Osoba osoba = new Osoba();
        osoba.setImie("Jan");
        System.out.println("Imie naszej osoby "+osoba.getImie());
        osoba.setWiek(-20);
        System.out.println("Wiek "+osoba.getWiek());

        Osoba osoba2 = new Osoba("Ola","Starsza",19);
        System.out.println(osoba2);

    }
}