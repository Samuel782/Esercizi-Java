import Biblio.*;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Bibblioteca b1 = new Bibblioteca();
        Scanner tastiera = new Scanner(System.in);

        while (true) {
            System.out.println("Inserisci |>| per aprire il menu' \n");
            String input = tastiera.nextLine();
            if (input.equals(">")) {
                System.out.println("Scegli un'opzione:");
                System.out.println("1. Aggiungi libro\n");
                System.out.println("2. Cerca libro\n");
                System.out.println("3. Stampa contenuto scaffale\n");
                System.out.println("4. Esci\n");

                int scelta = tastiera.nextInt();
                switch (scelta) {
                    case 1:

                        break;
                    case 2:
                        System.out.println("Inserisci nome libro: ");
                        String nome = tastiera.nextLine();
                        System.out.println("Inserisci autore: ");
                        String autore = tastiera.nextLine();
                        b1.cerca(nome, autore);
                        break;
                    case 3:
                        System.out.println("Inserisci numero piano");
                        int piano = tastiera.nextInt();
                        System.out.print("Inserisci codice scaffale: ");
                        String codice = tastiera.nextLine();
                        b1.getPiano(piano).getScaffaleCodice(codice).getLibri();
                        break;
                    case 4:
                        System.out.println("Fine");
                        return;
                    default:
                        System.out.println("Opzione non valida");
                }
            }
        }
    }

}