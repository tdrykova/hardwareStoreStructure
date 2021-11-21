package com.programmersdub.bookstore.department;

import com.programmersdub.bookstore.interfaces.DepartmentInterface;
import com.programmersdub.bookstore.interfaces.GoodsInterface;
import com.programmersdub.bookstore.interfaces.StuffInterface;

import java.util.ArrayList;

public abstract class AbstractDepartment implements DepartmentInterface {

    private String name;
    private ArrayList<StuffInterface> stuffList = new ArrayList<StuffInterface>();
    private ArrayList<GoodsInterface> goodsList = new ArrayList<GoodsInterface>();

    public AbstractDepartment() {

    }

    public AbstractDepartment(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<StuffInterface> getStuffList() {
        return stuffList;
    }

    public void setStuffList(ArrayList<StuffInterface> stuffList) {
        this.stuffList = stuffList;
    }

    @Override
    public ArrayList<GoodsInterface> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(ArrayList<GoodsInterface> goodsList) {
        this.goodsList = goodsList;
    }

    public void addStuff(StuffInterface stuff) {
        stuff.setDepartment(this);
        stuffList.add(stuff);
    }

    public void addGoods(GoodsInterface goods) {
        goods.setDepartment(this);
        // при добавлении товара автоматически прописывается департамент
        goodsList.add(goods);
    }

}
