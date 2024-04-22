
public class Main {
    public static void main(String[] args) {
        Conta c = new Conta();

        c.setNumero(123);
        c.setNome("Luisa");
        c.setLimite(5000);

        System.out.println("Nome da dona da conta: " + c.getNome());
        System.out.println("Número da conta: " + c.getNumero());

        c.depositar(9000);

        System.out.println("Saldo da conta: " + c.getSaldo());
        System.out.println("Limite da conta: " + c.getLimite());

        try{
            c.sacar(20000);
        }
        catch(SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }
}