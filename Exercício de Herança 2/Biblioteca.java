import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private String endereco;
    private List<Livro> livros;
    private List<Artigo> artigos;
    private List<Tese> teses;

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.livros = new ArrayList<>();
        this.artigos = new ArrayList<>();
        this.teses = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Artigo> getArtigos() {
        return artigos;
    }

    public List<Tese> getTeses() {
        return teses;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
    
    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }
    
    public void adicionarArtigo(Artigo artigo) {
        artigos.add(artigo);
    }
    
    public void removerArtigo(Artigo artigo) {
        artigos.remove(artigo);
    }
    
    public void adicionarTese(Tese tese) {
        teses.add(tese);
    }
    
    public void removerTese(Tese tese) {
        teses.remove(tese);
    }

    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
        } else {
            throw new IllegalStateException("Livro já foi emprestado.");
        }
    }
    
    public void devolverLivro(Livro livro) {
        if (!livro.isDisponivel()) {
            livro.setDisponivel(true);
        } else {
            throw new IllegalStateException("Livro já foi devolvido.");
        }
    }
    
    

    }

