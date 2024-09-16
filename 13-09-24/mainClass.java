//simile alle include del C
//Importa le librerie
import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {

        // Variabili
        int inputIntero = 0;
        double inputDouble = 0.0;

        // input da tastiera, scriverla una sola volta
        Scanner tastiera = new Scanner(System.in);

        // Sistassi stampa e acquisizione da tastiera
        System.out.print("Inserisci un intero: ");
        inputIntero = tastiera.nextInt();
        System.out.print("Inserisci un double: ");
        inputDouble = tastiera.nextDouble();

        // vettori
        int v[]; // Dichiarazione del vettore C-Style
        int[] v2; // Dichiarazione del vettore Java-Style

        v = new int[25]; // allocazione del vettore

        int v3[] = new int[25]; // Dichiarazion e allocazione del vettore

        /*
         * In java posso allocare un vettore a seguito di inout della dimensione
         * Illegale in C
         */
        int dim = tastiera.nextInt();
        int vettore[] = new int[dim];

        for (int i = 0; i < dim; i++) {
            // sitassi classica del for
        }

        for (int i = 0; i < vettore.length; i++) {
            /*
             * se dopo il nome del vettore scrivo .lenght ottengo in automatico
             * la dimensione del vettore
             * in c non esiste
             */
        }

        for (int elemento : vettore) {

            // for-each usato quando è necessario scorrere
            // lintero vettore e non si ha bisogno dell'indice
            // Attenzione: non è possibile utilizzarlo per l'input!
            // Poichè il valore che verrà inserito, andrà in elemento, che verra
            // sovrascritto nella iterazione successiva

        }

        System.out.println("I dati inseriti sono: " + inputIntero + " " + inputDouble);
        // chiudere lo scanner quando non verranno fatti più input
        tastiera.close();
    }

}
