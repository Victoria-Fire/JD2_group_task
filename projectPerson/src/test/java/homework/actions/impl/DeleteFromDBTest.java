package homework.actions.impl;

import junit.framework.TestCase;
import org.junit.Test;

import java.sql.*;

public class DeleteFromDBTest extends TestCase {

    @Test
    public void testExecute() throws SQLException {
        Connection conn = DriverManager.
                getConnection("jdbc:h2:mem:person");
        Statement statement = conn.createStatement();
        statement.execute("create schema lesson_8");
        statement.execute("create table person(id int not null primary key, name char(50))");
        statement.execute("insert into person(id,name) values (1,'Igor')");
        statement.execute("insert into person(id,name) values (2,'Vasya')");
        statement.execute("delete from person where id = 1");
        ResultSet rs = statement.executeQuery("select * from person");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
    }
}