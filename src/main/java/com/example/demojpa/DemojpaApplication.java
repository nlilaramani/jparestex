package com.example.demojpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemojpaApplication {

	public static void main(String[] args) {
            
		ApplicationContext ctx=SpringApplication.run(DemojpaApplication.class, args);
                UserService service=ctx.getBean(UserService.class);
                User user=service.getUserById(1);
                System.out.println(user);
                User user2=new User();
                user2.setEmail("ewe@aa.com");
                user2.setFname("asdsd");
                user2.setLname("dsds");
                user.setPassword("dsdd");
                user.setUsername("huehyur");
                service.saveUser(user2);
                user.setEmail("new@email.com");
                service.updateUser(user);
                for(User u:service.getUsers()){
                    System.out.println(u);
                }
	}
        
}
