package homework.actions.impl;

import junit.framework.TestCase;

import java.sql.*;

public class InsertIntoDBTest extends TestCase {

    public void testExecute() throws SQLException {
        Connection conn = DriverManager.
                getConnection("jdbc:h2:mem:person");
        Statement statement = conn.createStatement();
        statement.execute("insert into person(id,name) values (3,'Igor')");
        statement.execute("insert into person(id,name) values (4,'Vasya')");
        ResultSet rs = statement.executeQuery("select * from person");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
    }
}