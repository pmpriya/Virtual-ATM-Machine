import java.sql.*;
import java.io.IOException;

public class ATM extends OptionMenu {
    
    public static void main(String[] args) throws IOException {
        // connection - mysql
        try {
            ATM.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "Admin@123");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from atm_table where username=" + username + ", password=" + password + ";");

            while(rs.next()) {
                System.out.println();
                // this is where u store all the data 
            
            }
            con.close();
        }catch (Exception e) {
            System.out.println(e);
        }

        OptionMenu optionmenu = new OptionMenu();
            optionmenu.getLogin();
    }
}
