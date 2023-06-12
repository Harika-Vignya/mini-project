package com.project.miniproject.freelancer.service;

import java.util.List;

import com.project.miniproject.freelancer.entity.Freelancer;

public interface IFreelancerService {
	List<Freelancer> getFreelancers();
	Freelancer getFreelancerById(int id);
	Freelancer addFreelancer(Freelancer freelancer);
	Freelancer updateFreelancerById(Freelancer freelancer);
	boolean deleteFreelancerById(int id);
}


