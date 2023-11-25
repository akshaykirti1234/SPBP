package tech.csm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.csm.model.Sales;

public interface SalesRepo extends JpaRepository<Sales, Integer> {

}
