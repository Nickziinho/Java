//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa homem = new Pessoa();
        homem.setNome("João");
        homem.setIdade(12);
        Pessoa mulher = new Pessoa();
        mulher.setNome("Maria");
        mulher.setIdade(10);
        System.out.println("Nome: " + homem.getNome() + ", Idade: " + homem.getIdade());
        System.out.println("Nome: " + mulher.getNome() + ", idade: " + mulher.getIdade());
    }
}