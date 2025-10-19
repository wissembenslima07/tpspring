package my.company.tpclass.Service;

import my.company.tpclass.Entity.User;

import java.util.List;

public interface Userservice {
    User createUser (User user);
    List <User> getAllUser();
    User getUserByID(Long id);
    User updateUser( User user);
    void deleteUser (Long id);


}
