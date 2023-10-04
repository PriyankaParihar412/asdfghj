import com.mysql.cj.util.DnsSrv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc= new  Scanner(System.in);
        String name = sc.nextLine();
        String age = sc.nextLine();
        String contact = sc.nextLine();
        String address = sc.nextLine();

         if(Config.create()!= null){
             System.out.println("connected");
         }

        Connection con = Config.create();
         String query =" insert into information(name,age,contact,address) " + "values(?,?,?,?)";
        PreparedStatement smt = con.prepareStatement(query);
        smt.setString(1,name);
        smt.setString(2,age);
        smt.setString(3,contact);
        smt.setString(4,address);
        smt.execute();
    }
}