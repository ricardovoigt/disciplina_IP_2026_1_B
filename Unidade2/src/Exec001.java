import java.util.Scanner;

public class Exec001 {
    //Problema 1: considerando que um professor tem 3 notas de um aluno, calcule a média do aluno.​
    //Entradas: tres notas (n1,n2,n3) e nome
    //Saida: Media das Notas
    //Processo: media = (n1 + n2 + n3) / 3
    //Testes simulados:
    //T1 > (9 + 9 + 9 / 3) = 9
    //T2 > (9 + 4 + 5 / 3) = 6
    //T3 > (8 + 9 + 7 / 3) = 8

    public static void main(String[] args) {
        System.out.println("Olá");
        System.err.println("Mensagem aqui");

        Scanner teclado = new Scanner(System.in);
        //input das notas pelo usuario
        float n1 = teclado.nextFloat();
        float n2 = teclado.nextFloat();
        float n3 = teclado.nextFloat();

        float media = (n1+n2+n3) / 3;

        System.out.println(media);

        teclado.close();
    }
}
