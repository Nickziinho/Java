public class SingletonLazy {
    //atributo
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

    public void exibirMensagem() {
        System.out.println("Mensagem do método exibirMensagem");
    }

    public static void main(String[] args) {
        SingletonLazy singleton = SingletonLazy.getInstancia();
        singleton.exibirMensagem();
    }
}
