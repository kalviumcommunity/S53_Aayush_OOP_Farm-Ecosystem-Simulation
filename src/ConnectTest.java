import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectTest {
    public static void main(String[] args) throws Exception {
        String sql = "select * from sory";
        String url = "";
        String username = "";
        String password = "";
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString(2);
        System.out.println(name);

    }
}