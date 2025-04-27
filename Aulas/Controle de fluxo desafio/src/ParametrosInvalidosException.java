import java.util.Scanner;

public class ParametrosInvalidosException {
    public static void main(String[] args) throws Exception {
        Contador contador = new Contador();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = scanner.nextInt();

        contador.contar(parametroUm, parametroDois);
        System.out.println("Contagem concluída com sucesso.");
        scanner.close();
    }
}
