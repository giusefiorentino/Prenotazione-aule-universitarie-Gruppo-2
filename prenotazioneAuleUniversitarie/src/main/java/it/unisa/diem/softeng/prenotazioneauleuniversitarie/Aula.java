package it.unisa.diem.softeng.prenotazioneauleuniversitarie;

public class Aula {
    private final String id;
    private String nome;
    private String edificio;
    private int piano;
    private int capienza;

    public Aula(String id, String nome, String edificio, int piano, int capienza) {
        this.id = id;
        this.nome = nome;
        this.edificio = edificio;
        this.piano = piano;
        this.capienza = capienza;
    }

    public String Id() {
        return id;
    }

    public String getNome() {
        return nome;
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
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public void setCapienza(int capienza) {
        this.capienza = capienza;
    }

}
