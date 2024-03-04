
public class Main {

    public static void main(String[] args) {

        Produtos p1 = new Produtos();
        p1.codigoSerie = 1234;
        p1.codigoProduto = "2345";
        p1.nome = "Café";
        p1.categoria = "Bebidas";
        p1.quantidade = 20;

        p1.mostraInfo();

        Produtos p2 = new Produtos();
        p2.codigoSerie = 5678;
        p2.codigoProduto = "89012";
        p2.nome = "Macarrão";
        p2.categoria = "Massas";
        p2.quantidade = 30;

        p2.mostraInfo();
    }

}