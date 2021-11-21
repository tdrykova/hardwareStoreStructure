package com.programmersdub.bookstore.service;

import com.programmersdub.bookstore.interfaces.DepartmentInterface;
import com.programmersdub.bookstore.interfaces.StuffInterface;

public abstract class AbstractStuff implements StuffInterface {

    public AbstractStuff() {

    }

    public AbstractStuff(String name) {
        this.name = name;
    }

    private String name;
    private DepartmentInterface department;
    private boolean free;

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
    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
