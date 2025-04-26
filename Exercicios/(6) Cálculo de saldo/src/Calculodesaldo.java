// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class Calculodesaldo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        float saldoInicial = scanner.nextFloat();

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        float transacao1 = scanner.nextFloat(); // Exemplo de entrada
        float transacao2 = scanner.nextFloat(); // Exemplo de entrada
        float transacao3 = scanner.nextFloat(); // Exemplo de entrada

        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        float saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;
        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}