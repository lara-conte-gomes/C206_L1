public class SUV extends Carro{
    private String tracao;

    public SUV(double valor, String cor, int ano){
        super(valor, cor, ano);
    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }
}
