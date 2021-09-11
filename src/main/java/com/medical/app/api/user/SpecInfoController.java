package com.medical.app.api.user;

import com.medical.app.model.user.SpecInfo;
import com.medical.app.service.user.SpecInfoService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user/spec-info")
@RestController
@CrossOrigin(origins = "http://localhost:8100")
public class SpecInfoController {

    final SpecInfoService service;

    public SpecInfoController(SpecInfoService service) {
        this.service = service;
    }

    @GetMapping("/{userId}")
    @ResponseBody
    public SpecInfo findById(@PathVariable Long userId) {
        return this.service.findById(userId);
    }

    @PostMapping
    public SpecInfo save(@RequestBody SpecInfo entity) {
        return this.service.save(entity);
    }
}
