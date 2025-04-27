import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        ContaTerminal Banco = new ContaTerminal();
        Pessoa Cliente = new Pessoa();
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o seu nome: ");
        Cliente.setNome(scanner.nextLine());

        System.out.printf("Digite sua idade: ");
        Cliente.setIdade(scanner.nextInt());
        Cliente.maioridade();

        System.out.println("Olá " + Cliente.getNome());
        System.out.println("Seu saldo é de R$" + Banco.getSaldo());

        System.out.println("Oque desejar fazer? ");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Pagar Boleto");
        System.out.println("4 - Sair");

        while (true) {
            System.out.println("Digite o valor do menu: ");
            int menu = scanner.nextInt();
            if (menu == 1) {
                System.out.println("Digite o valor do deposito: ");
                float deposito = scanner.nextFloat();
                Banco.setDeposito(deposito);
                System.out.println("Deposito realizado com sucesso!");
                System.out.println("Seu novo saldo é de R$" + (Banco.getSaldo() + Banco.getDeposito()));
            } else if (menu == 2) {
                System.out.println("Digite o valor do saque: ");
                float saque = scanner.nextFloat();
                Banco.setSaque(saque);
                System.out.println("Saque realizado com sucesso!");
                System.out.println("Seu novo saldo no banco é de R$" + (Banco.getSaldo() - Banco.getSaque()));
            } else if (menu == 3) {
                System.out.println("Digite o valor do pagamento: ");
                float pagamento = scanner.nextFloat();
                Banco.setPagamento(pagamento);
                System.out.println("Pagamento realizado com sucesso!");
                System.out.println("Seu novo saldo no banco é de R$" + (Banco.getSaldo() - Banco.getPagamento()));
            } else if (menu == 4) {
                System.out.println("Saindo...");
                break;
            }
        }
    }
}