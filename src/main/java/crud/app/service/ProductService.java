package crud.app.service;

import java.util.List;

import crud.app.entity.Product;

public interface ProductService {

	 List<Product> listAllProducts();

	 Product getByProductId(int productId);

	 String createProduct(Product request);

	 String updateProduct(int productId, Product update);

	 String deleteProduct(int productId);

}
