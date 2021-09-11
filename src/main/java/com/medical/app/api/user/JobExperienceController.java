package com.medical.app.api.user;

import com.medical.app.model.user.JobExperience;
import com.medical.app.service.user.JobExperienceService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user/job-experience")
@RestController
public class JobExperienceController {

    final JobExperienceService service;

    public JobExperienceController(JobExperienceService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public JobExperience findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @PostMapping
    public JobExperience save(@RequestBody JobExperience entity) {
        return this.service.save(entity);
    }
}
