
public class Main {
    public static void main(String[] args) {
     Fornecedor[] f = new Fornecedor[4];

        //criando o primeiro fornecedor
        Fornecedor f1 = new Fornecedor();
        f1.tipo = "Comida";
        f1.quantidade = 100;

        //colocando o primeiro fornecedor no vetor
        f[0] = f1;

        //criando o segunfo fornecedor
        Fornecedor f2 = new Fornecedor();
        f2.tipo = "Equipamento";
        f2.quantidade = 50;

        //colocando o segundo fornecedor no vetor
        f[1] = f2;

        //criando o restaurante
        Restaurante r = new Restaurante();
        r.cnpj = "123456":
        r.endereco = "Rua Principal";
        r.nome = "Restaurante comida boa";

        //colocando os fornecedores no restaurante
        r.fornecedor = f;

        //chamar o método exibirinfos
        r.exibirinfos();
    }
}