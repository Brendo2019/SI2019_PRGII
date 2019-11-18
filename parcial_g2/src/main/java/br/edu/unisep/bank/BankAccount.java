package br.edu.unisep.bank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankAccount {

    private String client;

    private Double balance;

    public void withdraw(Double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }
    }

    public void withdraw(Double amount, Double blockPercentage) {
        var limit = balance * blockPercentage / 100d;
        if (amount <= balance - limit) {
            balance = balance - amount;
        }
    }

    public Double deposit(Double amount) {
        balance = balance + amount;
        return balance;
    }
}
