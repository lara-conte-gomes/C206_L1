
public class Main {
    public static void main(String[] args) {
     Contato[] cont = new Contato[4];

        //criando o primeiro contato
        Contato p1 = new Contato();
        p1.nome = "Jorge";
        p1.email = "Jorge@gmail.com";
        p1.telefone = "111111";
        p1.dataNascimento = "15/05/1990";

        //colocando o contato 1 no vetor cont
        cont[0] = p1;

        //criando o segundo contato
        Contato p2 = new Contato();
        p2.nome = "Bianca";
        p2.email = "Bianca123@hotmail.com";
        p2.telefone = "222222";
        p2.dataNascimento = "16/08/1985";

        //colocando o contato 2 no vetor cont
        cont[1] = p2;

        //criando o terceiro contato
        Contato p3 = new Contato();
        p3.nome = "Jessica";
        p3.email = "Jess456@outlook.com";
        p3.telefone = "333333";
        p3.dataNascimento = "08/11/1999";

        //colocando o contato 3 no vetor cont
        cont[2] = p3;

        //criando a empresa
        Empresa emp = new Empresa();
        emp.cnpj = "10987689";
        emp.endereco = "Rua das Esmeraldas";

        //colocando os contatos na empresa
        emp.contatos = cont;

        //chamando o método exibirinfos
        emp.exibirinfos();
    }
}