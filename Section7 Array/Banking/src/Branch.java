import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String namOfCustomer, double transaction) {
        if(findCustomer(namOfCustomer) == null) {
            Customer customer = new Customer(namOfCustomer, transaction);
            customers.add(customer);
            return true;
        } else {
            return false;
        }

    }

    public boolean addCustomerTransaction(String namOfCustomer, double transaction) {
        if(findCustomer(namOfCustomer) != null) {
            Customer customer = findCustomer(namOfCustomer);
            customer.addTransaction(transaction);
            return true;
        } else {
            return false;
        }
    }

    private Customer findCustomer(String namOfCustomer) {
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if(customer.getName().equals(namOfCustomer)) {
                return customer;
            }
        }
        return null;
    }
}
