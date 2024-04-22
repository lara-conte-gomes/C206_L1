import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        System.out.println("Digite o número 1: ");
        int n = num1.nextInt();

        System.out.println("Digite o número 2: ");
        int n2 = num2.nextInt();

        float r1;
        r1 = n + n2;

        System.out.println("Resultado da soma: " + r1);

        float r2;
        r2 = n - n2;

        System.out.println("Resultado da substração: " + r2);

        float r3;
        r3 = n * n2;

        System.out.println("Resultado da multiplicação: " + r3);

        int r4;
        try{
            r4 = n / n2;
            System.out.println("Resultado da divisão: " + r4);
        }
        catch(ArithmeticException e){
            System.out.println("Divisão não é possível");
        }
    }
}