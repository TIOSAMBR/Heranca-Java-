public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(int numero, double saldo, Cliente cliente, double limite) {
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
        if (valor <= getSaldo() + limite) {
            setSaldo(getSaldo() - valor);
        }
        
    }

    @Override
    public String toString() {
        return "Conta Especial - " + super.toString() + " - Limite: " + limite;
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso.");
    }
}
