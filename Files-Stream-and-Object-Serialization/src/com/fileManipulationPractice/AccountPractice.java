package com.fileManipulationPractice;

import java.io.Serializable;

public class AccountPractice implements Serializable {
    private int account;
    private String firstName;
    private String lastName;
    private double balance;

    public AccountPractice() {
        this(0, " ", " ", 0);
    }

    public AccountPractice(int account, String firstName, String lastName, double balance) {
        if (balance <= 0.0)
            throw new IllegalArgumentException("Balance cannot be less than or equal to zero ");

        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getAccount() {
        return account;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBalance(double balance){
        if (balance <= 0.0)
            throw new IllegalArgumentException("Balance cannot be less than or equal to zero ");
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

}
