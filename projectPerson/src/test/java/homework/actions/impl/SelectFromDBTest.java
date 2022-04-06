package homework.actions.impl;

import junit.framework.TestCase;

import java.sql.*;

public class SelectFromDBTest extends TestCase {

    public void testExecute() throws SQLException {
                Connection conn = DriverManager.
                getConnection("jdbc:h2:mem:persons");
        Statement statement = conn.createStatement();
        statement.execute("create schema lesson_8");
        statement.execute("create table persons(id int not null primary key, name char(50))");
        statement.execute("insert into persons(id,name) values (1,'Igor')");
        statement.execute("insert into persons(id,name) values (2,'Vasya')");
        ResultSet rs = statement.executeQuery("select id,name from persons where id = 2");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
    }
}