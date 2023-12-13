package org.lesson.java.valutazioni;

import java.util.ArrayList;

public class Corso {
    //attributi
    private ArrayList<Studente> students = new ArrayList<>();


    //metodi
    public static void getElencoStudenti (ArrayList<Studente> students){
        for (Studente studente: students) {
            System.out.println("ID studente: " + studente.getIdStudente() + " ");
        }

    }

    public static void removeStudent (ArrayList<Studente> students, int ID){
        students.remove(ID);
    }

    public static void addStudent (ArrayList<Studente> students, Studente nuovoStudente){
        students.add(nuovoStudente);
    }

    public static void getPromossiNum (ArrayList<Studente> students){
        for (Studente studente: students) {
            if ()

        }
    }

}
