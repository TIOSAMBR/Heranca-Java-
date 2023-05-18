public class CarroLuxo extends Veiculo {
    private int quantidadeAirbags;
    private int tamanhoPortaMalas;
    private boolean gpsIntegrado;

    public CarroLuxo(String marca, String modelo, String placa, int ano, double valorLocacao, double valorMulta,
                     int quantidadeAirbags, int tamanhoPortaMalas, boolean gpsIntegrado) {
        super(marca, modelo, placa, ano, valorLocacao, valorMulta);
        this.quantidadeAirbags = quantidadeAirbags;
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.gpsIntegrado = gpsIntegrado;
    }

    public int getQuantidadeAirbags() {
        return quantidadeAirbags;
    }

    public void setQuantidadeAirbags(int quantidadeAirbags) {
        this.quantidadeAirbags = quantidadeAirbags;
    }

    public int getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(int tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    public boolean hasGpsIntegrado() {
        return gpsIntegrado;
    }

    public void setGpsIntegrado(boolean gpsIntegrado) {
        this.gpsIntegrado = gpsIntegrado;
    }
}
