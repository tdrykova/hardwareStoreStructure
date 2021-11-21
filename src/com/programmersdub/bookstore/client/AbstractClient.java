package com.programmersdub.bookstore.client;

import com.programmersdub.bookstore.interfaces.ClientInterface;

public abstract class AbstractClient implements ClientInterface {

    private String name;

    @Override
    public void buy() {

    }

    @Override
    public void returnGoods() {

    }

    @Override
    public String getName() {
        return name;
    }
}
