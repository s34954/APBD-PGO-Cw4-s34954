public class Tester extends Pracownik {

    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika,
                  String imie,
                  String nazwisko,
                  double stawkaBazowa,
                  boolean czyAutomatyzujacy,
                  int liczbaScenariuszy) {

        super(idPracownika, imie, nazwisko, stawkaBazowa);

        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    @Override
    public double obliczKosztMiesieczny() {

        return getStawkaBazowa() + (liczbaScenariuszy * 50);
    }

    @Override
    public String przedstawSie() {

        return "Tester: " +
                getImie() +
                " " +
                getNazwisko() +
                ", automatyzacja: " +
                czyAutomatyzujacy;
    }

    public void uruchomRaportTestow() {

        System.out.println("Uruchomiono raport testów.");
    }

    public boolean isCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    @Override
    public String toString() {

        return super.toString() +
                ", Automatyzujący: " + czyAutomatyzujacy +
                ", Scenariusze: " + liczbaScenariuszy;
    }
}