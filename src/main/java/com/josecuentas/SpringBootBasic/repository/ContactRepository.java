package com.josecuentas.SpringBootBasic.repository;

import com.josecuentas.SpringBootBasic.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer>{

}
