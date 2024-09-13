import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        

        //input da tastiera, scriverla una sola volta
        Scanner tastiera = new Scanner(System.in);

        //Variabili
        int inputIntero = 0;
        double inputDouble = 0.0;

        //vettori
        int v[];        //Dichiarazione del vettore C-Style
        int[] v2;       //Dichiarazione del vettore Java-Style

        v = new int[25]; //allocazione del vettore

        int v3[] = new int[25]; //Dichiarazion e allocazione del vettore


        
        /* In java posso allocare un vettore a seguito di inout della dimensione
         * Illegale in C
         */

        int dim = tastiera.nextInt();
        int vettore[] = new int[dim];

        System.out.print("Inserisci un intero: ");
        inputIntero = tastiera.nextInt();
        System.out.print("Inserisci un double: ");
        inputDouble = tastiera.nextDouble();



        System.out.println("I dati inseriti sono: "+ inputIntero + " " + inputDouble);
        //chiudere lo scanner quando non verranno fatti più input 
        tastiera.close();   
    }
    
}
