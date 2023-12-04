package Service.Implement;

import Model.Database.User;
import Service.Interface.IUserService;
import Util.Connection.ConnectionJDBC;
import Util.Database.Query;

import java.sql.SQLException;
import java.util.Optional;

public class UserService implements IUserService {
    @Override
    public Optional<User> findByUserNamePassword(String userName, String password) {
        User result;
        try {
            result = Query.findUserByUserNamePassword(ConnectionJDBC.getConnection_JDBC(), userName, password);
            if(result == null)
                return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Optional.of(result);
    }

    @Override
    public Optional<User> createUser(User user) {
        User result;
        try {
            result = Query.createUser(ConnectionJDBC.getConnection_JDBC(), user);
            if(result == null)
                return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Optional.of(result);
    }
}
