package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
//    private UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();

    private UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();

    @Override
    public void createUsersTable() {
        userDaoHibernate.createUsersTable();
//        userDaoJDBC.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        userDaoHibernate.dropUsersTable();
//        userDaoJDBC.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        userDaoHibernate.saveUser(name, lastName, age);
//        userDaoJDBC.saveUser(name, lastName, age);
    }


    @Override
    public void removeUserById(long id) {
        userDaoHibernate.removeUserById(id);
//        userDaoJDBC.removeUserById(id);
    }


    @Override
    public List<User> getAllUsers() {
//        return userDaoJDBC.getAllUsers();
        return userDaoHibernate.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        userDaoHibernate.cleanUsersTable();
//        userDaoJDBC.cleanUsersTable();
    }
}

