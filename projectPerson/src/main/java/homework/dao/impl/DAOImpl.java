package homework.dao.impl;

import homework.JDBCUtils;
import homework.dao.interfaces.DAO;

import java.sql.*;

import static homework.JDBCUtils.*;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-02 11:23
 */
public class DAOImpl implements DAO {

    public Connection getConnection() throws SQLException {
        Connection conn;
        conn = DriverManager.getConnection(JDBCUtils.getValue(URL_KEY), JDBCUtils.getValue(USER_KEY), JDBCUtils.getValue(PASSWORD_KEY));
        return conn;
    }

    @Override
    public void select(String request) {
        System.out.println("Выполняется запрос в базу данных");
        System.out.println("===========================================");
        try {
            Connection conn = getConnection();
            Statement statement = conn.createStatement();
            try (ResultSet resultSet = statement.executeQuery(request)) {
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + " "
                            + resultSet.getString(2) + " "
                            + resultSet.getString(3));
                }
                System.out.println("Запрос обработан!");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                System.out.println("Ошибка обработки запроса!");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(String request) {
        System.out.println("База данных обновляется!");
        System.out.println("===========================================");
        try {
            Connection conn = getConnection();
            Statement statement = conn.createStatement();
            statement.executeUpdate(request);
            System.out.println("База данных успешно обновлена!");
        } catch (SQLException throwables) {
            System.out.println("Ошибка обновления базы данных!");
            throwables.printStackTrace();
        }
    }

    @Override
    public void delete(String request) {
        System.out.println("Информация удаляется из базы данных!");
        System.out.println("===========================================");
        try {
            Connection conn = getConnection();
            Statement statement = conn.createStatement();
            statement.executeUpdate(request);
            System.out.println("Информация в базе данных успешно удалена!");
        } catch (SQLException throwables) {
            System.out.println("Ошибка удаления из базы данных!");
            throwables.printStackTrace();
        }
    }

    @Override
    public void insert(String request) {
        System.out.println("Информация в базе данных обновляется!");
        System.out.println("===========================================");
        try {
            Connection conn = getConnection();
            Statement statement = conn.createStatement();
            statement.executeUpdate(request);
            System.out.println("Информация в базе данных успешно обновлена!");
        } catch (SQLException throwables) {
            System.out.println("Ошибка обновления информации в базе данных!");
            throwables.printStackTrace();
        }
    }
}
