public abstract class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double valorLocacao;
    private double valorMulta;
    private Cliente clienteAluguel;

    public Veiculo(String marca, String modelo, String placa, int ano, double valorLocacao, double valorMulta) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valorLocacao = valorLocacao;
        this.valorMulta = valorMulta;
        this.clienteAluguel = null;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Cliente getClienteAluguel() {
        return clienteAluguel;
    }

    public void setClienteAluguel(Cliente clienteAluguel) {
        this.clienteAluguel = clienteAluguel;
    }
}
