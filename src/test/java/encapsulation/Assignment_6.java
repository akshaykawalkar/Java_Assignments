package encapsulation;

class Bank{
    private String user_Name;
    private int account_Number;
    private int account_Balance;

//Bank(String name, int account_Balance, int account_Number){
//    this.account_Balance=account_Balance;
//    this.user_Name=name;
//    this.account_Number=account_Number;
//}
    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public int getAccount_Balance() {
        return account_Balance;
    }

    public void setAccount_Balance(int account_Balance) {
        this.account_Balance = account_Balance;
    }

    public int getAccount_Number() {
        return account_Number;
    }

    public void setAccount_Number(int account_Number) {
        this.account_Number = account_Number;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "user_Name='" + user_Name + '\'' +
                ", account_Balance=" + account_Balance +
                ", account_Number=" + account_Number +
                '}';
    }
}
class User{


    public static void main(String[] args) {
//        Bank bank=new Bank("Akshay",77777,000000);
        Bank bank= new Bank();
        bank.setAccount_Number(99999999);
        bank.setUser_Name("Akshay");
        bank.setAccount_Balance(546899);
        System.out.println(bank);

    }

}