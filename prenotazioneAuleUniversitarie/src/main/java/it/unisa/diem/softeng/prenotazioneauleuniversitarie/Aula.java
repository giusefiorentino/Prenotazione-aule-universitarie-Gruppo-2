package it.unisa.diem.softeng.prenotazioneauleuniversitarie;

public class Aula {
    private final String codice;
    private final String nome;
    private final String cognome;
    private final String edificio;
    private final int piano;
    private final int capienza;

    public Aula(String codice, String nome, String cognome, String edificio, int piano, int capienza) {
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.edificio = edificio;
        this.piano = piano;
        this.capienza = capienza;
    }

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEdificio() {
        return edificio;
    }

    public int getPiano() {
        return piano;
    }

    public int getCapienza() {
        return capienza;
    }

}
