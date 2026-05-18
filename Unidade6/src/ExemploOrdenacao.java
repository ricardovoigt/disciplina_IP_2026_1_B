import java.util.Arrays;
import java.util.Collections;

public class ExemploOrdenacao {
    public static void main(String[] args) {
        new ExemploOrdenacao();
    }
    private ExemploOrdenacao() {
        int[] numeros = {5, 3, 8, 1, 2};
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Troca
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
    }


    
}
