import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Random;


public class Ligacaoparacandidatos {
    public static void main(String[] args) {
        selecaoCandidatos();
        for (String candidato : Listadeselecionados) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
    
        do {
            atendeu = atender();
            if (atendeu) {
                System.out.println("Conseguimos contato com " + candidato + " na tentativa " + tentativasRealizadas);
            } else {
                System.out.println("Tentativa " + tentativasRealizadas + " falhou para " + candidato);
                tentativasRealizadas++;
            }
            continuarTentando = !atendeu && tentativasRealizadas <= 3;
        } while (continuarTentando);
    
        if (!atendeu) {
            System.out.println("Não conseguimos contato com " + candidato + " após 3 tentativas.");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void analisarCandidato(float salarioPretendido) {
        float salarioBase = 2000.0f;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM UMA CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    static float valorPretendido() {
        return ThreadLocalRandom.current().nextFloat(1800.0f, 2200.0f);
    }

    static ArrayList<String> Listadeselecionados = new ArrayList<>();

    static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Lucas", "João", "Maria", "Ana", "Julia", "Pedro", "Carlos", "Fernanda", "Roberta"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        float salarioBase = 2000.0f;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            float salarioPretendido = valorPretendido();

            if (salarioBase >= salarioPretendido) {
                Listadeselecionados.add(candidato);
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }  
}