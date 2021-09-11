package com.medical.app.api.user;

import com.medical.app.model.user.User;
import com.medical.app.service.user.UserService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
@CrossOrigin(origins = "http://localhost:8100")
public class UserController {

    final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/findByPhoneNumber/{phoneNumber}")
    @ResponseBody
    public User findByPhoneNumber (@PathVariable String phoneNumber) {
        return service.findByPhoneNumber(phoneNumber);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public User findById (@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return this.service.save(user);
    }
}
