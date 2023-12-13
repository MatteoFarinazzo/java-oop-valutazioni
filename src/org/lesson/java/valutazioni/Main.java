package org.lesson.java.valutazioni;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //ArrayList<Studente> studenti = new ArrayList<>();
        Random random = new Random();
        int numberofStudents = random.nextInt(10, 20);

        Corso corso = new Corso();
        for (int i = 0; i < numberofStudents; i++) {

            int assenze = random.nextInt(0, 100);
            double mediaVoti = random.nextInt(0, 5);
            Studente studente = new Studente(assenze, mediaVoti);
            corso.addStudent(studente);

        }

        //Provo a rimuovere uno studente
        System.out.println("rimuovo lo studente con id 8");
        corso.removeStudent(8);

        //provo ad aggiungere uno studente
        Studente studente = new Studente(29, 10);
        corso.addStudent(studente);
        corso.getElencoStudenti();

        corso.getPromossiNum();
        corso.getPromossiPercentage();
        double promossiCorso = corso.getPromossiPercentage();
        DecimalFormat decimal = new DecimalFormat("#.##");
        String perPromossiFormatted = decimal.format(promossiCorso);

        System.out.println("Gli studenti del primo corso promossi sono il "+ perPromossiFormatted + "%");

        Corso corso2 = new Corso();
        for (int i = 0; i < numberofStudents; i++) {

            int assenze = random.nextInt(0, 100);
            double mediaVoti = random.nextInt(0, 5);
            Studente studente2 = new Studente(assenze, mediaVoti);
            corso2.addStudent(studente2);

        }
        corso2.getElencoStudenti();

        corso2.getPromossiNum();
        corso2.getPromossiPercentage();
        double promossiCorso2 = corso.getPromossiPercentage();
        DecimalFormat decimal2 = new DecimalFormat("#.##");
        String perPromossiFormatted2 = decimal.format(promossiCorso2);

        System.out.println("Gli studenti del secondo corso promossi sono il "+ perPromossiFormatted2 + "%");

    }
}
