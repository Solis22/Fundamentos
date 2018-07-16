package matrices;

public class Matrices {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4, 5},
            {1, 1, 3, 4, 5},
            {1, 2, 1, 4, 5},
            {1, 2, 3, 1, 5},
            {1, 2, 3, 4, 1}
        };
        int nDiagonal = 0;
        boolean hasAssignedNDiagonal = false;
        boolean diagonalOk = true;
        int contador = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    if (!hasAssignedNDiagonal) {
                        hasAssignedNDiagonal = true;
                        nDiagonal = matriz[i][j];
                    } else if (nDiagonal != matriz[i][j]) {
                        diagonalOk = false;
                    }
                }
                matriz[i][j] = contador++;
                System.out.println("Diagonal: " + (diagonalOk ? "ok" : "mal"));

            }

        }

    }
}

}

