package homework.actions.impl;

import homework.actions.interfaces.Command;
import homework.dao.interfaces.DAO;
import homework.dao.factory.DAOFactory;

import java.sql.SQLException;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-02 11:51
 */
public class SelectFromDB implements Command {
    @Override
    public void execute(String request) {
        DAOFactory daoFactoryObject = DAOFactory.getInstance();
        DAO dao = daoFactoryObject.getImplThroughDAO();
        try {
            dao.select(request);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
