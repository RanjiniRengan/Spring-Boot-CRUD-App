package crud.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import crud.app.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {

	List<Product> findAll();

	Product findById(int id);

}
