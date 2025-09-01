//public class BankAccount
class BankAccount
{
    public String name;
    private String account_id;
    private double balance;
    BankAccount(String name,double balance,
                String gender){
        this.name=name;
        this.balance=balance;
        this.account_id= gender + "-" + name;
    }
    public void setBalance(double balance){
        if(this.balance + balance < 0){
            System.out.println("balance cannot be less than 0");
            return;
        }
        this.balance += balance;
    }
    public double getBalance(){
        return balance;
    }

    public String getAccountID(){
        return account_id;
    }
}
class Test{
    public static void main(String[] args) {
        BankAccount b=new
                BankAccount("Mr.Rahman",1000, "M");
        System.out.println("Account id:"+b.getAccountID());
        System.out.println("balance before:"+b.getBalance());
        b.setBalance(-2000);
    }
}