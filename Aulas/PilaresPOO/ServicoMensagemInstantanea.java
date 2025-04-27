package PilaresPOO;

public class ServicoMensagemInstantanea {
    public void enviarMensagem() {
        //primeiro validar se está conectado a internet
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        //depois de enviar a mensagem, salvar o histórico
        salvarHistóricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    //métodos privados, visiveis somente na classe
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistóricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
