package homework.dao.factory;

import homework.dao.interfaces.DAO;
import homework.dao.impl.DAOImpl;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-02 11:40
 */
public class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();
    private final DAO daoImpl = new DAOImpl();

    public DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public DAO getImplThroughDAO() {
        return daoImpl;
    }

}
