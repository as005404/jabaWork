package com.foxrider;

public class Customer {
    private static int uniqueId = 0;
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private long creditCard;
    private String bankAccount;

    Customer(String lastName, String firstName, String middleName, String address, long creditCard, String bankAccount) throws Exception {
        if(Long.toString(creditCard).length()!=16)throw new Exception("invalid credit card number");

        this.id = ++uniqueId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", creditCard=" + creditCard +
                ", BankAccount=" + bankAccount +
                '}';
    }
}
