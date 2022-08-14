package com.udemy.school.services;


import com.udemy.school.models.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ContactService {

    public boolean saveMsgDetails(Contact contact)
    {
        boolean isSaved = true;
        log.info("Details Added : "+contact.toString());
        return isSaved;
    }

}
