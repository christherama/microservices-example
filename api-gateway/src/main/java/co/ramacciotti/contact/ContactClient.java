package co.ramacciotti.contact;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("http://contact-service")
public interface ContactClient {
    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    List<Contact> findAll();
}
