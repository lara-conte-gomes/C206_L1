public class Produto {
    private String nome;
    private double preco;

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setpreco(double preco) {
        this.preco = preco;
    }

    public void etiquetaPreco(){
        System.out.println("O nome do produto é: " + this.nome);
        System.out.println("O preço é: " + this.preco);
    }
}
