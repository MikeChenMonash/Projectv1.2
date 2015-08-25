package JDBC;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.microsoft.sqlserver.jdbc.*;
import domain.BrigeInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Reference:https://azure.microsoft.com/en-us/documentation/articles/sql-database-develop-java-simple-windows/
 */
/**
 *
 * @author Loops
 */
public class jdbc {

    private final static String connectionString
            = "jdbc:sqlserver://id8i41z6ld.database.windows.net:1433;"
            + "database=smarttrip;"
            + "user=smartrip@id8i41z6ld.database.windows.net;"
            + "password=teamMASQ*701;"
            + "encrypt=true;"
            + "trustServerCertificate=false;"
            + "hostNameInCertificate=*.database.windows.net;"
            + "loginTimeout=30;";

    // Declare the JDBC objects.
    private static Connection connection = null;
    private Statement stmt = null;
    private static PreparedStatement preps = null;
    private PreparedStatement prepsUpdateAge = null;

    public jdbc() {
    }

    private static Connection getConnection() {

        try {
            connection = DriverManager.getConnection(connectionString);
            System.out.println(connection);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;

    }

    public static Collection<domain.BrigeInfo> findBlock(double height, double length, double width) {
        connection = getConnection();
        Collection<domain.BrigeInfo> brigeInf = new ArrayList<>();

        String query = "SELECT OBJECTID, ID_STRUCTURE, COLLOQUIAL_NAME_1, COLLOQUIAL_NAME_2, COLLOQUIAL_NAME_3, "
                + "CAST(MIN_CLEARANCE AS FLOAT) AS MIN_CLEARANCE, "
                + "CAST(OVERALL_LENGTH AS FLOAT) AS OVERALL_LENGTH, "
                + "CAST(OVERALL_WIDTH AS FLOAT) AS OVERALL_WIDTH, LAT, LONGIT FROM guest.Tbl_bridge_structure_victoria "
                + "WHERE CAST(MIN_CLEARANCE AS FLOAT) > ? "
                + "AND CAST(OVERALL_LENGTH AS FLOAT) > ? AND CAST(OVERALL_WIDTH AS FLOAT) > ?;";

        try {
            preps = connection.prepareStatement(query);

            preps.setDouble(1, height);
            preps.setDouble(2, length);
            preps.setDouble(3, width);
            ResultSet rset = preps.executeQuery();

            while (rset.next()) {
                domain.BrigeInfo brige = new BrigeInfo();
                
                brige.setObjectId(rset.getString(1));
                brige.setStructureId(rset.getString(2));
                brige.setCollName1(rset.getString(3));
                brige.setCollName2(rset.getString(4));
                brige.setCollName3(rset.getString(5));
                brige.setMinClearance(rset.getDouble(6));
                brige.setLength(rset.getDouble(7));
                brige.setWidth(rset.getDouble(8));
                brige.setLat(rset.getDouble(9));
                brige.setLongit(rset.getDouble(10));
                brigeInf.add(brige);
            }

            connection.close();
            rset.close();

        } catch (SQLException ex) {
            Logger.getLogger(jdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(brigeInf.size());
        return brigeInf;
    }
}
