package tech.csm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.csm.repo.SalesRepo;

@Service
public class SalesServiceImpl implements SalesService {

	@Autowired
	private SalesRepo salesRepo;

}
