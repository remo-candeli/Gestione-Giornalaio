package org.corso.giornalaio;

public class Rivista {
    private String nomeRivista;
    private int giornoDiUscita;



    public Rivista() {
    }
   
    public Rivista(String nomeRivista, int giornoDiUscita) {
        this.nomeRivista = nomeRivista;
        this.giornoDiUscita = giornoDiUscita;
    }

    public String getNomeRivista() {
        return nomeRivista;
    }

    

    public int getGiornoDiUscita() {
        return giornoDiUscita;
    }    

}
