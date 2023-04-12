public abstract class Conta {
    private int numero;
    private double saldo;
    protected static Cliente cliente;

    public Conta(int numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
       
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public void transferir(double valor, ContaEmpresarial contaEmpresarial) {
        double saldoAtual = contaEmpresarial.getSaldo();
        if (valor <= saldoAtual) {
            contaEmpresarial.setSaldo(saldoAtual - valor);
            depositar(valor);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
