package com.medical.app.api.user;

import com.medical.app.model.user.ContactInfo;
import com.medical.app.service.user.ContactInfoService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user/contact-info")
@RestController
@CrossOrigin(origins = "http://localhost:8100")
public class ContactInfoController {

    final ContactInfoService service;

    public ContactInfoController(ContactInfoService service) {
        this.service = service;
    }

    @GetMapping("/findByUserId/{userId}")
    @ResponseBody
    public ContactInfo findByUserId(@PathVariable Long userId) {
        return this.service.findByUserId(userId);
    }

    @PostMapping
    public ContactInfo save(@RequestBody ContactInfo entity) {
        return this.service.save(entity);
    }
}
