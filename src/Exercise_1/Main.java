package Exercise_1;

public class Main {

    public static boolean stringaPariDispari (String word) {
        return word.length() % 2 == 0;

}
    public static boolean annoBisestile (int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        System.out.println("stringa pari e dispari");
        String stringa_1 = "ciao";
        String stringa_2 = "come stai";
        System.out.println(stringaPariDispari(stringa_1));
        System.out.println(stringaPariDispari(stringa_2));
        System.out.println("anno bisestile");
        int year_1 = 2000;
        int year_2 = 1900;
        int year_3 = 2024;
        int year_4 = 2023;
        System.out.println(annoBisestile(year_1));
        System.out.println(annoBisestile(year_2));
        System.out.println(annoBisestile(year_3));
        System.out.println(annoBisestile(year_4));


    }

}