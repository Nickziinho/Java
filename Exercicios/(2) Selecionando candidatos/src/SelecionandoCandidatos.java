import java.util.concurrent.ThreadLocalRandom;

public class SelecionandoCandidatos {

    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Lucas", "João", "Maria", "Ana", "Julia", "Pedro", "Carlos", "Fernanda", "Roberta"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        float salarioBase = 2000.0f;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            float salarioPretendido = valorPretendido();

            System.out.println("Candidato: " + candidato + " - Salário Pretendido: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("Candidato Selecionado: " + candidato);
                candidatosSelecionados++;
            } else {
                System.out.println("Candidato Rejeitado: " + candidato);
            }

            candidatosAtual++;
        }
    }

    static float valorPretendido() {
        return ThreadLocalRandom.current().nextFloat(1800.0f, 2200.0f);
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
}