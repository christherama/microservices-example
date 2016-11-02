package co.ramacciotti;

import co.ramacciotti.contact.Contact;
import co.ramacciotti.contact.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
    private final ContactService contactService;

    @Autowired
    public ApiController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public List<Contact> getContacts() {
        return contactService.contacts();
    }
}
