package com.contact.api.dao;

import com.contact.api.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Contact,Integer> {

}
