package dao;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
     void insertUser(User user) throws SQLException;

     User selectUser(int id);

     List<User> selectAllUsers();

     boolean deleteUser(int id) throws SQLException;

     boolean updateUser(User user) throws SQLException;
     User getUserById(int id);

     void insertUserStore(User user) throws SQLException;
     void addUserTransaction(User user, int[] permisions);
     void insertUpdateWithoutTransaction();
     void insertUpdateUseTransaction();
     //procedure
     List<User> finAll();
     boolean deleteUserPro(int id) throws SQLException;
     boolean updateUserPro(User user) throws SQLException;
}
