import java.util.ArrayList;
import java.util.List;

public class Customer {
    Integer customerId;
    String name;
    List<CreateAccount> account = new ArrayList<>();

    public Customer(Integer customerId, String name, List<CreateAccount> createAccount) {
        this.customerId = customerId;
        this.name = name;
        this.account = createAccount;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
