public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        
        int nota = 6;

        if nota >= 7 {
            System.err.println("Aprovado");
        }
        else if (nota >= 5 && nota < 7) {
            System.err.println("Recuperação");
        }
        else{
            System.err.println("Reprovado");
        }
    }
}
