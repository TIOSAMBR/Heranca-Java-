public class Multa {
    private double valorPorDia;
    private Publicacao publicacao;
    private int diasAtraso;

    public Multa(double valorPorDia, Publicacao publicacao, int diasAtraso) {
        this.valorPorDia = valorPorDia;
        this.publicacao = publicacao;
        this.diasAtraso = diasAtraso;
    }

    public double getValor() {
        return valorPorDia * diasAtraso;
    }

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }
}
