import java.util.Scanner;
public class CalculadoraFurb {
    Scanner sc = new Scanner(System.in);
    double numero1, numero2, resultado;
    public CalculadoraFurb(){
        //Construtor
        System.out.println("Bem vindo a Calculadora Furb");        
        executar();
    }
    private void executar() {
        informarValores();
        escolherOpcao();
        exibirResultado();
        continuar();
    }
    private void continuar() {
        System.out.println("Deseja continuar?"); 
        System.out.println("1 - Sim"); 
        System.out.println("0 - Não"); 
        int opcaoFinal = sc.nextInt();
        if (opcaoFinal == 1){
            executar();
        }else{
            System.out.println("Obrigado por usar a Calculadora Furb");
            sc.close();
        }        
    }
    private void informarValores() {
        System.out.println("Digite o primeiro numero decimal");
        numero1 = sc.nextDouble();
        System.out.println("Digite o segundo numero decimal");
        numero2 = sc.nextDouble();
    }
    private void escolherOpcao() {
        System.out.println("Escolha uma opção");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                somar(numero1, numero2);
                break;
            case 2:
                subtrair(numero1, numero2);
                break;
            case 3:
                multiplicar(numero1, numero2);
                break;
            case 4:
                dividir(numero1, numero2);
                break;        
            default:
                System.out.println("Opção inválida");
                escolherOpcao();
                break;
        }
    }
    private void exibirResultado() {
        System.out.println("O resultado é: " + resultado);
    }
    private void dividir(double numero1, double numero2) {
        if (numero2 > 0){
            resultado = numero1 / numero2;
        }else{
            resultado = 0;
        }
    }
    private void multiplicar(double numero1, double numero2) {
        resultado = numero1 * numero2;
    }
    private void subtrair(double numero1, double numero2) {
        resultado = numero1 - numero2;
    }
    private void somar(double numero1, double numero2) {
        resultado = numero1 + numero2;
    }
    public static void main(String[] args) {
        new CalculadoraFurb();
    }
}