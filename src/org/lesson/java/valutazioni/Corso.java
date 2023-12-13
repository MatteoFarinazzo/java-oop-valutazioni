package org.lesson.java.valutazioni;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class Corso {
    //attributi
    private ArrayList<Studente> students = new ArrayList<>();

    private ArrayList<Studente>promossi= new ArrayList<>();

    //Getter Setter


    //metodi

    public void getElencoStudenti (){
        for (Studente studente: students) {
            System.out.println("ID studente: " + studente.getIdStudente() + " ");
        }

    }

    public void removeStudent (int ID){
        students.remove(ID-1);
    }

    public void addStudent (Studente nuovoStudente){
        students.add(nuovoStudente);
    }

    private void getPromossiList (){
        for (Studente studente:students){
            if (studente.isPassed()){
                promossi.add(studente);
            }
        }
    }

    public void getPromossiNum (){
        getPromossiList();
        System.out.println("Gli studenti promossi sono: ");
        for (Studente promosso : promossi){
            System.out.println(promosso);
        }
    }

    public double getPromossiPercentage (){
        getPromossiList();
        double perPromossi =(promossi.size()*students.size()/10.0);
        return perPromossi;

    }

}
