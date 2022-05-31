import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        if(findBranch(name) == null) {
            Branch branch = new Branch(name);
            branches.add(branch);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double transaction) {
        Branch tempBranch = findBranch(nameOfBranch);
        if(tempBranch != null) {
            return tempBranch.newCustomer(nameOfCustomer,transaction);
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transaction) {
        Branch tempBranch = findBranch(nameOfBranch);
        if(tempBranch != null) {
            return tempBranch.addCustomerTransaction(nameOfCustomer,transaction);
        } else {
            return false;
        }
    }

    private Branch findBranch(String nameOfBranch) {
        for (int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if(branch.getName().equals(nameOfBranch)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransactions) {
        Branch tempBranch = findBranch(nameOfBranch);
        if(tempBranch != null && printTransactions) {
            System.out.println("Customer details for branch " + tempBranch.getName());
            for(int i=0; i<tempBranch.getCustomers().size(); i++) {
                System.out.println("Customer: " + tempBranch.getCustomers().get(i).getName() + "[" + (i+1) + "]");
                System.out.println("Transactions");
                for(int j=0; j<tempBranch.getCustomers().get(i).getTransactions().size(); j++) {
                    System.out.println("[" + (j+1) + "]  Amount " + tempBranch.getCustomers().get(i).getTransactions().get(j));
                }
            }
            return true;
        } else if(tempBranch != null) {
            System.out.println("Customer details for branch " + tempBranch.getName());
            for(int i=0; i<tempBranch.getCustomers().size(); i++) {
                System.out.println("Customer: " + tempBranch.getCustomers().get(i).getName() + "[" + (i+1) + "]");
            }
            return true;
        } else {
            return false;
        }
    }


}
