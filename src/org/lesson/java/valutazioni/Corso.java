package org.lesson.java.valutazioni;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class Corso {
    //attributi

    private String name;
    private ArrayList<Studente> students;

//    private ArrayList<Studente>promossi;

    //Costruttori

    public Corso(String name){
        this.name = name;
        this.students = new ArrayList<>();
//        this.promossi = new ArrayList<>();
    }

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

    private ArrayList<Studente> getPromossiList (){
        ArrayList listaStudentiPromossi = new ArrayList<>();
        for (Studente studente:students){
            if (studente.isPassed()){
                listaStudentiPromossi.add(studente);
            }
        }
        return listaStudentiPromossi;
    }

    public void getPromossiNum (){
        getPromossiList();
        for (Studente promosso : getPromossiList()){
            System.out.println(promosso);
        }
    }

    public double getPromossiPercentage (){
        getPromossiList();
        double perPromossi = ((double) getPromossiList().size() /students.size()*100.0);
        return perPromossi;

    }

    @Override
    public String toString() {
        String stamp = "Il corso " + name + " è formato dagli studenti: ";
        for (Studente studente: students) {
            stamp += "\n" + "Id:"+studente.getIdStudente()+ " con una percentuale assenze del = "+ studente.getAssenze()+" %"+ " La sua media dei voti: "+studente.getMediaVoti();
        }
        return stamp;
    }
}
