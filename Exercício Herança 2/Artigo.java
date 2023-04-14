import java.util.ArrayList;

public class Artigo extends Publicacao {
    private String resumo;
    private ArrayList<String> palavrasChave;
    private String revista;

    public Artigo(String titulo, String dataPublicacao, ArrayList<Publicacao> referencias, ArrayList<Autor> autores, float valorMulta,
                  String resumo, ArrayList<String> palavrasChave, String revista) {
        super(titulo, dataPublicacao, referencias, autores, valorMulta);
        this.resumo = resumo;
        this.palavrasChave = palavrasChave;
        this.revista = revista;
    }

    public String getResumo() {
        return resumo;
    }

    public ArrayList<String> getPalavrasChave() {
        return palavrasChave;
    }

    public void setPalavrasChave(ArrayList<String> palavrasChave) {
        this.palavrasChave = palavrasChave;
    }

    public String getRevista() {
        return revista;
    }

    public void setRevista(String revista) {
        this.revista = revista;
    }
}
