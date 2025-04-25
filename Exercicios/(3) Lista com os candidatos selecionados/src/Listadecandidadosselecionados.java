import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class Listadecandidadosselecionados {
    
    public static void main(String[] args) {
        selecaoCandidatos();
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
            System.out.println("Candidato: " + candidato + " - Salário Pretendido: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                Listadeselecionados.add(candidato);
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
        for (int i = 0; i < Listadeselecionados.size() ; i++) {
            System.out.println("O candidato de número N°" + (i+1) + " é " + Listadeselecionados.get(i));
        }
        if (Listadeselecionados.size() < 5) {
            System.out.println("NUMERO DE VAGAS DISPONIVEIS É 5 MAS HOUVE APENAS " + Listadeselecionados.size() + " CANDIDATOS SELECIONADOS");
        }
        
    }  
}