import java.util.Scanner;

public class Correio {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bora calcular o frete?");
        System.out.println("Você pode enviar uma caixa ou um Cilindro. ");
        System.out.println("Qual o tipo de embalagem? (1 - Caixa ou 2 - Cilindro)");
        Scanner sc = new Scanner(System.in);
        int tipo = sc.nextInt();
        switch (tipo) {
            case 1:
                System.out.println("Digite a largura da caixa (cm): ");
                double largura = sc.nextDouble();
                System.out.println("Digite a altura da caixa (cm): ");
                double altura = sc.nextDouble();
                System.out.println("Digite o comprimento da caixa (cm): ");
                double comprimento = sc.nextDouble();
                System.out.println("Digite o peso da caixa: ");
                double peso = sc.nextDouble();

                double pesoCubico = (largura * altura * comprimento) / 6000;
                if (peso < 5.0) {
                    pesoCubico = peso;
                }
                if (pesoCubico <= 0.3){
                    System.out.println("Valor do frete: R$ 30,00");
                }else if (pesoCubico <= 3){
                    System.out.println("Valor do frete: R$ 100,00");
                }else{
                    System.out.println("Valor do frete: R$ 150,00");
                }
                break;
            case 2:
                System.out.println("Digite o raio do cilindro: ");
                double raio = sc.nextDouble();
                System.out.println("Digite a altura do cilindro: ");
                double alturaCilindro = sc.nextDouble();
                System.out.println("Digite o peso do cilindro: ");
                double pesoCilindro = sc.nextDouble();
                break;
            default:
                System.out.println("Tipo de embalagem inválido.");
        }
    }
}
