package ba.unsa.etf.rpr;

public abstract class Predmet {
    protected String imePredmeta;
    protected int ECTS;
    Predmet(String imePredmeta, int ECTS){
        this.imePredmeta=imePredmeta;
        this.ECTS=ECTS;
    }

    public String getImePredmeta() {
        return imePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }
}
