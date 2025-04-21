package mates;

public class CalculadoraDistancias {

    public static int calcularDistancia(String s1, String s2) {
        int n = s2.length() + 1;
        int m = s1.length() + 1;

        int[][] matriz = new int[n][m];

        // Inicializamos matriz
        for (int i = 0; i < n; i++) {
            matriz[i][0] = i;
        }

        for (int j = 0; j < m; j++) {
            matriz[0][j] = j;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                // Si son iguales
                if (s2.charAt(i - 1) == s1.charAt(j - 1)) {
                    matriz[i][j] = matriz[i-1][j-1]; // No necesitamos edición (copiamos la diagonal)
                } else {
                    // Si no, la proxima será...
                    matriz[i][j] = Math.min( // Mínimo entre :
                        Math.min(
                            matriz[i-1][j], // Anterior
                            matriz[i][j-1] // Arriba
                        ),
                        matriz[i-1][j-1] // Diagonal
                    ) + 1;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // EL ultimo valor de la matriz (abajo derecha) es el resultado
        int distanciaMinima = matriz[n - 1][m - 1];

        return distanciaMinima;
    }

}