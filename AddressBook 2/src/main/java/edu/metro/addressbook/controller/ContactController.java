package edu.metro.addressbook.controller;

import edu.metro.addressbook.model.Contact;
import edu.metro.addressbook.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ContactController {

    private ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping({"/", "/contacts"})
    public String showContacts(Model model) {
        model.addAttribute("contacts", contactService.getAllContacts());
        return "contacts";
    }

    @GetMapping("/contacts/new")
    public String showAddForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact-form";
    }

    @PostMapping("/contacts/add")
    public String addContact(Contact contact) {
        contactService.addContact(contact);
        return "redirect:/contacts";
    }

    @GetMapping("/contacts/delete/{id}")
    public String deleteContact(@PathVariable int id) {
        contactService.deleteContact(id);
        return "redirect:/contacts";
    }
    @GetMapping("/contacts/update/{id}")
    public String showUpdateForm(@PathVariable int id, Model model) {

        Contact contact = contactService.getContactById(id);

        model.addAttribute("contact", contact);

        return "contact-form";
    }

    @PostMapping("/contacts/update")
    public String updateContact(Contact contact) {

        contactService.updateContact(contact);

        return "redirect:/contacts";
    }
}