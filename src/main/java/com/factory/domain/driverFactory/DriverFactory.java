package com.factory.domain.driverFactory;

import com.domain.driver.Driver;
import com.domain.users.Address;
import com.domain.users.User;

public class DriverFactory {

    public static Driver getDriver(String id ,String stat)
    {
       return new Driver.Builder(id)
               .buildStat(stat)
               .build();
    }
}
