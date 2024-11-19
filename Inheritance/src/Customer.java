public class Customer {

    private final String name;
    private final double creditLimit;
    private final String email;

    public Customer() {
        this("Giorgi", "giorgi@email.com");
    }

    public Customer(String name, String email) {
        this(name, 1000, email);
//        this.name = name;
//        this.email = email;
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}





















