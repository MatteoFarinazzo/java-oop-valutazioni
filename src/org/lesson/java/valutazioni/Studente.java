package org.lesson.java.valutazioni;

import java.math.BigDecimal;

public class Studente {

    //Attributi

    private int idStudente;
    private static int counter = 10;
    private int assenze;
    private double mediaVoti;

    //Costruttore

    public Studente( int assenze, double mediaVoti) {
        this.idStudente = counter++;
        this.assenze = assenze;
        this.mediaVoti = mediaVoti;
    }


    //Getter e Setter
    public int getIdStudente() {
        return idStudente;
    }

    public void setIdStudente(int idStudente) {
        this.idStudente = idStudente;
    }

    public int getAssenze() {
        return assenze;
    }

    public void setAssenze(int assenze) {
        this.assenze = assenze;
    }

    public double getMediaVoti() {
        return mediaVoti;
    }

    public void setMediaVoti(double mediaVoti) {
        this.mediaVoti = mediaVoti;
    }


    //Metodi

    public boolean isPassed (){

        if (assenze > 50){
            return false;
        }
         if (assenze>25 && assenze<50 && mediaVoti<=2) {
            return false;
        }
         if (assenze<25 && mediaVoti < 2){
             return false;
         }
         else return true;
    }
}
