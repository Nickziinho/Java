public class ContaTerminal {

    private float deposito;
    private float saque;
    private float pagamento;
    private float saldo = 9442.23f;

    public float getDeposito() {
        return deposito;
    }
    public float getSaque(){
        return saque;
    }
    public float getPagamento(){
        return pagamento;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }
    public void setSaque(float saque){
        this.saque = saque;
    }
    public void setPagamento(float pagamento){
        this.pagamento = pagamento;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
}