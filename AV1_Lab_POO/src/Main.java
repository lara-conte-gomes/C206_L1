import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //criando uma empresa
        Empresa e1 = new Empresa();
        e1.nome = "Amazon";
        e1.cnpj = "012345";
        e1.endereco = "Rua das Esmeraldas";
        e1.funcionariosDisponiveis = 3;

        //criando uma pessoa
        Pessoa p1 = new Pessoa();

        //Pedir para o usuário digitar algo
        Scanner pedido = new Scanner(System.in);
        Scanner nome1 = new Scanner (System.in);
        Scanner cpf1 = new Scanner(System.in);
        Scanner idade1 = new Scanner(System.in);
        Scanner num1 = new Scanner (System.in);
        Scanner n1 = new Scanner(System.in);

        System.out.println("Digite um número para realizar o controle de funcionários: ");
        int escolha = pedido.nextInt();

        if(escolha == 1){
            System.out.println("A primeira opção foi escolhida.");
            System.out.println("As informações da empresa são:");
            e1.mostraInfo();
        }
        else if(escolha == 2){
            System.out.println("Opção 2 foi escolhida.");
            System.out.println("Vamos adicionar um funcionário na empresa.");

            System.out.println("Entre com o nome do funcionário: ");
            String nome = nome1.nextLine();
            p1.nome = nome;

            System.out.println("Entre com o CPF dele: ");
            String cpf = cpf1.nextLine();
            p1.cpf = cpf;

            System.out.println("Entre com a idade: ");
            int idade = idade1.nextInt();
            p1.idade = idade;

            System.out.println("Entre com a matrícula do funcionário: ");
            int mat = pedido.nextInt();

            Funcionário f = new Funcionário(p1);

            //mostrar as informações da pessoa
            p1.mostrainfo();

            f.matricula = mat;
            e1.adicionarFuncionarios(f);

            //mostrar a matrícula do funcionário
            f.mostrainfo();

            e1.contarFuncionariosDisponiveis();
        }
        else if(escolha == 3){
            System.out.println("Opção 3 escolhida.");
            System.out.println("Digite o número do funcionário que deseja alocar: ");
            int num = num1.nextInt();
            e1.alocarFuncionario(num);
            System.out.println("Funcionários disponíveis: " + e1.funcionariosDisponiveis);
        }
        else if(escolha == 4){
            System.out.println("Opção 4 foi escolhida.");
            System.out.println("Funcionários disponíveis: ");
            System.out.println(e1.funcionariosDisponiveis);
            System.out.println("Tamanho do vetor: ");
            System.out.println(e1.f.length);
            System.out.println("A porcentagem de funcionários disponíveis são: ");
            float fDisp = e1.contarFuncionariosDisponiveis();
            System.out.println(fDisp * 100);
        }
    }
}