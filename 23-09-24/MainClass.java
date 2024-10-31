import java.util.Scanner;

public class MainClass {

    /*
     * Scrivere due funzioni:
     * 1) input output di un vettore di interi con output del valore minimo e
     * massimo
     * 2) Come la prima ma con una matrice
     * 
     * Aggiunta:
     * Funzione che acquisisce in input n stringhe e visualizza la stringa più lunga
     * la stringa con il maggiorn numero di vocali, la stringa con il maggior numero
     * di consonanti
     */

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        // vettore(tastiera);
        // matrice(tastiera);
        stringhe(tastiera);
        tastiera.close();
    }

    public static void vettore(Scanner tastiera) {
        System.out.println("Inserisci la dimensizione del vettore: ");

        int len = tastiera.nextInt();
        int[] v = new int[len];

         System.out.println("Inserisci i valori del vettore: ");

        for (int i = 0; i < v.length; i++) {
             v[i] = tastiera.nextInt();
            //v[i] = (int)(Math.random() * 1001);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < v.length; i++) {
            if (v[i] < min) {
                min = v[i];
            }
            if (v[i] > max) {
                max = v[i];
            }
        }
        System.out.println("Max: " + max + " Min: " + min);

    }

    public static void matrice(Scanner tastiera) {
        System.out.println("Inserisci le dimensioni della matrice: ");
        int x = tastiera.nextInt();
        int y = tastiera.nextInt();
        int[][] v = new int[x][y];

        // System.out.println("Inserisci i valori della matrice: ");

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                // v[i][j] = tastiera.nextInt();
                v[i][j] = (int) (Math.random() * 1001);
            }
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (v[i][j] < min) {
                    min = v[i][j];
                }
                if (v[i][j] > max) {
                    max = v[i][j];
                }
            }
        }

        System.out.println("Max: " + max + " Min: " + min);
    }

    public static void stringhe(Scanner tastiera){
        System.out.println("Inserisci il numero di stringhe da inserire: ");
        int n = tastiera.nextInt();
        tastiera.next();
        String []stringhe = new String[n];

        for(int i = 0; i<stringhe.length; i++){
            stringhe[i] = tastiera.nextLine();
        }

        int SmaxLen = 0, SmaxVoc = 0, SmaxCons = 0;
        int ImaxLen = 0, ImaxVoc = 0, ImaxCons = 0; 

        for(int i = 0; i<stringhe.length; i++ ){

            if(stringhe[i].length() > SmaxLen){
                SmaxLen = stringhe[i].length();
                ImaxLen = i;
            }

            int voc=0, cons=0;

            for(int j=0; j < stringhe[i].length(); j++){
                if(Character.isLetter(stringhe[i].charAt(j)) && isVowel(stringhe[i].charAt(j))){
                    voc++;
                }else if(Character.isLetter(stringhe[i].charAt(j)) && !isVowel(stringhe[i].charAt(j))){
                    cons++;
                }   
            }
            
            if(SmaxVoc<voc) {
                SmaxVoc = voc;
                ImaxVoc = i;
            }
            if(SmaxCons<cons){
                SmaxCons =  cons;
                ImaxCons = i;
            } 
        }
        System.out.println("Piu' lunga: " + SmaxLen + "  Più vocali: " + SmaxVoc + " Più consonanti: " + SmaxCons);
        System.out.println("Piu' lunga: " + stringhe[ImaxLen] + " Più vocali: " + stringhe[ImaxVoc] + " Più consonanti: " + stringhe[ImaxCons]);
    }

    public static int contaVocali(String stringa){
        int c=0;
        for(int i = 0; i<stringa.length(); i++){
            if(isVowel(stringa.charAt(i))) c++;
        }
        return c;
    }

    public static boolean isVowel(char x) {
       return x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O'|| x == 'U';
    }
}
