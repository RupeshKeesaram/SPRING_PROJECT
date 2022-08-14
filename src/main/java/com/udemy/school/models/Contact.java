package com.udemy.school.models;


import lombok.Data;

@Data
public class Contact {
    String name;
    String mobileNum;
    String email;
    String subject;
    String message;

}
