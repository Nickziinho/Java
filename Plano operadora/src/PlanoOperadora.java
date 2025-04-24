import java.util.Scanner;
public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o plano: B, M ou T");
        String plano = scanner.nextLine().toUpperCase();

        if(plano.equals("B")) {
            System.out.println("100 minutos de ligação");
        } else if(plano.equals("M")) {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Intagram grátis");
        } else if(plano.equals("T")) {
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Intagram grátis");
            System.out.println("5Gb Youtube");
        }
    }
}