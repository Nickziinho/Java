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
}
