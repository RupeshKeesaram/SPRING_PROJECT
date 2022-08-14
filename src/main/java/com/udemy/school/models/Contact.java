package com.udemy.school.models;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class Contact {

    @NotBlank(message = "name must be greater than zero")
    @Size(min = 3,message = "name must be at least 3 characters long")
    String name;

    @NotBlank(message = "name must be greater than zero")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "mobile numbers must be 10 digits")
    String mobileNum;

    @NotBlank(message = "name must be greater than zero")
    @Email(message = "Please provide a valid emailId")
    String email;

    @NotBlank(message = "name must be greater than zero")
    @Size(min=5,message = "subject should be at least 5 characters")
    String subject;

    @NotBlank(message = "name must be greater than zero")
    @Size(min=10,message = "Message should be at least 10 characters long")
    String message;
}
