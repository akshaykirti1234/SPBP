package tech.csm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tech.csm.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

	@Query("from Admin where adminId = :adminId")
	Admin findAdminById(Integer adminId);

}
