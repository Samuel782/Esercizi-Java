package Moda;

public class Materiale {

    private String nome;
    private double costomq;

    public Materiale(String nome, double costomq){
        this.nome = nome;
        this.costomq = costomq;
    }

    public double getCostomq() {
        return this.costomq;
    }

    @Override
    public String toString() {
        return this.nome; 
    }
    
}