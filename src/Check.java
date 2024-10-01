import java.util.Scanner;

public class Check {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int countA = 0;

        for (char c : frase.toCharArray()) {
            if (c == 'a' || c == 'A') {
                countA++;
            }
        }

        if (countA > 0) {
            System.out.println("A letra 'a' aparece " + countA + " vez(es) na frase.");
        } else {
            System.out.println("A letra 'a' não está presente na frase.");
        }

        scanner.close();
    }
}
