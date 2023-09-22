package classestudente.java;

import java.time.LocalDate;
import java.time.Period;

public class studente {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;
    private int matricola;
    private String corsoDiStudi;
    private float[] voti = new float[10];


    public studente(String nome, String cognome, LocalDate dataDiNascita, int matricola, String corsoDiStudi) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.matricola = matricola;
        this.corsoDiStudi = corsoDiStudi;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public String getCorsoDiStudi() {
        return corsoDiStudi;
    }

    public void setCorsoDiStudi(String corsoDiStudi) {
        this.corsoDiStudi = corsoDiStudi;
    }


    public void aggiungiVoto(float voto, int posizione) {
        if (posizione >= 0 && posizione < 10) {
            voti[posizione] = voto;
        }
    }


    public void rimuoviVoti() {
        for (int i = 0; i < 10; i++) {
            voti[i] = 0.0f;
        }
    }

 
    public float calcolaMediaVoti() {
        float somma = 0;
        int conta = 0;
        for (int i = 0; i < 10; i++) {
            if (voti[i] != 0.0f) {
                somma += voti[i];
                conta++;
            }
        }
        if (conta > 0) {
            return somma / conta;
        } else {
            return 0.0f;
        }
    }

  
    public int calcolaEta() {
        LocalDate oggi = LocalDate.now();
        Period periodo = Period.between(dataDiNascita, oggi);
        return periodo.getYears();
    }

    public String stampaInformazioni() {
        String s = "";

        s += "Nome: " + nome;
        s += "\nCognome: " + cognome;
        s += "\nData di Nascita: " + dataDiNascita;
        s += "\nMatricola: " + matricola;
        s += "\nCorso di Studi: " + corsoDiStudi;
        s += "\nVoti:";
        for (int i = 0; i < 10; i++) {
            s += "\nVoto " + (i + 1) + ": " + voti[i];
        }
        s += "\nMedia dei Voti: " + calcolaMediaVoti();
        s += "\nEtà: " + calcolaEta() + " anni";

        return s;
    }
}