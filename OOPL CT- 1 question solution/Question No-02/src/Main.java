import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many people details you want to note: ");
        int num = sc.nextInt();
        sc.nextLine();

        AddressBook[] p = new AddressBook[num];

        for(int i = 0; i < num; i++){
            System.out.println("Enter the name: ");
            String name = sc.nextLine();
            System.out.println("Enter the phone number: ");
            String number = sc.nextLine();
            System.out.println("Enter the book name: ");
            String bookName = sc.nextLine();
            System.out.println("Enter the book keeping day: ");
            int day = sc.nextInt();
            sc.nextLine();

            p[i] = new AddressBook(name, number, bookName, day);
        }


        System.out.println("User Details: ");
        for(int i = 0; i < num; i++){
            p[i].showDetails();
            System.out.println();
        }

        System.out.println("Updated User Details: ");
        for(int i = 0; i < num; i++){
            p[i].updateAndShowDetails();
            System.out.println();
        }
    }
}
