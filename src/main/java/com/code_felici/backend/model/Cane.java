package com.code_felici.backend.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

@Entity
public class Cane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String razza;
    private String colore;
    private String microchip;
    private boolean vaccinato;
    private boolean sterilizzato;
    private String carattere;
    private double peso;

    private boolean isAdottato;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNascita;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataIngresso;

    @Enumerated(EnumType.STRING)
    private Sesso sesso;

    @Enumerated(EnumType.STRING)
    private Taglia taglia;

    private String note;
    private String fotoUrl;

    public Cane() {}

    // Getter e setter completi ↓↓↓

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getRazza() { return razza; }
    public void setRazza(String razza) { this.razza = razza; }

    public String getColore() { return colore; }
    public void setColore(String colore) { this.colore = colore; }

    public String getMicrochip() { return microchip; }
    public void setMicrochip(String microchip) { this.microchip = microchip; }

    public boolean isVaccinato() { return vaccinato; }
    public void setVaccinato(boolean vaccinato) { this.vaccinato = vaccinato; }

    public boolean isSterilizzato() { return sterilizzato; }
    public void setSterilizzato(boolean sterilizzato) { this.sterilizzato = sterilizzato; }

    public String getCarattere() { return carattere; }
    public void setCarattere(String carattere) { this.carattere = carattere; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public boolean isIsAdottato() { return isAdottato; } // nome getter coerente con campo
    public void setIsAdottato(boolean isAdottato) { this.isAdottato = isAdottato; }

    public LocalDate getDataNascita() { return dataNascita; }
    public void setDataNascita(LocalDate dataNascita) { this.dataNascita = dataNascita; }

    public LocalDate getDataIngresso() { return dataIngresso; }
    public void setDataIngresso(LocalDate dataIngresso) { this.dataIngresso = dataIngresso; }

    public Sesso getSesso() { return sesso; }
    public void setSesso(Sesso sesso) { this.sesso = sesso; }

    public Taglia getTaglia() { return taglia; }
    public void setTaglia(Taglia taglia) { this.taglia = taglia; }

    public String getNote() { return note; }
    public void setNote(String note) { this.note = note; }

    public String getFotoUrl() { return fotoUrl; }
    public void setFotoUrl(String fotoUrl) { this.fotoUrl = fotoUrl; }
}
