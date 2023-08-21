package principal;

import java.util.Scanner;
import java.util.Locale;

public class MathELocale {

    public static void main(String[] args) {

        //atalho pra importar : ctrl+shift+o

        final Locale ponto = new Locale("en", "US");

        Scanner leia = new Scanner(System.in);
        leia.useLocale(ponto); // Correção para usar o locale

        double decimal = 10.333333;
        int numero = 10;
        double altura = 0;

        //potencia
        System.out.println(Math.pow(2, 5));
        //maior numero entre 2 numeros ou variaveis
        System.out.println(Math.max(2, 10));
        //menor numero entre 2 numeros ou variaveis
        System.out.println(Math.min(2, 10));
        //obter raiz quadrada
        System.out.println(Math.sqrt(decimal)); // Usar sqrt para a raiz quadrada

        System.out.printf("Resultado: %.2f%n", decimal); // Usar printf para formatar a saída
        System.out.println("Resultado: " + (decimal + numero));

        System.out.println("Entre com sua altura:");
        altura = leia.nextDouble();

        System.out.println("A altura digitada foi: " + altura);

        leia.close();
    }
}
