
public class Sciatore extends Sportivo {
    private String specialita;

    public Sciatore(int energia, String specialita) {
        super(energia);
        this.specialita = specialita;
    }

    @Override
    public void play() {
        super.energia -= 7;
    } 
}
