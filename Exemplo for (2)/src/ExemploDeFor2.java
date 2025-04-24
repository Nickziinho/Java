public class ExemploDeFor2 {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
        int indice = 1;

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice: " + indice + " é " + alunos[x]);
            indice++;
        }
    }
    }