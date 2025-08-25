public class AddressBook {
    String name;
    String phoneNumber;
    String borrowedBook;
    int daysKept;
    double fine;

    public AddressBook(String name, String  phoneNumber, String borrowedBook, int daysKept){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.borrowedBook = borrowedBook;
        this.daysKept = daysKept;
        this.fine = fine;
    }

    public void showDetails(){
        System.out.println("Name: " +name);
        System.out.println("Phone Number: " +phoneNumber);
        System.out.println("Borrowed Book: " + borrowedBook);
        System.out.println("Days kept: " + daysKept);
        System.out.println("Current Fine: " + fine);
    }

    void calculateFine(){
        int extraDay = daysKept - 7;
        if(extraDay > 0) fine = extraDay * 50;
    }

    public void updateAndShowDetails(){
        calculateFine();
        System.out.println("Name: " +name);
        System.out.println("Phone Number: " +phoneNumber);
        System.out.println("Borrowed Book: " + borrowedBook);
        System.out.println("Days kept: " + daysKept);
        System.out.println("Current Fine: " + fine);
    }
}
