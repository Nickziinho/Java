import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        ContaTerminal ContaTerminal = new ContaTerminal();

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();
        ContaTerminal.nomeCliente = nomeCliente;
        
        while (true) {
            System.out.println("Por favor, digite o número da agência:");
            String agencia = scanner.nextLine();
            // Verifica se a agência tem 4 dígitos e se são números
            // Se sim, atribui à variável agencia da classe ContaTerminal
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

        System.out.println("Olá " + ContaTerminal.nomeCliente.toUpperCase() + " obrigado por criar uma conta em nosso banco, sua agência é " + String.format("%s-%s", ContaTerminal.agencia.substring(0, 3), ContaTerminal.agencia.charAt(3)) + ", conta " + ContaTerminal.numero + " e seu saldo R$" + String.format("%.2f" ,ContaTerminal.saldo) + " já está disponível para saque.");
        /*O que tá acontecendo aqui:
        %s → é um placeholder pra string
        
        String.format() vai substituir cada %s pelos argumentos que vêm depois
        
        Ou seja:
        
        Primeiro %s → substring(0, 3) = os três primeiros dígitos
        
        Segundo %s → charAt(3) = o último dígito
        
        UpperCase() → transforma a string em maiúscula
        
        String.format("%.2f" ,ContaTerminal.saldo) → formata o saldo com duas casas decimais
        */
    }
}
