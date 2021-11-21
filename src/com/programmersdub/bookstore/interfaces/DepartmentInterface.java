package com.programmersdub.bookstore.interfaces;

import java.util.ArrayList;

public interface DepartmentInterface {

    String getName();
    ArrayList<StuffInterface> getStuffList();
    ArrayList<GoodsInterface> getGoodsList();

}
