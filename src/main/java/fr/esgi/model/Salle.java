package fr.esgi.model;

public class Salle {
    private String numero;
    private int capacite;
    private String batiment;
    private boolean disponible;

    public Salle(String numero, int capacite, String batiment, boolean disponible) {
        this.numero = numero;
        this.capacite = capacite;
        this.batiment = batiment;
        this.disponible = disponible;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public String getBatiment() {
        return batiment;
    }

    public void setBatiment(String batiment) {
        this.batiment = batiment;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
