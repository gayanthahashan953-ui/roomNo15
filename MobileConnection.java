public class MobileConnection {
    String mobilenumber;
    String customerName;
    double balance;

    static double minimumBalance;
    static int totalConnections;

    MobileConnection(String mobilenumber, String customerNam,double balance){
        this.balance = balance;
        this.customerName = customerNam;
        this.mobilenumber = mobilenumber;
        totalConnections++;
    }

    void recharge(double amount){
        balance = balance + amount;
        System.out.println("you have recharge" + amount + "your current balance  is " + balance);

    }

    boolean makeCall(double cost){
        if((balance - cost )< minimumBalance){
            return false;

        }else{
            balance = balance - cost;
            return true;
        }
    }

    double getBalance(){
        return balance;

    }

    static void minimumBalance(double minimumBalance){
        MobileConnection.minimumBalance = minimumBalance;

    }



}
