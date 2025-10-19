package my.company.tpclass.Service;


import my.company.tpclass.Entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product createProduct(Product product);

    List<Product> getAllProducts();

    Optional<Product> getProductById(Long id);

    Product updateProduct(Product product);

    void deleteProduct(Long id);
}

