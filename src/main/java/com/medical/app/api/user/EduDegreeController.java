package com.medical.app.api.user;

import com.medical.app.model.user.EduDegree;
import com.medical.app.service.user.EduDegreeService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user/edu-degree")
@RestController
public class EduDegreeController {

    final EduDegreeService service;

    public EduDegreeController(EduDegreeService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public EduDegree findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @PostMapping
    public EduDegree save(@RequestBody EduDegree entity) {
        return this.service.save(entity);
    }
}
