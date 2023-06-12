package com.project.miniproject.freelancer.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.project.miniproject.freelancer.entity.Freelancer;
import com.project.miniproject.freelancer.repository.FreelancerRepository;
import org.springframework.stereotype.Service;

@Service
public class FreelancerService implements IFreelancerService {
	@Autowired
	private FreelancerRepository freelancerRepository;
	@Override
	public List<Freelancer> getFreelancers() {
		return freelancerRepository.findAll();
	}

	@Override
	public Freelancer getFreelancerById(int id) {
		return freelancerRepository.getReferenceById(id);
	}

	@Override
	public Freelancer addFreelancer(Freelancer freelancer) {
		freelancerRepository.save(freelancer);
		return freelancerRepository.getReferenceById(freelancer.getId());
	}

	@Override
	public Freelancer updateFreelancerById(Freelancer freelancer) {
		freelancerRepository.save(freelancer);
		return freelancerRepository.getReferenceById(freelancer.getId());
	}

	@Override
	public boolean deleteFreelancerById(int id) {
		freelancerRepository.delete(freelancerRepository.getReferenceById(id));
		return true;
	}
}
