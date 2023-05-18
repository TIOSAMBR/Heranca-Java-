import java.util.ArrayList;

public class PessoaFisica extends Cliente {
    private String cpf;
    private Veiculo veiculoAlugado;

    public PessoaFisica(String nome, String telefone, String endereco, String cpf) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Veiculo getVeiculoAlugado() {
        return veiculoAlugado;
    }

    public void realizarEmprestimo(Veiculo veiculo) {
        this.veiculoAlugado = veiculo;
    }

    public void finalizarEmprestimo() {
        this.veiculoAlugado = null;
    }

    public ArrayList<Veiculo> getVeiculosAlugados() {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        if (veiculoAlugado != null) {
            veiculos.add(veiculoAlugado);
        }
        return veiculos;
    }
}
