import java.util.ArrayList;

import static java.lang.Math.round;

public class Seriaal {
    private String nimi;
    private String žanr;
    private String kirutaja;
    private ArrayList<Double> hinne;
    private String kommentaar;

    public Seriaal(String nimi, String žanr, String kirutaja, Double hinne, String kommentaar) {
        this.nimi = nimi;
        this.žanr = žanr;
        this.kirutaja = kirutaja;
        ArrayList<Double> hinded = new ArrayList<Double>();
        hinded.add(hinne);
        this.hinne = hinded;
        this.kommentaar = kommentaar;
    }

    public double keskmineHinne() {
        double keskmine = 0;
        ArrayList<Double> hinded = this.hinne;
        for (Double hinne : hinded) {
            keskmine += hinne;
        }
        keskmine = round(keskmine / hinded.size() * 100);
        return keskmine / 100;
    }

    public void lisahinne(double hinne) {
        this.hinne.add(hinne);
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getŽanr() {
        return žanr;
    }

    public void setŽanr(String žanr) {
        this.žanr = žanr;
    }

    public String getKirutaja() {
        return kirutaja;
    }

    public void setKirutaja(String kirutaja) {
        this.kirutaja = kirutaja;
    }

    public ArrayList<Double> getHinne() {
        return hinne;
    }

    public void setHinne(ArrayList<Double> hinne) {
        this.hinne = hinne;
    }

    public String getKommentaar() {
        return kommentaar;
    }

    public void setKommentaar(String kommentaar) {
        this.kommentaar = kommentaar;
    }

    @Override
    public String toString() {
        return "Nimi: " + nimi + '\n' +
                "Žanr: " + žanr + '\n' +
                "Kirjutaja: " + kirutaja + '\n' +
                "Hinne: " + keskmineHinne() + '\n' +
                "Kommentaar: " + kommentaar;
    }
}
