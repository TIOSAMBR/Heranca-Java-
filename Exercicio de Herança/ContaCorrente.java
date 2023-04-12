public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, double saldo, Cliente cliente, double limite) {
        super(numero, saldo, cliente);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        double saldoComLimite = getSaldo() + limite;
        if (valor <= saldoComLimite) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso.");
    }
}
