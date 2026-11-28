package it.unisa.diem.softeng.prenotazioneauleuniversitarie;

public class Docente{
    private final String email;
    private String nome;
    private String cognome;
    
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    
}