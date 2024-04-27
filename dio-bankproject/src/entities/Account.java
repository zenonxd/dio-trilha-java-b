package entities;

public class Account {
    private Integer number;
    private String agency;
    private String name;
    private Double balance;

    public Account(Integer number, String agency, String name, Double balance) {
        this.number = number;
        this.agency = agency;
        this.name = name;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Hi, " +
                name +
                ", thank you for creating an account in our bank, your agency is: " +
                agency +
                ", account: " +
                number +
                " and your balance: " +
                balance +
                " is already available to withdraw.";
    }
}
