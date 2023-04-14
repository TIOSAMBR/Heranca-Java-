import java.util.ArrayList;

public class Livro extends Publicacao {
    private String editora;
    private Autor autor;
    private boolean disponivel;

    public Livro(String titulo, String dataPublicacao, ArrayList<Publicacao> referencias, ArrayList<Autor> autores, float valorMulta,
                 String editora, Autor autor, boolean disponivel) {
        super(titulo, dataPublicacao, referencias, autores, valorMulta);
        this.editora = editora;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public String getEditora() {
        return editora;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
