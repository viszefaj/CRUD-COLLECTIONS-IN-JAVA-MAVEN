package com.springboot.demo.demo;

import com.springboot.demo.demo.Entities.Spid;
import com.springboot.demo.demo.Entities.SpidStatus;
import com.springboot.demo.demo.Entities.Type;
import com.springboot.demo.demo.Entities.User;
import com.springboot.demo.demo.services.SpidService;
import com.springboot.demo.demo.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {DemoApplication.class})

public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Autowired
    private SpidService spidService;

    @Test
    public void createUserTest() {
        System.out.println(userService.createUser(new User(
                "name", "surname", "no1", "username", "pass", "email@yahoo.com")
        ));
    }

    @Test
    public void createSpidTest() {
        System.out.println(spidService.createSpid(new Spid(SpidStatus.PENDING, Type.LEVEL_1, new User())));
    }

    @Test
    public void editUser() throws Exception {
        User user = new User("example", "example", "example", "example", "example", "example");
        userService.editUser(1, user);
        user.setSurname("updated");
        System.out.println(user);
    }
}
