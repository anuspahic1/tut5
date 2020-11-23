package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Student {
    private String imePrezime;
    private int brIndeksa;
    private ArrayList<Predmet> listaPredmeta;

    public Student(String imePrezime, int brIndeksa) {
        this.imePrezime = imePrezime;
        this.brIndeksa = brIndeksa;
    }
    void dodajPredmet(Predmet p){
listaPredmeta.add(p);
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public ArrayList<Predmet> getListaPredmeta() {
        return listaPredmeta;
    }

    public void setListaPredmeta(ArrayList<Predmet> listaPredmeta) {
        this.listaPredmeta = listaPredmeta;
    }
}
