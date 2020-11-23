package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Izborni extends Predmet{
    private ArrayList<Student> listaUpisanihNaIzborni;
    Izborni(String imePredmeta, int ECTS) {

        super(imePredmeta, ECTS);
    }
    void dodajStudente(Student s){
listaUpisanihNaIzborni.add(s);
    }


    public ArrayList<Student> getListaUpisanihNaIzborni() {
        return listaUpisanihNaIzborni;
    }

    public void setListaUpisanihNaIzborni(ArrayList<Student> listaUpisanihNaIzborni) {
        this.listaUpisanihNaIzborni = listaUpisanihNaIzborni;
    }

}
