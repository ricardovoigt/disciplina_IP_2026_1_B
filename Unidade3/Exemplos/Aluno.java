public class Aluno {
    String nome;
    int numeroDeMatricula;
    char sexo;
    final int numeroDaEscola = 12345;
    int anoNascimento = 2020, mesNascimento, diaNascimento;


    public Aluno(){
        estudar();
    }

    public int informarNumeroDeMatricula(){
        return this.numeroDeMatricula;
    }
    public void estudar(){
        System.out.println("Estudando");
    }

    public static void main(String[] args) {
        new Aluno();
    }
}
