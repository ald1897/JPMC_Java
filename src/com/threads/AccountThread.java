package com.threads;

public class AccountThread extends  Thread{

    private Account account;

    public AccountThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        try {
            account.withdraw(1000);
            account.deposit(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
