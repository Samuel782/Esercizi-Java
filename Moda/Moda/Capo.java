package Moda;

public class Capo {
    Modello modello;
    Materiale materiale;
    Colore colore;
     
    public Capo(Modello modello, Materiale materiale, Colore colore){
        this.modello = modello;
        this.materiale = materiale;
        this.colore = colore;
    }

    public double prezzo(){
        return this.modello.getCosto() + (this.modello.getTessuto() * this.materiale.getCostomq());
    }

    public Colore getColore() {
        return this.colore;
    }
    public Materiale getMateriale() {
        return materiale;
    }
    public Modello getModello() {
        return modello;
    }

    @Override
    public String toString() {
        return this.modello + " " + this.colore + " di " + this.materiale;
    }

}
