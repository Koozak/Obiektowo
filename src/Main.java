public class Main {
    public static void main(String[] args) {
 /*       Osoba osoba = new Osoba();
        osoba.setImie("Jan");
        System.out.println("Imie naszej osoby "+osoba.getImie());
        osoba.setWiek(-20);
        System.out.println("Wiek "+osoba.getWiek());
        Osoba osoba2 = new Osoba("Ola","Starsza",19);
        System.out.println(osoba2);*/


        Uczen uczen3AC = new Uczen("Emil","Smalandzki",22);
        Uczen uczen3P = new Uczen("Emilia","pragmatyczna",21);
        uczen3AC.dyzuruj();
        System.out.println(uczen3AC);
        System.out.println(uczen3P);
        Nauczyciel nauczycielSN = new Nauczyciel("Sebastian","Nadwiślański","Matematyka","Fizyka");
        System.out.println(nauczycielSN);
        Uczen uczen3 = new Uczen("Albert","Einstein",6);
        Klasa klasa2AC = new Klasa("klasa_2ac",uczen3P,uczen3AC);
        klasa2AC.dodajUczniaDoKlasy(uczen3);
        System.out.println(klasa2AC);
        Klasa klasa3AC = new Klasa(klasa2AC);
        System.out.println(klasa3AC);
        Wychowawca wychowawca = new Wychowawca("Anna","Kowalska",klasa3AC,"tehcnika","Matematyka","fizyka");
        System.out.println(wychowawca);
        Szkola zs10 = Szkola.getSzkola();
    }
}