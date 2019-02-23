package crud.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import crud.app.entity.Product;
import crud.app.service.ProductServiceImpl;

@RestController
@RequestMapping("/store")
public class ProductController {

	Product product = new Product();

	@Autowired
	ProductServiceImpl productServiceImpl;

	@GetMapping(value = "/listAllProducts")
	public List<Product> listAllProducts() {

		List<Product> allValues = new ArrayList<Product>();

		allValues = productServiceImpl.listAllProducts();

		return allValues;

	}

	@GetMapping(value = "/product/{id}")
	public Product getByProductId(@PathVariable(value = "id") int productId) {

		product = productServiceImpl.getByProductId(productId);

		return product;

	}

	@PostMapping(value = "/product")
	public String createProduct(@RequestBody Product request) {

		String response = productServiceImpl.createProduct(request);

		return response;

	}

	@PutMapping(value = "/product/{id}")
	public String updateProduct(@PathVariable(value = "id") int productId, @RequestBody Product update) {

		String response = productServiceImpl.updateProduct(productId, update);

		return response;
	}

	@DeleteMapping(value = "/product/{id}")
	public String deleteProduct(@PathVariable(value = "id") int productId) {

		String response = productServiceImpl.deleteProduct(productId);

		return response;

	}

}
