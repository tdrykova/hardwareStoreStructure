package com.programmersdub.bookstore.bank;

import com.programmersdub.bookstore.interfaces.BankInterface;

public abstract class AbstractBank implements BankInterface {

    private String name;
    private String creditDescription;

    @Override
    public void checkInfo() {

    }

    @Override
    public void giveCredit() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
}
