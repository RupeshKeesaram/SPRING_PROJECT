package com.udemy.school.controllers;

import com.udemy.school.models.Contact;
import com.udemy.school.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

    private final ContactService contactService;

    @Autowired      // constructor level auto wiring
    public ContactController(ContactService contactService)
    {
        this.contactService = contactService;
    }


    @RequestMapping("/contact")
    public String displayCourses()
    {
        return "contact.html";
    }



    @RequestMapping(value = "/saveMsg",method = RequestMethod.POST)
    public ModelAndView saveMsg(Contact contact)
    {
        contactService.saveMsgDetails(contact);
        return new ModelAndView("redirect:/contact");
    }
}
