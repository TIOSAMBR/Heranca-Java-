public class ContaPoupanca extends Conta {
    
    private double taxaRendimento;
    
    public ContaPoupanca(int numero, Cliente cliente, double saldo, double taxaRendimento) {
        super(numero, saldo, cliente);
        this.taxaRendimento = taxaRendimento;
    }
    
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
    
    @Override
    public void sacar(double valor) {
        if (valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso.");
    }
    
    public void calcularNovoSaldo() {
        double novoSaldo = this.getSaldo() + (this.getSaldo() * this.taxaRendimento);
        this.setSaldo(novoSaldo);
    }
}
