public class Squadra {
    private String nome;
    private String colMaglia;
    private HashMap<Integer, Giocatore> giocatori;

    public Squadra(){
        giocatori = new HashMap<Integer, Giocatore>();
    }

}
