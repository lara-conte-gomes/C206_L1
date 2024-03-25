
public class Main {
    public static void main(String[] args) {
        //criando a calculadora
        Calculadora c1 = new Calculadora();

        //variável para o raio
        double raio = 6;

        //chamando o método e armazenando o valor que vem dele
        double x = c1.circunferencia(raio);

        //mostrando o valor da circunferência
        System.out.println("O valor da circunferência é: " + x);

        //chamando o método e armazenando o valor que vem dele
        double y = c1.volume(raio);

        //mostrando o volume
        System.out.println("O valor do volume é: " + y);
    }
}