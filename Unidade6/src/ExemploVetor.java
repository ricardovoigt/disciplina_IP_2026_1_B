public class ExemploVetor {
    public static void main(String[] args) {
        new ExemploVetor();    
    }
    private ExemploVetor(){
        int numeros[] = new int[5];
        getValores(numeros);
        imprimirValores(numeros);
        randomizarValores(numeros);
        imprimirValores(numeros);
    }
    private void randomizarValores(int[] numeros) {
        for (int i=0; i < numeros.length; i++){
            numeros[i] = (int)(Math.random() * 100f);
        }
    }
    private void imprimirValores(int[] numeros) {
        for (int i=0; i < numeros.length; i++){
            System.out.println("Posicao "+i+" ="+numeros[i]);
        }
    }
    private void getValores(int[] numeros) {
        numeros[0] = 3;
        numeros[1] = 1;
        numeros[2] = 5;
        numeros[3] = 7;
        numeros[4] = 9;
    }
}
