import java.util.Scanner;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        float salariobase = 2000.0f;
        Scanner scanner = new Scanner(System.in);
        Float entrada = 0f;
        
        System.out.println("Qual sua pretenção salarial?");
        while (!scanner.hasNextFloat()) {
            System.out.println("Preciso que digite apenas números");
            scanner.next();
        }
        entrada = scanner.nextFloat();

        if (entrada < salariobase) {
            System.out.println("LIGAR PARA O CANDIDATO");
            
        }
        else if (entrada == salariobase) {
            System.out.println("LIGAR PARA O CONDADIDATO COM CONTRA PROPOSTA");    
        } 
        else {
            System.out.println("AGUARDANDO RESULTADO DE DEMAIS CANDIDATOS");
        }
    }   
}

