package com.springboot.demo.demo.services;

import com.springboot.demo.demo.Entities.User;
import com.springboot.demo.demo.Exceptions.NoPersonFoundException;
import com.springboot.demo.demo.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;

    UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public User createUser(User user) throws Exception {
        Optional<User>  findIfPersonExists = userRepository.findByName(user.getName());

        if(findIfPersonExists.isPresent()){
            throw new NoPersonFoundException("User exists");
        }
        return userRepository.save(user);
    }
    public List<User> getAllUsers()
    {
        List<User> users= new ArrayList<User>();
        userRepository.findAll().forEach(user1-> users.add(user1));
        return users;
    }

    public void deleteUser(long id) throws Exception {
        Optional<User> findIfPersonExists = userRepository.findById(id);

        if(findIfPersonExists.isEmpty()) {
            throw new Exception("User doesnt exists");
        }
        userRepository.findById(id);
    }


}
