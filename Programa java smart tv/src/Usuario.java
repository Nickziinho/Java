import java.util.Scanner;
public class Usuario {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // A classe Scanner foi criada para ler o canal desejado pelo usuário
        SmartTv smartTv = new SmartTv();
        // Criação de um objeto SmartTv
        
        System.out.println("Digite o canal desejado: ");
        int canal = scanner.nextInt();
        smartTv.canal = canal;
        // Aqui o usuário digita o canal desejado
        // O canal digitado pelo usuário é atribuído ao atributo canal da classe SmartTv
        // O atributo canal da classe SmartTv é um inteiro
        
        // Atributos da classe SmartTv
        // Aqui são imprimidos os atributos da classe SmartTv
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
        System.out.println("_______________________________");
        if (smartTv.ligada == false) {
            System.out.println("TV Ligada? " + smartTv.ligada);
        }
        System.out.println("_______________________________");
        // Ligando a TV
        smartTv.ligar();
        // Atributos da classe SmartTv
        // Aqui são imprimidos os atributos da classe SmartTv
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        // Diminuindo o volume da TV em 3 unidades
        smartTv.mudarCanal(canal);
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("_______________________________");
        // Aumentando o volume
    }
}
