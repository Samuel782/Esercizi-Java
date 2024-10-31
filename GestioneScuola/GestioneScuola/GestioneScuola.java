package GestioneScuola;

public class GestioneScuola {
    public static void main(String[] args) {
        Scuola scuola = new Scuola("Giorgi", 52);
        Classe TerzaDI = new Classe("3DI");
        Classe QuartaDI = new Classe("4DI");
        Classe QuintaDI = new Classe("5DI");

        scuola.aggiungiClasse(TerzaDI);
        scuola.aggiungiClasse(QuartaDI);
        scuola.aggiungiClasse(QuintaDI);

        Studente s1 = new Studente("Mino", "Bianchi", "BNCMNO05F19B180H");
        Studente s2 = new Studente("Pino", "Neri", "BNCMNO05F19B180H");

        QuartaDI.aggiungiStudente(s1);
        QuartaDI.aggiungiStudente(s2);

        
        System.out.println(QuartaDI);            //chimata implicita
        System.out.println(QuartaDI.toString()); //chimata esplicita        

        
    } 
}
