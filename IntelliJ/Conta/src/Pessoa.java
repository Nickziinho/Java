public class Pessoa {
    private String nome;
    private int idade;

    public String getNome(){
        return nome.toUpperCase();
    }
    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void maioridade(){
        if (idade >= 18){
            //Só preicso que o programa continue a rodar se caso o usuário seja maior de idade
        } else {
            System.out.println("Você não é maior de idade, não pode acessar o sistema.");
            System.exit(0);
        }
    }
}
