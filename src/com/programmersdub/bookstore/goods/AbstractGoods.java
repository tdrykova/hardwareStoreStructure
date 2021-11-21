package com.programmersdub.bookstore.goods;

import com.programmersdub.bookstore.interfaces.DepartmentInterface;
import com.programmersdub.bookstore.interfaces.GoodsInterface;

public class AbstractGoods implements GoodsInterface {

    public static final int DEFAULT_GUARANTEE = 2;

    private double price;
    private boolean hasGuarantee;
    private String name;
    private DepartmentInterface department;
    private String country;

    public AbstractGoods() {

    }

    public AbstractGoods(String name) {
        this.name = name;
    }

    public AbstractGoods(double price, boolean hasGuarantee, String name, DepartmentInterface department, String country) {
        this.price = price;
        this.hasGuarantee = hasGuarantee;
        this.name = name;
        this.department = department;
        this.country = country;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean hasGuarantee() {
        return hasGuarantee;
    }

    public void setHasGuarantee(boolean hasGuarantee) {
        this.hasGuarantee = hasGuarantee;
    }
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentInterface department) {
        this.department = department;
    }

    @Override
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
