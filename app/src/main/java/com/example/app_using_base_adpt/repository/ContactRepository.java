package com.example.app_using_base_adpt.repository;

import com.example.app_using_base_adpt.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactRepository implements IContactRepository {

    List<Contact> contacts = new ArrayList<>();

    @Override
    public List<Contact> getContacts() {
        contacts.add(new Contact(1,"Ram","9848484848","Kathmandu"));
        contacts.add(new Contact(2,"Hari","9848484848","Kathmandu"));
        contacts.add(new Contact(3,"Gopal","9848484848","Kathmandu"));
        contacts.add(new Contact(4,"Shyam","9848484848","Kathmandu"));
        contacts.add(new Contact(5,"Sita","9848484848","Kathmandu"));
        contacts.add(new Contact(6,"Gita","9848484848","Kathmandu"));
        contacts.add(new Contact(7,"Sarita","9848484848","Kathmandu"));
        contacts.add(new Contact(8,"Banish","9848484848","Kathmandu"));

        return contacts;
    }

    @Override
    public Contact getContact(int id) {

        Contact contact  = contacts.get(id);
        return contact;
    }

    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public String updateContact(Contact contact) {
        Contact contactInDb = getContact(contact.getId());
        if(contactInDb == null) return "Contact is not found.";
        contactInDb.setName(contact.getName());
        contactInDb.setAddress(contact.getAddress());
        contactInDb.setPhoneNumber(contact.getPhoneNumber());

        return contact.getName()+ "Is successfully updated.";
    }

    @Override
    public String deleteContact(Contact contact) {
        Contact contactInDb = getContact(contact.getId());
        if(contactInDb == null) return "Contact is not found.";
        Contact deletedContact = getContacts().remove(contact.getId());
        return deletedContact.getName() + "Successfully deleted.";
    }




}
