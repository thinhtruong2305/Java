package Service.Interface;

import Model.Database.User;

import java.util.Optional;

public interface IUserService {
    public Optional<User> findByUserNamePassword(String userName, String password);
    public Optional<User> createUser(User user);
}
