public class Sedan extends Carro{
    private int portaMalas;

    public Sedan(double valor, String cor, int ano){
        super(valor, cor, ano);
    }

    public int getPortaMalas() {
        return portaMalas;
    }

    public void setPortaMalas(int portaMalas) {
        this.portaMalas = portaMalas;
    }
}
