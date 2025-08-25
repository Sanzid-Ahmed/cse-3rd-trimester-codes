public class AddressBook {
    String name;
    int phoneNumber;
    String borrowedBook;
    int daysKept;
    double fine;

    public AddressBook(String name, int phoneNumber, String borrowedBook, int daysKept,  double fine){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.borrowedBook = borrowedBook;
        this.daysKept = daysKept;
        this.fine = fine;
    }

    public void showDetails(){
        System.out.println(name);
        System.out.println(phoneNumber);
        System.out.println(borrowedBook);
        System.out.println(daysKept);
        System.out.println(fine);
    }

    void calculateFine(){
        int extraDay = daysKept - 7;
        if(extraDay > 0) fine = extraDay * 50;
    }

    public void updateAndShowDetails(){
        calculateFine();
        System.out.println(name);
        System.out.println(phoneNumber);
        System.out.println(borrowedBook);
        System.out.println(daysKept);
        System.out.println(fine);
    }
}
