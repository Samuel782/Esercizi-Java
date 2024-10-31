import java.util.Scanner;

public class MainClass {
    /*
     * Realizzare un programma in java che:
     * - Gestisca l'input di una matrice M1 di x righe
     * ed y colonne di numeri causali fra 1 e 99
     * - Effettui la trasposta M2 della matrice M1
     * - Visualizzi in output prima la matrice M1
     * e succesivamente la trasposta M2
     */

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci il numero di righe: ");
        int x = tastiera.nextInt();
        System.out.println("Inserisci il numero di colonne: ");
        int y = tastiera.nextInt();
        int[][] M1 = riempi_matrice(x, y);
        int[][] M2 = matrice_trasposta(M1);

        System.out.println("Matrice iniziale: ");
        visualizza_matrice(M1);
        System.out.println("Matrice trasposta: ");
        visualizza_matrice(M2);

        tastiera.close();
    }

    public static int[][] riempi_matrice(int x, int y) {
        int[][] M = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                M[i][j] = (int) (Math.random() * 98) + 1;
            }
        }
        return M;
    }

    public static int[][] matrice_trasposta(int [][]M1){
        int x = M1.length;
        int y = M1[0].length;
        int [][]M2 = new int[y][x];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                M2[j][i]=M1[i][j];
            }
        }
        return M2;
    }
    public static void visualizza_matrice(int [][]M){
        for(int i = 0; i<M.length; i++){
            for(int j=0; j<M[i].length; j++){
            System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
        return;
    }
    

}
