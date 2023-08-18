package Day9.customer_SJ;

public class CustomerTest_SJ {

    public static void main(String[] args){
        Customer_SJ customerLee = new Customer_SJ();
        customerLee.setCustomerName("주지훈");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer_SJ customerKim = new VIPCustomer_SJ();
        customerKim.setCustomerName("강동원");
        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
