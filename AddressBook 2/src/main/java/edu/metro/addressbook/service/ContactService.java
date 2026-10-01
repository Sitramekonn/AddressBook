package edu.metro.addressbook.service;

import edu.metro.addressbook.model.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {

    private List<Contact> contacts = new ArrayList<>();

    public ContactService() {

        contacts.add(new Contact(1, "Homer", "Simpson",
                "homer@email.com", "555-1111"));

        contacts.add(new Contact(2, "Marge", "Simpson",
                "marge@email.com", "555-2222"));
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        int newId = contacts.size() + 1;
        contact.setId(newId);
        contacts.add(contact);
    }

    public void deleteContact(int id) {
        contacts.removeIf(contact -> contact.getId() == id);
    }
    public Contact getContactById(int id) {
        for (Contact contact : contacts) {
            if (contact.getId() == id) {
                return contact;
            }
        }
        return null;
    }

    public void updateContact(Contact updatedContact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getId() == updatedContact.getId()) {
                contacts.set(i, updatedContact);
                break;
            }
        }
    }
}