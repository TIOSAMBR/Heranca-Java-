import java.util.ArrayList;

public class Tese extends Publicacao {
    private String resumo;
    private String orientador;
    private String instituicao;

    public Tese(String titulo, String dataPublicacao, ArrayList<Publicacao> referencias, ArrayList<Autor> autores, float valorMulta,
                String resumo, String orientador, String instituicao) {
        super(titulo, dataPublicacao, referencias, autores, valorMulta);
        this.resumo = resumo;
        this.orientador = orientador;
        this.instituicao = instituicao;
    }

    public String getResumo() {
        return resumo;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
}
