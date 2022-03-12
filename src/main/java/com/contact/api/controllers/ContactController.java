package com.contact.api.controllers;


import com.contact.api.entity.Contact;
import com.contact.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ContactController {

    @Autowired
    private UserService userService;
    @PostMapping("/add_contact")
    public Contact addContact(@RequestBody Contact contact) {
        return this.userService.addContact(contact);

    }

}