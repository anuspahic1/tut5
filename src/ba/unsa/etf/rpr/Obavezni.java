package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Obavezni extends Predmet{

    private ArrayList<Student> listaUpisanihNaObavezni;

    Obavezni(String imePredmeta, int ECTS) {
        super(imePredmeta, ECTS);
    }
    void dodajStudente(Student s){
    listaUpisanihNaObavezni.add(s);
    }


    public ArrayList<Student> getListaUpisanihNaObavezni() {
        return listaUpisanihNaObavezni;
    }

    public void setListaUpisanihNaObavezni(ArrayList<Student> listaUpisanihNaObavezni) {
        this.listaUpisanihNaObavezni = listaUpisanihNaObavezni;
    }
}
