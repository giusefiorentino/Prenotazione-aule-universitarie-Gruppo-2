package it.unisa.diem.softeng.prenotazioneauleuniversitarie;

public class Docente{
    private final String email;
    private final String nome;
    private final String cognome;
    
    public Docente(String email, String nome, String cognome) {
        this.email = email;
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
}