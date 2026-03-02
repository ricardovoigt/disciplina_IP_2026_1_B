import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        escreverNaTela();
        escreverNaTela();
        escrevaUmTextoNaTela("Novo texto");
        escrevaUmTextoNaTela("Semana que vem é feriado");
        somarDoisNumeros(10, 5);
        somarDoisNumeros(-10, -5);
        int resultado = multiplicarDoisNumeros(2, 4);
        escrevaUmTextoNaTela(""+resultado);
        double resultadoDivisao = dividirDoisNumeros(3, 7);
        escreverFormatado(resultadoDivisao);
    }
    private static void escreverFormatado(double resultadoDivisao) {
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(resultadoDivisao));
    }
    private static void escrevaUmTextoNaTela(String texto) {
        System.out.println(texto);
    }
    public static void escreverNaTela(){
        System.out.println("Escrevendo na tela");
    }
    public static void somarDoisNumeros(int a, int b){
        int soma = a + b;
        System.out.println(soma);
    }

    public static int multiplicarDoisNumeros(int a, int b){
        return a * b;
    }

    public static double dividirDoisNumeros(double a, double b){
        return a / b;
    }

}
