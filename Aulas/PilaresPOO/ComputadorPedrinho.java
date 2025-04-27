package PilaresPOO;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //Abrindo o MSN Messenger
        System.out.println("-------------------------");
        System.out.println("MSN Messenger");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();
        //msn.validarConectadoInternet(); não pode ser acessado fora da classe
        //msn.salvarHistóricoMensagem(); não pode ser acessado fora da classe
        System.out.println("------------------------");
        System.out.println("Facebook Messenger");
        FacebookMessenger facebook = new FacebookMessenger();
        facebook.enviarMensagem();
        facebook.receberMensagem();
        System.out.println("------------------------");
        System.out.println("Telegram");
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
        System.out.println("------------------------");
    }
}
