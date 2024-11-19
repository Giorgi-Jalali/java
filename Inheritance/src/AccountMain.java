public class AccountMain {
    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount();

        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(1000.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setEmail("myemail@bob.com");
        bobsAccount.setPhone("(087) 123-4567");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);
        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);
        bobsAccount.withdrawFunds(54.45);
    }
}