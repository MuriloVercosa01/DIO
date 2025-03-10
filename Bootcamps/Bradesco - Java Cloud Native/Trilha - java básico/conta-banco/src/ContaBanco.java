public class ContaBanco {
    private int acountNumber;
    private String agency;
    private String custumerName;
    private double balance;

    public int getAcountNumber() {
        return acountNumber;
    }
    public String getAgency() {
        return agency;
    }
    public String getCustumerName() {
        return custumerName;
    }
    public double getBalance() {
        return balance;
    }
    public void setAcountNumber(int acountNumber) {
        this.acountNumber = acountNumber;
    }
    public void setAgency(String agency) {
        this.agency = agency;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustumerName(String custumerName) {
        this.custumerName = custumerName;
    }
}
