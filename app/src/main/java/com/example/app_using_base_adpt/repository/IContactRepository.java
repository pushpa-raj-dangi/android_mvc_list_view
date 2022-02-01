package com.example.app_using_base_adpt.repository;

import com.example.app_using_base_adpt.model.Contact;

import java.util.List;

public interface IContactRepository {
    List<Contact> getContacts();
    Contact getContact(int id);
    void addContact(Contact contact);
    String updateContact(Contact contact);
    String deleteContact(Contact contact);
}
