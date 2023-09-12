public class Main {
    public static void main(String[] args) {
        Osoba osoba = new Osoba();
        osoba.setImie("Jan");
        System.out.println("Imie naszej osoby "+osoba.getImie());
        osoba.setWiek(-20);
        System.out.println("Wiek "+osoba.getWiek());

        Osoba osoba2 = new Osoba("Ola","Starsza",19);
        System.out.println(osoba2);
        Uczen uczen3AC = new Uczen("Emil","Smalandzki",22);
        Uczen uczen3P = new Uczen("Emilia","pragmatyczna",21);
        System.out.println(uczen3AC);
        System.out.println(uczen3P);

    }
}