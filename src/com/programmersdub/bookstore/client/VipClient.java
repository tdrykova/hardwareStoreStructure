package com.programmersdub.bookstore.client;

public class VipClient extends AbstractClient {

    private float discount;

    @Override
    public void buy() {
        if (!checkDiscount()) {
            super.buy();
        } else {
            // купить со скидкой
        }
    }

    private boolean checkDiscount() {
        return discount > 0;
    }
}
