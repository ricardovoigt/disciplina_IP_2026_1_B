public class MatrizExemplo {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];



        
        // Preenchendo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
            }
        }

        // Exibindo a matriz como tabuleiro
        System.out.println("Matriz como tabuleiro:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // quebra de linha
        }
    }
}
