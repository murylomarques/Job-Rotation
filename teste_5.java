import java.util.Scanner;

public class tst5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // lê a string
        System.out.print("Digite uma string: ");
        String str = scanner.nextLine();
        
        // converte a string em um array de caracteres
        char[] chars = str.toCharArray();
        
        // inverte os caracteres do array
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        
        // converte o array de caracteres de volta para uma string
        String strInvertida = new String(chars);
        
        // imprime a string invertida
        System.out.println("A string invertida é: " + strInvertida);
    }
}