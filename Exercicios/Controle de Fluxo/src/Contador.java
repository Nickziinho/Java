import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        contar(parametroUm, parametroDois, terminal);

        terminal.close();

        }
    
    static void contar(int parametroUm, int parametroDois, Scanner terminal) {
        while (parametroUm > parametroDois) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
            System.out.println("Digite o primeiro parâmetro:");
            parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro:");
            parametroDois = terminal.nextInt();
        }
        for (int i = parametroUm; i <= parametroDois; i++)
            if (i == parametroDois) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
    }
}
