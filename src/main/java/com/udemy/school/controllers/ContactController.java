package com.udemy.school.controllers;

import com.udemy.school.models.Contact;
import com.udemy.school.services.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Slf4j
@Controller
public class ContactController {

    private final ContactService contactService;

    @Autowired      // constructor level auto wiring
    public ContactController(ContactService contactService)
    {
        this.contactService = contactService;
    }


    @RequestMapping("/contact")
    public String displayCourses(Model model)
    {
        model.addAttribute("contact",new Contact());
        return "contact.html";
    }



    @RequestMapping(value = "/saveMsg",method = RequestMethod.POST)
    public String saveMsg(@Valid @ModelAttribute("contact") Contact contact, Errors errors)
    {
        if(errors.hasErrors())
        {
            log.warn(errors.toString());
            return "contact.html";
        }
        contactService.saveMsgDetails(contact);
        return "redirect:/contact";
    }
}
