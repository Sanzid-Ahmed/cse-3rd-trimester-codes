import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        sc.nextLine();


        LibraryBook[] l = new LibraryBook[size];
        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter the name of the book: ");
            String name = sc.nextLine();
            System.out.print("\nEnter the author name of the book: ");
            String author = sc.nextLine();
            System.out.print("\nEnter the published year: ");
            int year = sc.nextInt();
            sc.nextLine();

            l[i] = new LibraryBook(name, author, year);
        }

        for(LibraryBook i : l){
            System.out.println(i.getDetails());
            System.out.println();
        }

        System.out.println("Enter which no book you want to update: ");
        int n = sc.nextInt();
        sc.nextLine();
        n--;
        System.out.print("Enter the name of the book: ");
        String name = sc.nextLine();
        System.out.print("\nEnter the author name of the book: ");
        String author = sc.nextLine();
        System.out.print("\nEnter the published year: ");
        int year = sc.nextInt();
        sc.nextLine();

        l[n].updateDetails(name, author, year);

        for(LibraryBook i : l){
            System.out.println(i.getDetails());
            System.out.println();
        }
    }
}
