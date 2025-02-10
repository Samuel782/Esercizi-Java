public class app {
    public static void main(String[] args) {
        // Non posso istanziare una classe astratta
        // Sportivo s = new Sportivo(10);

        // Posso istanziare una classe figlia
        Sciatore s = new Sciatore(100, "Slalom");
        Calciatore c = new Calciatore(100, 10);
    }
}
