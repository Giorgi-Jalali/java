public class CustomerMain {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("name: " + customer.getName()
                + " credit limit: " + customer.getCreditLimit()
                + " and email: " + customer.getEmail());
    }
}
