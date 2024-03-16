
public class Main {
    public static void main(String[] args) {
        //criando a empresa
        Empresa emp = new Empresa();
        emp.cnpj = "10987689";
        emp.endereco = "Rua das Esmeraldas";

       //criando o primeiro contato
        emp.contatos[0] = new Contato();
        emp.contatos[0].nome = "Jorge";
        emp.contatos[0].email = "Jorge@gmail.com";
        emp.contatos[0].telefone = "111111";
        emp.contatos[0].dataNascimento = "15/05/1990";

       //criando o segundo contato
       emp.contatos[1] = new Contato();
       emp.contatos[1] .nome = "Bianca";
       emp.contatos[1] .email = "Bianca123@hotmail.com";
       emp.contatos[1] .telefone = "222222";
       emp.contatos[1] .dataNascimento = "16/08/1985";

       //criando o terceiro contato
       emp.contatos[2] = new Contato();
       emp.contatos[2] .nome = "Jessica";
       emp.contatos[2] .email = "Jess456@outlook.com";
       emp.contatos[2] .telefone = "333333";
       emp.contatos[2] .dataNascimento = "08/11/1999";

       //chamando o método exibirinfos
        emp.exibirinfos();
    }
}