import java.time.LocalDate;

public class Emprestimo {
    private Publicacao publicacao;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoReal;
    private int numRenovacoes;

    public Emprestimo(Publicacao publicacao, Usuario usuario, LocalDate dataEmprestimo) {
        this.publicacao = publicacao;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataEmprestimo.plusDays(7);
        this.numRenovacoes = 0;
    }

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public LocalDate getDataDevolucaoReal() {
        return dataDevolucaoReal;
    }

    public int getNumRenovacoes() {
        return numRenovacoes;
    }

    public void renovar() {
        if (numRenovacoes < 3) {
            dataDevolucaoPrevista = dataDevolucaoPrevista.plusDays(7);
            numRenovacoes++;
        } else {
            throw new IllegalStateException("Não é possível renovar este empréstimo mais do que 3 vezes.");
        }
    }

    public void devolver(LocalDate dataDevolucaoReal) {
        this.dataDevolucaoReal = dataDevolucaoReal;
    }

    public int calcularMulta() {
        int diasAtraso = (int) Math.max(0, dataDevolucaoReal.toEpochDay() - dataDevolucaoPrevista.toEpochDay());
        float valorMulta = publicacao.getValorMulta();
        return (int) (diasAtraso * valorMulta);
    }
}
