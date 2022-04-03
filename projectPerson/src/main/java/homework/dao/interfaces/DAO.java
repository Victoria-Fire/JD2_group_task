package homework.dao.interfaces;

import java.sql.SQLException;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-02 11:09
 */
public interface DAO {

    void select(String request) throws SQLException;
    void update(String request) throws SQLException;
    void delete(String request) throws SQLException;
    void insert(String request) throws SQLException;



}
