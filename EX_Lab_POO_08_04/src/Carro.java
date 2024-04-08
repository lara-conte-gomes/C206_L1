public abstract class Carro implements Controle{
    private double valor;
    private String cor;
    private int ano;

    public Carro(double valor, String cor, int ano){
        this.valor = valor;
        this.cor = cor;
        this.ano =ano;
    }

    @Override
    public void taxa(){
        System.out.println("A taxa do carro é: 5% ");
    }

    @Override
    public void mostrainfo(){
        System.out.println("Valor do carro: " + this.valor);
        System.out.println("Cor do carro: " + this.cor);
        System.out.println("Ano do carro: " + this.ano);
    }
}
