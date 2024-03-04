
public class Main {

    public static void main(String[] args) {

        //Criando os parâmetros do carro 1
        Carro c1 = new Carro();
        c1.cor = "Azul";
        c1.marca = "Fiat";
        c1.modelo = "Mobi";
        c1.velocidadeMax = 200.5;
        c1.velocidadeAtual = 50.5;

        //criando um motor para o carro 1
        Motor m1 = new Motor();
        m1.potencia = 2500;
        m1.tipo = "Motor à gasolina";

        //colocando o motor no carro 1
        c1.addMotor(m1);

        //ligando o carro 1
        c1.ligar();

        //criando os parâmetros do carro 2
        Carro c2 = new Carro();
        c2.cor = "Vermelho";
        c2.marca = "Fiat";
        c2.modelo = "Cronos";
        c2.velocidadeMax = 300.5;
        c2.velocidadeAtual = 100.5;

        //criando o motor do carro 2
        Motor m2 = new Motor();
        m2.potencia = 5000;
        m2.tipo = "Motor elétrico";

        //colocando o motor no carro 2
        c2.motor = m2;

        //ligando o carro 2
        c2.ligar();

        //acelerando os carros 1 e 2
        c1.acelerar();
        c2.acelerar();

        //mostrando os parâmetros dos carros 1 e 2
        c1.mostraInfo();
        c2.mostraInfo();
    }
}