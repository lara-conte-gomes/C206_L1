public class Camiseta extends Produto{
    private String cor;
    private String tamanho;

    public Camiseta(String nome, double preco, String cor, String tamanho){
        this.setnome(nome);
        this.setpreco(preco);
        this.setcor(cor);
        this.settamanho(tamanho);
    }
    public void setcor(String cor) {
        this.cor = cor;
    }

    public void settamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void etiquetaPreco(){
        super.etiquetaPreco();
        System.out.println("Cor da camiseta é: " + this.cor);
        System.out.println("O tamanho é: " + this.tamanho);
    }
}
