import java.sql.Connection;
import java.sql.DriverManager;
public class myConnection {
    public static Connection getConnection(){
      Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/contactsapp1", "root", "");
        } catch (Exception ex) {
             System.out.println(ex.getMessage());
        }
        return con;
        
        
    }
}
