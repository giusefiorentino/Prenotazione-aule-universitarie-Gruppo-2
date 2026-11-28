package it.unisa.diem.softeng.prenotazioneauleuniversitarie;

import java.time.LocalDate;
import java.time.LocalTime;

public class Prenotazione {
    private String id;
    private Aula aula;
    private Docente docente;
    
    private TipoAttivita tipo;
    private String denominazioneCorso;
    
    private LocalDate data;
     private LocalTime oraInizio;
    private LocalTime oraFine;
    
    private boolean ricorrente; // true se fa parte di una serie settimanale
    private String codiceSerie; // ID condiviso da tutte le prenotazioni della stessa serie
    private LocalDate dataTermineSerie; // Data limite della serie (valida se ricorrente == true) }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public TipoAttivita getTipo() {
        return tipo;
    }

    public void setTipo(TipoAttivita tipo) {
        this.tipo = tipo;
    }

    public String getDenominazioneCorso() {
        return denominazioneCorso;
    }

    public void setDenominazioneCorso(String denominazioneCorso) {
        this.denominazioneCorso = denominazioneCorso;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getOraInizio() {
        return oraInizio;
    }

    public void setOraInizio(LocalTime oraInizio) {
        this.oraInizio = oraInizio;
    }

    public LocalTime getOraFine() {
        return oraFine;
    }

    public void setOraFine(LocalTime oraFine) {
        this.oraFine = oraFine;
    }

    public boolean isRicorrente() {
        return ricorrente;
    }

    public void setRicorrente(boolean ricorrente) {
        this.ricorrente = ricorrente;
    }

    public String getCodiceSerie() {
        return codiceSerie;
    }

    public void setCodiceSerie(String codiceSerie) {
        this.codiceSerie = codiceSerie;
    }

    public LocalDate getDataTermineSerie() {
        return dataTermineSerie;
    }

    public void setDataTermineSerie(LocalDate dataTermineSerie) {
        this.dataTermineSerie = dataTermineSerie;
    }
   
}
