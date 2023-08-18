package Day9.customer_SJ;

public class VIPCustomer_SJ extends Customer_SJ{
    double salesRatio;
    private String agentID;

    public String getAgentID(){
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    public VIPCustomer_SJ() {
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }
}
