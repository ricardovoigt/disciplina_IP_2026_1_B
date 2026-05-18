import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ExemploData {
    public ExemploData(){
        // Data atual
        LocalDate hoje = LocalDate.now();
        System.out.println("Data de hoje: " + hoje);

        //Formatar a data
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data de hoje: " + hoje.format(formato));

        //Calcular ultimo dia de aula
        LocalDate ultimoDiaFurb = LocalDate.of(hoje.getYear(), 12, 3);

        long dias = ChronoUnit.DAYS.between(hoje, ultimoDiaFurb);

        System.out.println("Faltam " + dias + " dias para o ultimo dia de Aula!");

        // Calcular dias até o Natal
        LocalDate natal = LocalDate.of(hoje.getYear(), 12, 24);

        dias = ChronoUnit.DAYS.between(hoje, natal);
        long semana = ChronoUnit.WEEKS.between(hoje, natal);
        System.out.println("Faltam " + semana + " semanas para o Natal!");
    }
    public static void main(String[] args) {
        new ExemploData();
    }
}
