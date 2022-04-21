package studioproject;
import java.sql.*;

public class conn {


    private Connection conn = null;
    private Statement st = null;
    private ResultSet rs = null;

    private final String url = "jdbc:mysql://localhost:3306/studio";
    private String username = "root";
    private String password = "";



    private void connectDB() throws SQLException {
        try{
            conn = DriverManager.getConnection(url,username,password);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public void disconnect() throws SQLException {
        try {
            conn.close();
        }catch (SQLException ex){
             ex.printStackTrace();
        }
    }

    public boolean execute (String query) throws SQLException {
        boolean rs;
        try{
            connectDB();
            st = conn.createStatement();
            st.execute(query);
            rs = true;
            disconnect();
        }catch (SQLException ex){
            rs = false;
        }

        return rs;
    }

    public ResultSet getResultSet (String query) throws SQLException {
        try{
            connectDB();
            st = conn.createStatement();
            rs = st.executeQuery(query);

        }catch (SQLException ex){
            rs = null;
        }
        return rs;
    }




}
