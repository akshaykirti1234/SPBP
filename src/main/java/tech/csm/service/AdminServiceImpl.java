package tech.csm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.csm.model.Admin;
import tech.csm.repo.AdminRepo;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepo adminRepo;

	@Override
	public Admin findAdminById(Integer adminId) {
		return adminRepo.findAdminById(adminId);
	}

}
