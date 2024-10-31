package Moda;

public class Colore {
    private String nome;

    public Colore(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}   