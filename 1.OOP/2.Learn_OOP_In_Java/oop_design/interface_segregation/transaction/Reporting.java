package com.company.oop_design.interface_segregation.transaction;

import java.util.Date;

public interface Reporting {

    String getName();

    Date getDate();

    String productBreakDown();
}
