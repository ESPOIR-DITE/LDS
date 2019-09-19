package com.repository.drivers;


import com.configPack.domainConf.DriverConfig;
import com.domain.driver.Driver;
import com.domain.users.Address;
import com.domain.users.User;
import com.factory.domain.address.AddressFactory;
import com.factory.domain.driverFactory.DriverFactory;
import com.factory.domain.user.UserFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.*;
import java.util.ArrayList;

public class DriverRep implements DriverRepInt {

    private static DriverRep driverRep = null;
    ApplicationContext ctx2 = new AnnotationConfigApplicationContext(DriverConfig.class);
    private int value;
    //database setting up
    private String url = "jdbc:mysql://localhost:3306/delivery_system?autoReconnect=true&useSSL=false";
    private String user = "root";
    private String password = "";
    private Connection conne;

    private DriverRep() {
        try {
            this.conne = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DriverRep getInstance() {
        if (driverRep == null) {
            return new DriverRep();
        } else return null;
    }

    @Override
    public Driver create(Driver driver) {
        int driverNumber = getItemNumber();
        String getDriverNumber = "" + driverNumber + "".trim();
        try {
            String sql = "INSERT INTO DRIVER(DRIVER_CODE,STATE)" +
                    " VALUES ('" + driverNumber + "','" + driver.getStat() + "');";
            PreparedStatement statement = conne.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("one row inserted in Item table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(getDriverNumber);
    }

    @Override
    public Driver update(Driver driver) {
        String custNumber = driver.getId();
        System.out.println(custNumber);
        try {
            String sql = "update driver set NAME='"+driver.getStat()+"',WHERE DRIVER_CODE='" + custNumber + "';";
            PreparedStatement statement = conne.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("one row updated in Driver table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(custNumber);
    }

    @Override
    public void delete(String s) {
        int s2 = Integer.parseInt(s);

        //before deleting we read first
        System.out.println(read(s).toString() + "\n this driver is deleted");
        try {
            String sql = "DELETE from driver WHERE DRIVER_CODE=" + s2 + ";";
            PreparedStatement statement = conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Driver read(String s) {
        Driver driverP=null;
        int s2 = Integer.parseInt(s);
        try {
            String sql = "select * from driver WHERE DRIVER_CODE=" + s2 + ";";
            PreparedStatement statement = conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                driverP = DriverFactory.getDriver(rs.getString(1),rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("!!! THIS CUSTOMER DOES NOT EXIST");
        }
        return driverP;
    }

    @Override
    public ArrayList<String> readAll() {

        Driver driverP=null;


        ArrayList<String> myList2 = new ArrayList<>();
        try {
            String sql = "select * from driver ;";
            PreparedStatement statement = conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                driverP = DriverFactory.getDriver(rs.getString(1),rs.getString(2));
                myList2.add(driverP.toString());

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException x) {
        }


        return myList2;
    }

    @Override
    public int getItemNumber() {
        int highValeu = 0;
        try {

            String sql = "SELECT MAX(DRIVER_CODE) from DRIVER ;";
            PreparedStatement statement = conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String s = rs.getString(1);
                highValeu = Integer.parseInt(s) + 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            highValeu = 1000;
        } catch (NumberFormatException x) {
            highValeu = 1000;
        }


        return highValeu;
    }

    public User readItentity(String id) {
        User user=null;
        try {
            String sql = "select * from driver WHERE DRIVER_CODE=" + id + ";";
            PreparedStatement statement = conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                user= UserFactory.getUser(rs.getString(1),rs.getString(2),rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

}
