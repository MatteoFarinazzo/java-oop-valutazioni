package org.lesson.java.valutazioni;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Studente> studenti = new ArrayList<>();


            for (int i = 0; i < 11; i++) {
                Studente studente = new Studente(10,29);
                studenti.add(studente);

            }
            Corso.getElencoStudenti(studenti);

    }
}
