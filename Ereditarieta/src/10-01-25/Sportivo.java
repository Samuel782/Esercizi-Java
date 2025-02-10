public class Sportivo {
    protected int energia;

    public Sportivo(int energia) {
        this.energia = energia;
    }

    public void play() {
        this.energia--;
    }

}