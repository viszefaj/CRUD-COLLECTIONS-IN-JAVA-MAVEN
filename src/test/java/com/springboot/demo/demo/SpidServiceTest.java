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
public class SpidServiceTest {
    @Autowired
    UserService userService;
    @Autowired
    SpidService spidService;

    //creates a new spid connected to the user with id=1
    @Test
    public void createSpidTest() throws Exception {
        User firstUser = userService.getUser(2L);
        Spid newSpid = spidService.createSpid(new Spid(SpidStatus.PENDING, Type.LEVEL_1, firstUser));
    }

    //test the list of all spids
    @Test
    public void retrieveAllSpidsTest() throws Exception {
        System.out.println(spidService.retrieveAllSpids());
    }

}
