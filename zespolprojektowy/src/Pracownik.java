public class Pracownik {

    private String idPracownika;
    private String imie;
    private String nazwisko;
    private double stawkaBazowa;

    public Pracownik(String idPracownika, String imie,
                     String nazwisko, double stawkaBazowa) {

        this.idPracownika = idPracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stawkaBazowa = stawkaBazowa;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getStawkaBazowa() {
        return stawkaBazowa;
    }

    // metoda final
    public final String pobierzIdPracownika() {
        return idPracownika;
    }

    public double obliczKosztMiesieczny() {
        return stawkaBazowa;
    }

    public String przedstawSie() {
        return "Pracownik: " + imie + " " + nazwisko;
    }

    @Override
    public String toString() {
        return "ID: " + idPracownika +
                ", Imię: " + imie +
                ", Nazwisko: " + nazwisko +
                ", Stawka: " + stawkaBazowa;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Pracownik other = (Pracownik) obj;

        return this.idPracownika.equals(other.idPracownika);
    }
}