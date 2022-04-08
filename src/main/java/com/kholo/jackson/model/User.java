package com.kholo.jackson.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class User {

    private String name;
    private int age;
    private List<String> messages;

    public User createDummyUser(){

        User user = new User();

        user.setName("Kholofelo");
        user.setAge(99);

        List<String> msg = new ArrayList<>();
        msg.add("Hello kholofelo");
        msg.add("Kholofelo he is learning jackson json");
        msg.add("Kholofelo he is done with jackson learning");

        user.setMessages(msg);

        return user;

    }
}
