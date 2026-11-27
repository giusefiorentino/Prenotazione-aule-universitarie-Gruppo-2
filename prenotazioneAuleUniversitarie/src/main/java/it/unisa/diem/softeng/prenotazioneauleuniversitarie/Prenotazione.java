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
}
