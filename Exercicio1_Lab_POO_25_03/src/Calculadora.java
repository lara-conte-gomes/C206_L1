public class Calculadora {
    public static double PI = 3.14;

    //método para calcular a circunferência
    public static double circunferencia(double raio){
        return (2 * PI * raio);
    }

    //método para calcular o volume
    public static double volume(double raio){

        //variável para o cálculo do volume
        double v;

        //variável para efetuar a conta de raio^3
        double raioElevado = Math.pow(raio,3);

        //cálculo do volume
        v = (4/3) * PI * raioElevado;

        //retornando valor da conta
        return v;
    }

}
