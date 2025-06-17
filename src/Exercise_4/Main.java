package Exercise_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero");
        int number = scanner.nextInt();

        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }
        scanner.close();
    }
}
