public class ExercicioFuncao {
    public static void main(String[] args) {
        ExercicioFuncao obj 
        = new ExercicioFuncao();
        int resultado = obj.multiplicar(2, 3, 5);
        System.out.println("Resultado: " 
                                + resultado);
    }

    private int multiplicar(int num1, 
                            int num2, 
                            int num3){
        return num1 * num2 * num3;
    }
}
