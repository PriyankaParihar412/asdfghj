import java.sql.Connection;
import java.sql.DriverManager;

public class Config {

    static Connection con;

    public static Connection create () {
        try{
            String user = "root";
            String password = "Priyanka@412";
            String url = "jdbc:mysql://localhost:3306/ database1";
            con = DriverManager.getConnection(url, user, password);

        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}

