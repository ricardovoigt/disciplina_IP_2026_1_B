public class Exemplos {
    public static void main(String[] args) {
        System.out.println("Pascoa chegando, muitos chocolates!");
        System.out.println("Vamos fazer um treino?");
        System.out.println("Vamos fazer flexões e abdominais!");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Flexão número: " + i);
        }
        System.out.println("Flexões acabaram!");
        System.out.println("Agora vamos fazer abdominais!");   
        for (int i = 10; i >= 0; i--) {
            System.out.println("Abdominal número: " + i);
        }
        System.out.println("Abdominais acabaram!");
        System.out.println("Chega de treino, bora jogar um pouco!");
        int vidas = 3;
        while(vidas > 0) {
            System.out.println("Você ainda tem " + vidas + " vidas.");
            vidas--;
        }
        System.out.println("Você não tem mais vidas.");
    }

}
