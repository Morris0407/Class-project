package com.morris.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        try {
            //Driver
            Class.forName("org.mariadb.jdbc.Driver");
            //Connection
            Connection conn = DriverManager
                    .getConnection("jdbc:mariadb://localhost:3306/demo?user=root&password=ffjj123123");
            Statement statement = conn.createStatement();
//            statement.executeUpdate("insert into students values('000003', 'Jenny')");
            ResultSet rs = statement.executeQuery("select * FROM drinks");
            List<Drink> drink = new ArrayList<>();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                System.out.println( id + "/" + name + "/" + price);
                drink.add(new Drink(id,name,price));
            }



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}