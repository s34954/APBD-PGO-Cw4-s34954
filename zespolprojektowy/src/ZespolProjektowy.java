import java.util.ArrayList;

public class ZespolProjektowy {

    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;

    public ZespolProjektowy(String nazwaProjektu) {

        this.nazwaProjektu = nazwaProjektu;
        pracownicy = new ArrayList<>();
    }

    public void dodajPracownika(Pracownik pracownik) {

        pracownicy.add(pracownik);
    }

    public void wypiszSkladZespolu() {

        System.out.println("Projekt: " + nazwaProjektu);

        for (Pracownik p : pracownicy) {

            System.out.println(p);
        }
    }

    public double policzLacznyKoszt() {

        double suma = 0;

        for (Pracownik p : pracownicy) {

            suma += p.obliczKosztMiesieczny();
        }

        return suma;
    }

    public Pracownik znajdzPoId(String idPracownika) {

        for (Pracownik p : pracownicy) {

            if (p.pobierzIdPracownika().equals(idPracownika)) {
                return p;
            }
        }

        return null;
    }

    public void wypiszProgramistow() {

        for (Pracownik p : pracownicy) {

            if (p instanceof Programista) {

                System.out.println(p.przedstawSie());
            }
        }
    }
}