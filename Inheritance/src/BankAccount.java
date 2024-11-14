public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public void depositFunds(double depositAmount) {

        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount
                + " made. New balance is $" + balance);
    }

    public void withdrawFunds(double withdrawAmount) {

        if (balance - withdrawAmount < 0) {
            System.out.println("Insufficient Funds! You only have $"
                    + balance + " in your account.");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrawal of $" + withdrawAmount
            + " processed, Remaining balance = $" + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}












