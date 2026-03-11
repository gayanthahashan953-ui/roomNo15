 class MobileApp {

    public static void main(String[] args) {
        MobileConnection.minimumBalance(10);
        MobileConnection connection1 = new MobileConnection("1234567890", "John Doe", 50);
        MobileConnection connection2 = new MobileConnection("0987654321", "Jane Smith", 20);

        connection1.recharge(30);
        boolean callResult1 = connection1.makeCall(15);
        System.out.println("Call result for connection1: " + callResult1);
        System.out.println("Curren balance for connection1: " + connection1.getBalance());

        boolean callResult2 = connection2.makeCall(25);
        System.out.println("Call result for connection2: " + callResult2);
        System.out.println("Current balance for connection2: " + connection2.getBalance());
    }
    
}// jkvdsnkvnsdkjvnkjnvksdnvjkdvjdnvjedb nvhjb enveenvbnvjbnfjbvn
 hi
