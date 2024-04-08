public class Hatch extends Carro{
    private int portas;

    public Hatch(double valor, String cor, int ano){
        super(valor, cor, ano);
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getPortas(){
        return portas;
    }
}
