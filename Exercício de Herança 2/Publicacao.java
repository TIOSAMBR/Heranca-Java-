import java.util.ArrayList;

public abstract class Publicacao {
    private String titulo;
    private String dataPublicacao;
    private ArrayList<Publicacao> referencias;
    private ArrayList<Autor> autores;
    private float valorMulta;

    public Publicacao(String titulo, String dataPublicacao, ArrayList<Publicacao> referencias, ArrayList<Autor> autores, float valorMulta) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.referencias = referencias;
        this.autores = autores;
        this.valorMulta = valorMulta;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public ArrayList<Publicacao> getReferencias() {
        return referencias;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public float getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(float valorMulta) {
        this.valorMulta = valorMulta;
    }
}
