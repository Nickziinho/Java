import java.util.Scanner;
public class SistemadeMedida {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sigla da medida: ");
        String sigla = scanner.nextLine();
        sigla = sigla.toUpperCase(); // Converte a sigla para maiúscula
        scanner.close();

        if (sigla.equals("P")) {
            System.err.println("PEQUENO");           
        }
        else if (sigla.equals("M")){
            System.err.println("MÉDIO");
        }
        else if (sigla.equals("G")){
            System.err.println("GRANDE");
        }
        else {
            System.err.println("SIGLA INVÁLIDA");
        }
    }
}
