package com.web.springboot.demo;

import Entities.Spid;
import Entities.Status;
import Entities.User;
import Service.Crud_Op;
import Service.Crud_Op2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;


@SpringBootApplication(scanBasePackageClasses = {Crud_Op.class, Crud_Op2.class})
public class SpringbootDemoApplication implements CommandLineRunner {


	@Autowired
	public Crud_Op2 crud_op2;

	@Autowired
	public Crud_Op crud_op;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);



	}

	@Override
	public void  run(String...args) throws Exception{

		Crud_Op2 spid1=new Crud_Op2();
		Crud_Op user1=new Crud_Op();
		Spid spid=new Spid();

		user1.AddUser(new User(1723727L,new Date(),new Date(),"Elvis","Zefaj","username"));

		List<User> actList=user1.ShowUser();


		for(User act :actList){
			System.out.println(act.getId()+" "+act.getName()+" "+act.getSurname()+" "+act.getUsername());
		}


		spid1.AddSpid(new Spid(883772L,user1.Users.get(0), Status.PENDING,"hello"));
		List<Spid> actList2=spid1.ShowSpid();

		for(Spid act :actList2){
			if(!act.getUser().getUsername().equals(user1.Users.get(0))){
				System.out.println(act.getId()+" "+act.getUser().getUsername()+" "+act.getDescription()+" "+act.getStatusName());
			}else {
				throw new Exception("not equal");
			}
		}

		user1.UpdateUser(user1.Users.get(0), 183772L,"Elvis_updated","Zefaj_updated","elviszefaj_updated");
		spid1.UpdateSpid(spid1.Spids.get(0),172821L,user1.Users.get(0),Status.APPROVE,"test2");


		for(User act :actList){
			System.out.println(act.getId()+" "+act.getName()+" "+act.getSurname()+" "+act.getUsername());
		}

		for(Spid act :actList2){
			if(!act.getUser().getUsername().equals(user1.Users.get(0))){
				System.out.println(act.getId()+" "+act.getUser().getUsername()+" "+act.getDescription()+" "+act.getStatusName()+" "+ new Date());
			}else {
				throw new Exception("not equal");
			}
		}






	}

}
