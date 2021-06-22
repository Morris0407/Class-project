package Box;

import com.morris.db.Drink;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Tester2 {
    public static void main(String[] args) {
        try {
            //Driver
            Class.forName("org.mariadb.jdbc.Driver");
            //Connection
            Connection conn = DriverManager
                    .getConnection("jdbc:mariadb://localhost:3306/demo?user=root&password=ffjj123123");
            Statement statement = conn.createStatement();
//            statement.executeUpdate("insert into students values('000003', 'Jenny')");
            ResultSet rs = statement.executeQuery("select * FROM boxes");
            List<Boxes> box = new ArrayList<>();
            while(rs.next()){
                int d1 = rs.getInt("d1");
                int d2 = rs.getInt("d2");
                int d3 = rs.getInt("d3");
                System.out.println( d1 + "/" + d2 + "/" + d3);
                box.add(new Boxes(d1,d2,d3));
            }



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
