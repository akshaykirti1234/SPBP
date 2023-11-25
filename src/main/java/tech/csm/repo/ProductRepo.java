package tech.csm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.csm.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
