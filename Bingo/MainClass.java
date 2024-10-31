/**
 * MainClass
 */
public class MainClass {

    public static void main(String[] args) {
        int M[][] = new int[3][9];

        // Riempi tutta la cartella
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = ((int) (Math.random() * 10) + 1) + (j * 10);

            }
        }
        // Matrice 4*3 interi non ripetuti
        int[][] delete = new int[3][4];
        for (int i = 0; i < delete.length; i++) {
            for (int j = 0; j < 4; j++) {
                int num = (int) (Math.random() * 8) + 1;
                boolean ok = true;
                for (int k = 0; k < i - 1; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (delete[i][k] == num)
                            ok = false;

                        if (i == 2) {
                            if (num == delete[l][k]) {
                                ok = false;
                            }
                        }
                    }
                }
                if (ok) {
                    delete[i][j] = num;
                    M[i][delete[i][j]] = 0;
                } else
                    i--;
            }
        }

        for (int i = 0; i < delete.length; i++) {
            for (int j = 0; j < delete[i].length; j++) {
                System.out.print(delete[i][j] + "\t");
            }
            System.out.println();
        }



        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.err.print(M[i][j] + "\t ");
            }
            System.err.println();
        }

    }

}