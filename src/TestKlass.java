import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestKlass {
    public static void main(String[] args) {
        List<Raamat> raamatud = new ArrayList<>();
        List<Film> filmid = new ArrayList<>();
        List<Seriaal> seriaalid = new ArrayList<>();
        Film seitse = new Film("Seitse", "thriller", "David Fincher", 7.3, "Norm film");
        Film titanic = new Film("Titanic", "romance", "James Cameron", 8.4, "Pole paha");
        Raamat R1984 = new Raamat("1984", "idk", "KeegiKuskil", 8.1, "Käib kah");
        Raamat Piibel = new Raamat("Piibel", "idk", "KeegiKunagi", 3.1, "Saaks Paremini");
        raamatud.add(R1984);
        raamatud.add(Piibel);
        filmid.add(seitse);
        filmid.add(titanic);
        seriaalid.add(new Seriaal("GoT", "Seiklus", "G. R. R. Martin", 7.7, "Lõpp jama"));
        seriaalid.add(new Seriaal("Kitchen Nightmares", "kokkamine", "Gordon Ramsey", 5.3, "Lõbus"));

        lisaFilmFaili("Filmid.txt", filmid);
        lisaRaamatFaili("Raamatud.txt", raamatud);
        lisaSeriaalFaili("Seriaalid.txt", seriaalid);

    }

    public static void lisaFilmFaili(String failinimi, List<Film> filmid) {
        try {
            FileWriter myWriter = new FileWriter(failinimi);
            for (Film film : filmid) {
                myWriter.write(film.getNimi() + " ; " + film.getŽanr() + " ; " + film.getRežissöör() + " ; " + film.keskmineHinne() + " ; " + film.getKommentaar() + "\n");
            }
            myWriter.close();
            System.out.println("Filmid lisatud!");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static void lisaRaamatFaili(String failinimi, List<Raamat> raamatud) {
        try {
            FileWriter myWriter = new FileWriter(failinimi);
            for (Raamat raamat : raamatud) {
                myWriter.write(raamat.getNimi() + " ; " + raamat.getŽanr() + " ; " + raamat.getAutor() + " ; " + raamat.keskmineHinne() + " ; " + raamat.getKommentaar() + "\n");
            }
            myWriter.close();
            System.out.println("Raamat lisatud!");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static void lisaSeriaalFaili(String failinimi, List<Seriaal> seriaalid) {
        try {
            FileWriter myWriter = new FileWriter(failinimi);
            for (Seriaal seriaal : seriaalid) {
                myWriter.write(seriaal.getNimi() + " ; " + seriaal.getŽanr() + " ; " + seriaal.getKirutaja() + " ; " + seriaal.keskmineHinne() + " ; " + seriaal.getKommentaar() + "\n");
            }
            myWriter.close();
            System.out.println("Seriaal lisatud!");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }


}
