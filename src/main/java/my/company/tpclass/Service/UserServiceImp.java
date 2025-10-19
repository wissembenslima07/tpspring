package my.company.tpclass.Service;

import my.company.tpclass.Entity.User;
import my.company.tpclass.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public  class UserServiceImp implements Userservice{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(User user ){return userRepository.save(user);}

    @Override
    public List<User> getAllUser(){return userRepository.findAll();}
    @Override
    public User updateUser(User user){return userRepository.saveAndFlush(user);}
    @Override
    public User getUserByID(Long id){return userRepository.findById(id).get();}


    @Override
    public void deleteUser(Long id ){ userRepository.deleteById(id);}



}
