import java.util.ArrayList;
import java.util.List;

public class Empresa extends Cliente {
    private String cnpj;
    private List<Veiculo> veiculosAlugados;

    public Empresa(String nome, String cnpj, String endereco,String telefone) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
        this.veiculosAlugados = new ArrayList<>();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Veiculo> getVeiculosAlugados() {
        return (ArrayList<Veiculo>) veiculosAlugados;
    }

    public void realizarEmprestimo(Veiculo veiculo) {
        veiculosAlugados.add(veiculo);
    }

    public void finalizarEmprestimo(Veiculo veiculo) {
        veiculosAlugados.remove(veiculo);
    }

    @Override
    public void finalizarEmprestimo() {
    }

    
}
