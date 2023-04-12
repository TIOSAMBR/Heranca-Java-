public class ContaEmpresarial extends Conta {

    public ContaEmpresarial(Cliente titular, int numero, double saldo) {
        super(numero, saldo, cliente);
    }

    @Override
    public void sacar(double valor) {
        double saldoAtual = this.getSaldo();
        if (valor <= saldoAtual) {
            this.setSaldo(saldoAtual - valor);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double valor) {
        double saldoAtual = this.getSaldo();
        this.setSaldo(saldoAtual + valor);
        System.out.println("Depósito realizado com sucesso!");
    }
}
