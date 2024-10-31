package Moda;

public class Modello {
    
    private String nome;
    private double costo; 
    private double MQmateriale;

    public Modello(String nome, double costo, double MQmateriale){
        this.nome = nome; 
        this.costo = costo; 
        this.MQmateriale = MQmateriale;
    }


    public double getCosto() {
        return this.costo;
    }

    public double getTessuto() {
        return this.MQmateriale;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
