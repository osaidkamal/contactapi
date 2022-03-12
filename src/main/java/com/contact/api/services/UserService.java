package com.contact.api.services;

import com.contact.api.entity.Contact;

import java.util.List;

public interface UserService {
    public Contact addContact(Contact contact);
    public List<Contact> getAllContact();
}
