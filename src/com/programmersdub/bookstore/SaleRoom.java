package com.programmersdub.bookstore;

import com.programmersdub.bookstore.interfaces.ClientInterface;
import com.programmersdub.bookstore.interfaces.DepartmentInterface;

import java.util.ArrayList;

public class SaleRoom {

    public static final String STORE_NAME = "TECHNO";

    private ArrayList<DepartmentInterface> departmentList = new ArrayList<DepartmentInterface>();
    private ArrayList<ClientInterface> clientList = new ArrayList<ClientInterface>();

    public ArrayList<DepartmentInterface> getDepartmentList() {
        return departmentList;
    }

    public void addDepartment(DepartmentInterface department) {
        departmentList.add(department);
    }

    public void addClient(ClientInterface client) {
        clientList.add(client);
    }
}
