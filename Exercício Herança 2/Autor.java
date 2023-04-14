import java.util.ArrayList;

public class Autor {
    private String nome;
    private String titulacao;
    private String instituicao;
    private ArrayList<Publicacao> publicacoes;

    public Autor(String nome, String titulacao, String instituicao) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.instituicao = instituicao;
        this.publicacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public ArrayList<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }
}
