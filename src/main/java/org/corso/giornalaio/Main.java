package org.corso.giornalaio;


public class Main {
    public static void main(String[] args) throws RivistaNonEsistente, ClienteNonEsistente {
        Giornalaio giornalaio = new Giornalaio();

        Cliente danilo = new Cliente("Danilo");
        Cliente matteo = new Cliente("Matteo");
        Cliente andrea = new Cliente("Andrea");
        Cliente federico = new Cliente("Federico");

        Rivista moda = new Rivista("Moda", 1);
        Rivista sport = new Rivista("Sport", 4);
        Rivista tech = new Rivista("Tech", 3);
        Rivista vino = new Rivista("Vino", 5);
        Rivista arte = new Rivista("Arte", 7);
        Rivista caccia = new Rivista("Caccia", 7);

        giornalaio.getListaAbbonamenti().assegnaAbbonamenti(danilo, moda);
        giornalaio.getListaAbbonamenti().assegnaAbbonamenti(danilo, tech);
        giornalaio.getListaAbbonamenti().assegnaAbbonamenti(danilo, vino);
        giornalaio.getListaAbbonamenti().assegnaAbbonamenti(danilo, arte);
        giornalaio.getListaAbbonamenti().assegnaAbbonamenti(danilo, sport);
        giornalaio.getListaAbbonamenti().assegnaAbbonamenti(andrea, caccia);
        giornalaio.getListaAbbonamenti().assegnaAbbonamenti(andrea, sport);
        giornalaio.getListaAbbonamenti().assegnaAbbonamenti(andrea, moda);
        giornalaio.getListaAbbonamenti().assegnaAbbonamenti(federico, tech);
        giornalaio.getListaAbbonamenti().assegnaAbbonamenti(federico, vino);
        giornalaio.getListaAbbonamenti().assegnaAbbonamenti(federico, arte);
        giornalaio.getListaAbbonamenti().assegnaAbbonamenti(matteo, sport);
        giornalaio.getListaAbbonamenti().disdiciAbbonamenti(danilo, moda);

        giornalaio.stampaAbbonamenti();
    }
}
