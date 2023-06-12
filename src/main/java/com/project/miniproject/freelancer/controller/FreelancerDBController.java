package com.project.miniproject.freelancer.controller;

import com.project.miniproject.freelancer.entity.Freelancer;
import com.project.miniproject.freelancer.service.IFreelancerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class FreelancerDBController {
    @Autowired
    private IFreelancerService freelancerService;
    @GetMapping(path = "/all-freelancers")
    public List<Freelancer> getFreelancers() {
        return freelancerService.getFreelancers();
    }
    @GetMapping(path = "/get-freelancer/{id}")
    public Freelancer getFreelancerById(@PathVariable(name = "id") int frId){
        return freelancerService.getFreelancerById(frId);
    }
    @PostMapping(path = "/add-freelancers", consumes = "application/json")
    public Freelancer addFreelancer(@RequestBody Freelancer freelancer){
        return freelancerService.addFreelancer(freelancer);
    }
    @PutMapping(path = "/update-freelancer", consumes ="application/json")
    public Freelancer updateFreelancer(@RequestBody Freelancer freelancer){
        return freelancerService.updateFreelancerById(freelancer);
    }
    @DeleteMapping(path = "/delete-freelancer/{id}")
    public boolean deleteFreelancer(@PathVariable(name = "id")int id){
        return freelancerService.deleteFreelancerById(id);
    }
}
