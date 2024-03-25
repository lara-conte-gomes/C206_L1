
public class Main {
    public static void main(String[] args) {
        //criando a conta
        Conta conta1 = new Conta();

        //colocando o nome na cliente 1
        conta1.c1.setnome("Maria");

        //colocando o cpf na cliente 1
        conta1.c1.setcpf(123456);

        System.out.println("Nome da cliente: " + conta1.c1.getnome());
        System.out.println("CPF da cliente: " + conta1.c1.getcpf());
        
        //variável para receber a quantidade de clientes
        int x = conta1.getqtdClientes();
        System.out.println("A quantidade de cliente é: " + x);

        //colocando um valor no saldo da cliente 1
        conta1.setsaldo(1000);

        //depoistando um valor na conta
        conta1.deposita(100);
        conta1.extrato();

        //sacando um valor da conta
        conta1.saca(200);

        //chamando o método para mostrar o extrato da conta
        conta1.extrato();

    }
}