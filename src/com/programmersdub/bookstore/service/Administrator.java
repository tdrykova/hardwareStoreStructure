package com.programmersdub.bookstore.service;

import com.programmersdub.bookstore.SaleRoom;
import com.programmersdub.bookstore.interfaces.DepartmentInterface;
import com.programmersdub.bookstore.interfaces.StuffInterface;

public class Administrator {

    private SaleRoom saleRoom;

    public Administrator(SaleRoom saleRoom) {
        this.saleRoom = saleRoom;
    }

    public Consultant getFreeConsultant(DepartmentInterface departmentInterface) {
        for (StuffInterface stuff: departmentInterface.getStuffList()) {
            if (stuff instanceof Consultant) {
               // if (((Consultant) stuff).isFree())
                if ((stuff).isFree()) {
                    return (Consultant)stuff;
                }
            }
        }
        return null;
    }
}
