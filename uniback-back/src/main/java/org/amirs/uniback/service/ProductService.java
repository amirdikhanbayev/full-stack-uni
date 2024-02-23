package org.amirs.uniback.service;

import org.amirs.uniback.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.Optional;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);
    Optional<Product> findById(String id);
    Product create(Product product);

    void deleteById(String id);

}
