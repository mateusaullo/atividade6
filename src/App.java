import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        double circulo;
        double pi;
        double resultado;

        pi = 3.14159;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Coloque o raio do circulo: ");
        circulo = teclado.nextDouble();
        teclado.close();

        resultado = pi * (circulo*circulo);

        System.out.printf("A area do circulo eh: %.3f",resultado);
    }
}
