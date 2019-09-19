package com.factory.repository;

import com.repository.drivers.DriverRep;

public class DriverRepFact {
    DriverRep driverRep;
    public static DriverRep getDriverRep()
    {return DriverRep.getInstance();
    }
}
