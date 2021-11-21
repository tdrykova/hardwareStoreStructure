package com.programmersdub.bookstore.service;

import com.programmersdub.bookstore.enums.ConsultResult;
import com.programmersdub.bookstore.interfaces.ClientInterface;
import com.programmersdub.bookstore.interfaces.DepartmentInterface;

public class Consultant extends AbstractStuff {

    public Consultant() {

    }

    public Consultant(String name) {
        super(name);
    }

    public ConsultResult consult(ClientInterface client) {
        super.setFree(false);
        // logic buy or no
        return ConsultResult.BUY;
    }

    public void send() {

    }

    //@Override
   public void setDepartment(DepartmentInterface department) {
        super.setDepartment(department);
    }

}
