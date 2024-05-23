import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArryList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("-----------------");
            System.out.println("1. Įvesti prekę");
            System.out.println("2. Atvaizduoti prekę");
            System.out.println("3. Redaguoti prekę");
            System.out.println("4. Trinti prekę");
            System.out.println("5. Išeiti iš programos");
            System.out.println("-----------------");
            System.out.println();

            int item = sc.nextInt();
            sc.nextInt();

            switch (item) {
                case 1:
                    System.out.println("Parašykite prekės pavadinimą");
                    String input = sc.nextLine();
                    shoppingList.add(input);
                    break;
                case 2:
                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.println(shoppingList.get(i));
                    }
                case 5:
                    System.exit(1);

                default:
                    System.out.println("pasiilgo Maryte Jono...");
            }
        }
    }
}