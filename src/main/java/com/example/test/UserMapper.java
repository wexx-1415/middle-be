package com.example.test;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();
    int addUser(User user);
}