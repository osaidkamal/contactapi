package com.contact.api.services;

import com.contact.api.dao.UserRepo;
import com.contact.api.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepo userRepo;
    public Contact addContact(Contact contact) {
        return this.userRepo.save(contact);

    }
    public List<Contact> getAllContact() {
        return this.userRepo.findAll();
    }
}
