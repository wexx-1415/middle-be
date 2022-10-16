package com.example.test;


import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    @GetMapping("/greet")
    public Greeting Greet(Greeting greeting) {
        return new Greeting(counter.incrementAndGet(), String.format(template, greeting.getContent()));
    }
    @GetMapping("add")
    public boolean Add(@RequestParam(value = "username", defaultValue = "1") String name, @RequestParam(value = "password", defaultValue = "2") String password) {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        System.out.println(name+password);
        User u = new User(name, password);
        try {
           int i=mapper.addUser(u);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e);
        }
        session.commit();
        session.close();
        return true;
    }
}