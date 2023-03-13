import java.util.Scanner;

public class teste_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numeroDigitado = scanner.nextInt();

        int a = 0;
        int b = 1;

        while (b < numeroDigitado) {
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        if (b == numeroDigitado) {
            System.out.println(numeroDigitado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numeroDigitado + " não pertence à sequência de Fibonacci.");
        }
    }
}
