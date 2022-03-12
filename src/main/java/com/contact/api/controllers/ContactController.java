package com.contact.api.controllers;


import com.contact.api.entity.Contact;
import com.contact.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://imosaid-contactapi.herokuapp.com")
public class ContactController {

    @Autowired
    private UserService userService;
    @PostMapping("/add_contact")
    public Contact addContact(@RequestBody Contact contact) {
        return this.userService.addContact(contact);

    }
    @GetMapping("/contact")
    public List<Contact> getContact() {
        return this.userService.getAllContact();
    }

}