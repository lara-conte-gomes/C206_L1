public class Carro {
    //parâmetros que o carro vai ter
    public String cor;
    public String marca;
    public String modelo;
    public double velocidadeMax;
    public double velocidadeAtual;
    public Motor motor;

    public void addMotor(Motor motor){
        this.motor = motor;
    }

    //método para ligar o carro
    public void ligar(){
        System.out.println("O carro está ligado!");
    }

    //método para acelerar o carro
    public void acelerar(){
        System.out.println("O carro está acelerando");
    }

    //método para mostrar a informação do carro
    public void mostraInfo(){
        System.out.println("Cor do carro: " + cor);
        System.out.println("Marca do carro: " + marca);
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Velocidade máxima: " + velocidadeMax);
        System.out.println("Velocidade atual: " + velocidadeAtual);
        System.out.println("Potência do motor do carro: " + motor.potencia);
        System.out.println("Tipo do motor do carro: " + motor.tipo);
    }
}
