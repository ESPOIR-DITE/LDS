package com.repository.ItemRep.alcoholRepository;
import com.domain.driver.Driver;
import com.domain.itemBuilder.beverages.alcoholProduct.Alcohol;
import com.domain.itemBuilder.beverages.alcoholProduct.AlcoholProduct;
import com.factory.domain.driverFactory.DriverFactory;
import com.factory.domain.productFactory.alcoholItemFactory;

import java.sql.*;
import java.util.ArrayList;

public class AlcoholRepositoryClass implements AlcoholRepository {
    private String url="jdbc:mysql://localhost:3306/delivery_system?autoReconnect=true&useSSL=false";
    String user="root";
    String password="";
    Connection conne;
    int highValeu;


    private static AlcoholRepositoryClass alcoholRepository=null;
    private AlcoholProduct alcoholProduct;

    private AlcoholRepositoryClass()
    {
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static AlcoholRepositoryClass getAlcoholRepository()
    {
        if(alcoholRepository==null)
        {
            alcoholRepository = new AlcoholRepositoryClass();
        }
        return alcoholRepository;
    }
    @Override
    public AlcoholProduct create(AlcoholProduct alcoholProduct)
    {
        String type=alcoholProduct.getItemCategory();
        Alcohol alcohol= alcoholItemFactory.getAlcohol(type);


        int ITEM_NUMBER=getItemNumber();

        try {
            String sql="INSERT INTO ITEM(ITEM_NUMBER,ITEM_NAME,SIZES,PRICE,ITEM_CATEGORY,ALCOHOL_PERCENT,DESCRIPTION)" +
                    " VALUES ("+ITEM_NUMBER+",'"+alcohol.getAlcoholProduct().getItemName()+"','"+alcohol.getAlcoholProduct().getSize()+"',"+alcohol.getAlcoholProduct().getPrice()+",'"+alcohol.getAlcoholProduct().getItemCategory()+"','"+alcohol.getAlcoholProduct().getPercentageOfAlcohol()+"','"+alcohol.getAlcoholProduct().getItemDescription()+"')";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("one row inserted in Item table");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public AlcoholProduct update(AlcoholProduct alcoholProduct)// to be reviewed
    {
        try {
        String sql="UPDATE ITEM SET ..... WHERE ITEM_NUMBER='"+ alcoholProduct+"'";
        PreparedStatement statement=conne.prepareStatement(sql);
        statement.executeUpdate();

    }//end try
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return alcoholProduct;
    }

    @Override
    public void delete(String s)
    { try{
            String sql="delete ITEM WHERE ITEM_NUMBER='"+s+"'";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeQuery();
        }//end try
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    @Override
    public AlcoholProduct read(String type) {
        Alcohol alcohol= alcoholItemFactory.getAlcohol(type);

        try {
            String sql = "select * from ITEM ;";
            PreparedStatement statement = conne.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                alcohol.buildItemNumber(rs.getString(1));
                alcohol.buildItemName(rs.getString(2));
                alcohol.buildItemSize(rs.getString(3).charAt(0));
                alcohol.buildItemPrice(rs.getDouble(4));
                alcohol.buildCategory(rs.getString(5));
                alcohol.percentageOfAlcohol(rs.getString(6));
                alcohol.buildItemDescription(rs.getString(7));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException x) {
        }

        return alcohol.getAlcoholProduct();
    }

    @Override
    public ArrayList<String> readAll() {
        return null;
    }


    @Override
    public int getItemNumber() {
        try {

            String sql="SELECT MAX(ITEM_NUMBER) from ITEM ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while (rs.next())
            {
                String s=rs.getString(1);
                highValeu=Integer.parseInt(s)+1;
            }
           } catch (SQLException e) {
                e.printStackTrace();
            }catch (NullPointerException n)
        {
            highValeu=1000;
        }


        return highValeu;
    }

    @Override
    public ArrayList<String> readAlcol(String type, String id) {
        Alcohol alcohol= alcoholItemFactory.getAlcohol(type);
        ArrayList<String> myList2 = new ArrayList<>();

        try{
            String sql="SELECT * FROM ITEM WHERE ITEM_NUMBER='"+id+"'";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                alcohol.buildItemNumber(rs.getString(1));
                alcohol.buildItemName(rs.getString(2));
                alcohol.buildItemSize(rs.getString(3).charAt(0));
                alcohol.buildItemPrice(rs.getDouble(4));
                alcohol.buildCategory(rs.getString(5));
                alcohol.percentageOfAlcohol(rs.getString(6));
                alcohol.buildItemDescription(rs.getString(7));
                myList2.add(alcohol.getAlcoholProduct().toString());
            }//end while loop
        }//end try
        catch (SQLException e)
        {
            e.getMessage();
        }
        return myList2;
    }


}
