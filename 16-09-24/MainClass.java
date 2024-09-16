import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        /*
         * In java tutto viene inizializzato con dei valori di
         * default. (Solo in un caso)
         * int = 0
         * double = 0.0
         * boolean = false
         */

        // allocazione di un vettore
        int[] vettore = new int[25];

        // allocazione di matrici
        // matrice con 10 righe e 20 colonne
        int[][] matrice = new int[10][20];

        // scorrere tra tutte le celle della matrice
        // matrice.leght vale il numero di righe -> 10
        for (int i = 0; i < matrice.length; i++) {

            // matrice[i].lenght vale il numero di colonne della riga i-esima -> 20
            for (int j = 0; j < matrice[i].length; j++) {

            }
        }

        /*
         * in C una stringa è un vettore di caratteri
         * char s[25];
         */

        // possiamo fare come in c
        // char[] nome = new char[25];
        // non è una vera e propria stringa, ma un vettore di caratteri

        String nome; // La S è maiuscola

        // Attenzione: la striga è a lunghezza variabile!! In java non definiremo mai la
        // dimensione.

        nome = "Ettorino";
        System.out.println(nome);

        /*
         * Input, output, lunghezza, confronto tra strighe
         * In c input di stringhe:
         * scanf("%s", nome); gets(nome); fgets(nome,N,stdin);
         * 
         * In c output di stringhe:
         * printf("%s", nome); puts(nome); fputs(nome,N,stdout);
         * 
         * In c lunghezza:
         * int size = strlen(nome);
         * 
         * In c confronto tra stringhe
         * if(strcmp(nome, "Andrea")==0)
         */

        Scanner tastiera = new Scanner(System.in);
   
        // input
        String cognome = tastiera.nextLine();

        // output
        System.out.println("Benvenuto " + cognome);

        /*
         * Lughezza stringa
         * Attenzione: questo .length ha bisogno delle parentesi!
         */
        int dimensione = cognome.length();

        /*
         * Confronto tra stringhe
         * è sbagliatissimo utilizzare == nel confronto tra stringhe.
         * anche se in alcuni casi SEMBRA funzionare.
         */

        if (cognome.compareTo("Deluca") == 0) {
            System.out.println("Corretto!");
        }

        /*
         * In C abbiamo usato gli interi per raggirare l'assenza dei booleani
         * in flag=0;
         * int isPrimo = 1;
         * 
         * In java esistono i booleani
         * 
         */

        boolean flag = false;
        boolean isPrimo = true;

        // In java c'è lo stesso problema del C, in parola andrà a finire il \n
        int x = tastiera.nextInt();
        String parola = tastiera.nextLine();

        // Soluzione
        x = tastiera.nextInt();
        tastiera.nextLine(); // Elimina il \n dal buffer
        
        parola = tastiera.nextLine();

        parola = "LoremIpsum";

       
        String parolaMaiuscola = "";
        // trasformare le stringhe in maiuscolo
        for (int i = 0; i < parola.length(); i++) {
            if (parola.charAt(i) >= 'a' || parola.charAt(i) <= 'z') {
                // in Java le stringhe sono immutabili!
                // è impossibile modificare i singoli caratteri

                // parola[i] = toUpper(parole[i]); non esiste non esiste la sintassi,
                // perchè modifico un singolo carattere
                // non esistono modi per accedere in scrittura ai singoli caratteri di una stringa 


                // ma possiamo raggirare questo problema creano una nuova stringa copiando i caratteri
                // da parola in parola maiuscola, trasformandolo in maiuscolo
                //parolaMaiuscola += (Character.toUpperCase(parola.charAt(i)));
                parolaMaiuscola += (char)(parola.charAt(i)-32);
            }else{
                parolaMaiuscola += parola.charAt(i);
            }
        }

        System.out.println(parolaMaiuscola);

        tastiera.close();
    }
}
