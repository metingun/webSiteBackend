package com.website.backend.service;

import com.website.backend.model.ContactModel;
import com.website.backend.repository.ContactRepo;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final ContactRepo contactRepo;

    public ContactService(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    public String saveContact(ContactModel contactModel) {
        contactRepo.save(contactModel);
        return "Saved Successfully";
    }

    public String updateContact(ContactModel contactModel) {
        contactRepo.delete(contactRepo.findAll().get(0));
        contactRepo.save(contactModel);
        return "Updated Successfully";
    }

    public ContactModel getAllData() {
        return contactRepo.findAll().get(0);
    }
}
