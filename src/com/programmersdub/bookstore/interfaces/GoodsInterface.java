package com.programmersdub.bookstore.interfaces;

public interface GoodsInterface {

    double getPrice();
    boolean hasGuarantee();
    String getName();
    DepartmentInterface getDepartment();
    String getCountry();

}

