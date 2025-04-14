import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        ContaTerminal ContaTerminal = new ContaTerminal();

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();
        
        while (true) {
            System.out.println("Por favor, digite o número da agência:");
            String agencia = scanner.nextLine();
            if (agencia.length() == 4 && agencia.matches("\\d{4}")) {
                ContaTerminal.agencia = agencia;
                break;
            } 
            else {
                System.out.println("Número da agência inválido. Tente novamente.");
            }
        }

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        ContaTerminal.numero = numero;

        System.out.println("Por favor, digite o saldo da conta:");
        float saldo = scanner.nextFloat();
        ContaTerminal.saldo = saldo;

        scanner.close();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "+ ContaTerminal.agencia + ", conta " + ContaTerminal.numero + " e seu saldo " + ContaTerminal.saldo + " já está disponível para saque.");
    }
}
