import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private String nome;
    private String endereco;
    private String telefone;
    private List<Veiculo> carrosDisponiveis;
    private List<PessoaFisica> clientesPessoaFisica;
    private List<Empresa> clientesEmpresa;

    public Locadora(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.carrosDisponiveis = new ArrayList<>();
        this.clientesPessoaFisica = new ArrayList<>();
        this.clientesEmpresa = new ArrayList<>();
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        carrosDisponiveis.add(veiculo);
    }

    public void cadastrarClientePessoaFisica(PessoaFisica cliente) {
        clientesPessoaFisica.add(cliente);
    }

    public void cadastrarClienteEmpresa(Empresa cliente) {
        clientesEmpresa.add(cliente);
    }

    public void realizarEmprestimoPessoaFisica(PessoaFisica cliente, Veiculo veiculo) throws EmprestimoException {
        if (!clientesPessoaFisica.contains(cliente)) {
            throw new EmprestimoException("Cliente pessoa física não cadastrado.");
        }

        if (!carrosDisponiveis.contains(veiculo)) {
            throw new EmprestimoException("O veículo não está disponível para locação.");
        }

        if (cliente.getVeiculoAlugado() != null) {
            throw new EmprestimoException("A pessoa física já possui um veículo alugado.");
        }

        if (veiculo.getClienteAluguel() != null) {
            throw new EmprestimoException("O veículo já está alugado para outro cliente.");
        }

        cliente.realizarEmprestimo(veiculo);
        veiculo.setClienteAluguel(cliente);
        carrosDisponiveis.remove(veiculo);
    }

    public void realizarEmprestimoEmpresa(Empresa cliente, Veiculo veiculo) throws EmprestimoException {
        if (!clientesEmpresa.contains(cliente)) {
            throw new EmprestimoException("Cliente empresa não cadastrado.");
        }

        if (!carrosDisponiveis.contains(veiculo)) {
            throw new EmprestimoException("O veículo não está disponível para locação.");
        }

        if (cliente.getVeiculosAlugados().contains(veiculo)) {
            throw new EmprestimoException("A empresa já possui o veículo alugado.");
        }

        if (veiculo.getClienteAluguel() != null) {
            throw new EmprestimoException("O veículo já está alugado para outro cliente.");
        }

        cliente.realizarEmprestimo(veiculo);
        veiculo.setClienteAluguel(cliente);
        carrosDisponiveis.remove(veiculo);
    }

    public void finalizarEmprestimoPessoaFisica(PessoaFisica cliente) throws EmprestimoException {
        if (!clientesPessoaFisica.contains(cliente)) {
            throw new EmprestimoException("Cliente pessoa física não cadastrado.");
        }

        if (cliente.getVeiculoAlugado() == null) {
            throw new EmprestimoException("A pessoa física não possui um veículo alugado.");
        }

        Veiculo veiculo = cliente.getVeiculoAlugado();
        cliente.finalizarEmprestimo();
        veiculo.setClienteAluguel(null);
        carrosDisponiveis.add(veiculo);
    }

    public void finalizarEmprestimoEmpresa(Empresa cliente, Veiculo veiculo) throws EmprestimoException {
        if (!clientesEmpresa.contains(cliente)) {
            throw new EmprestimoException("Cliente empresa não cadastrado.");
        }

        if (!cliente.getVeiculosAlugados().contains(veiculo)) {
            throw new EmprestimoException("A empresa não possui o veículo alugado.");
        }

        cliente.finalizarEmprestimo(veiculo);
        veiculo.setClienteAluguel(null);
        carrosDisponiveis.add(veiculo);
    }

    public double calcularValorTotalAluguel(Veiculo veiculo, int numRenovacoes) {
        double valorAluguel = veiculo.getValorLocacao();
        double multa = 0.0;

        if (veiculo instanceof CarroPopular) {
            int renovacoesGratuitas = 1;
            int renovacoesExcedentes = Math.max(0, numRenovacoes - renovacoesGratuitas);
            multa = renovacoesExcedentes * veiculo.getValorMulta();
        } else if (veiculo instanceof SUV) {
            int renovacoesGratuitas = 3;
            int renovacoesExcedentes = Math.max(0, numRenovacoes - renovacoesGratuitas);
            multa = renovacoesExcedentes * veiculo.getValorMulta();
        } else if (veiculo instanceof CarroLuxo) {
            int renovacoesGratuitas = 5;
            int renovacoesExcedentes = Math.max(0, numRenovacoes - renovacoesGratuitas);
            multa = renovacoesExcedentes * veiculo.getValorMulta();
        }

        return valorAluguel + multa;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Veiculo> getCarrosDisponiveis() {
        return carrosDisponiveis;
    }

    public List<PessoaFisica> getClientesPessoaFisica() {
        return clientesPessoaFisica;
    }

    public List<Empresa> getClientesEmpresa() {
        return clientesEmpresa;
    }

    public Veiculo buscarVeiculoPorPlaca(String placa) {
        return null;
    }
}
