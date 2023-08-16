package Day9.Customer;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerName("주지훈");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("강동원");
        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
