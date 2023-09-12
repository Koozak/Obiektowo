public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if(imie.length()<3){
            System.out.println("Imie musi mieć więcej niż 3 znaki");
        }
        else{
            this.imie = imie;
        }
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if(wiek<0){
            this.wiek = 0;
        }
        else{
            this.wiek = wiek;
        }
    }
}
