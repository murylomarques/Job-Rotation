import java.util.Scanner;

public class teste_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma sequência para completar:");
        System.out.println("a) 1, 3, 5, 7, ___");
        System.out.println("b) 2, 4, 8, 16, 32, 64, ____");
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, ____");
        System.out.println("d) 4, 16, 36, 64, ____");
        System.out.println("e) 1, 1, 2, 3, 5, 8, ____");
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, ____");
        System.out.println("***************************************");
        System.out.print("Digite a opção desejada: ");
        String opcao = scanner.nextLine();
        
        System.out.println("***************************************");
        int proximo;

        switch (opcao.toUpperCase()) {
            case "A":
                proximo = 9;
                break;
            case "B":
                proximo = 128;
                break;
            case "C":
                proximo = 49;
                break;
            case "D":
                proximo = 100;
                break;
            case "E":
                proximo = 13;
                break;
            case "F":
                proximo = 20;
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("O próximo elemento é: " + proximo);
    }
}

