package com.springboot.demo.demo;

import com.springboot.demo.demo.Entities.Spid;
import com.springboot.demo.demo.Entities.SpidStatus;
import com.springboot.demo.demo.Entities.Type;
import com.springboot.demo.demo.Entities.User;
import com.springboot.demo.demo.services.SpidService;
import com.springboot.demo.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Autowired
    UserService userService;
	@Autowired
	SpidService spidService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(userService.createUser(new User("elvis","","","","","")));
		System.out.println(spidService.createSpid(new Spid(SpidStatus.PENDING, Type.LEVEL_2, new User("elvis","","","","",""))));
    }
}
