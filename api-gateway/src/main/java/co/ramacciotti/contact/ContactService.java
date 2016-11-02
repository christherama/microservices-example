package co.ramacciotti.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactClient contactClient;

    public List<Contact> contacts() {
        return contactClient.findAll();
    }
}
