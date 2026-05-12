public class Programista extends Pracownik {

    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String idPracownika,
                       String imie,
                       String nazwisko,
                       double stawkaBazowa,
                       String glownyJezyk,
                       int liczbaRepozytoriow) {

        super(idPracownika, imie, nazwisko, stawkaBazowa);

        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    @Override
    public double obliczKosztMiesieczny() {

        return getStawkaBazowa() + (liczbaRepozytoriow * 200);
    }

    @Override
    public String przedstawSie() {

        return "Programista: " +
                getImie() +
                " " +
                getNazwisko() +
                ", język: " +
                glownyJezyk;
    }

    public void wypiszTechnologie() {

        System.out.println("Technologia: " + glownyJezyk);
    }

    @Override
    public String toString() {

        return super.toString() +
                ", Język: " + glownyJezyk +
                ", Repozytoria: " + liczbaRepozytoriow;
    }
}