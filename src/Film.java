import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;

import static java.lang.Math.round;

public class Film {
    private String nimi;
    private String žanr;
    private String režissöör;
    private ArrayList<Double> hinne;
    private String kommentaar;

    public Film(String nimi, String žanr, String režissöör, double hinne, String kommentaar) {
        this.nimi = nimi;
        this.žanr = žanr;
        this.režissöör = režissöör;
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

    public String getRežissöör() {
        return režissöör;
    }

    public void setRežissöör(String režissöör) {
        this.režissöör = režissöör;
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
                "Režissöör: " + režissöör + '\n' +
                "Hinne: " + keskmineHinne() + '\n' +
                "Kommentaar: " + kommentaar;
    }
}
