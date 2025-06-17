package Exercise_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int numb = scanner.nextInt();

        switch(numb) {
            case 0 :
                System.out.println(" il numero è zero");
                break;
            case 1 :
                System.out.println(" il numero è uno");
                break;
            case 2 :
                System.out.println(" il numero è due");
                break;
            case 3 :
                System.out.println(" il numero è tre");
                break;
            default:
                System.out.println("errore il numero non è compreso tra 0 e 3");
        }
        scanner.close();

    }
}

