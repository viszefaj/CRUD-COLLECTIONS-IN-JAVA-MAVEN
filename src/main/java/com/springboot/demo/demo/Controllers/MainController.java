package com.springboot.demo.demo.Controllers;

import com.springboot.demo.demo.Entities.User;
import com.springboot.demo.demo.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
public class MainController {
    UserService userService;
    MainController(UserService userService){
        this.userService=userService;
    }
    //Get all Users
    @GetMapping("/users")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }
    //Search S
    //Post a user
    @PostMapping("/create")
    public String createUser(
            @RequestBody User user
    ) throws Exception {
        userService.createUser(user);
        return  "User has been registered :"+ user.getName();
    }
    //Update a user
    @PutMapping("/edit")
    public ResponseEntity<User> editUser(
            @RequestBody User user,
            @RequestParam long id
    ) throws Exception {
        user.setId(id);
        return new ResponseEntity(userService.createUser(user), HttpStatus.OK);
    }
    //Delete a user
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(
            @PathVariable(name = "id") long id
    ) throws Exception {
        userService.deleteUser(id);
        return new ResponseEntity("User has been deleted", HttpStatus.OK);
    }


}
