package org.amirs.uniback.controller;

import lombok.RequiredArgsConstructor;
import org.amirs.uniback.model.Product;
import org.amirs.uniback.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @CrossOrigin
    @GetMapping("/get-all")
    public ResponseEntity<Page<Product>> getProductPage(Pageable pageable){
        return ResponseEntity.ok(productService.findAll(pageable));
    }

    @CrossOrigin
    @GetMapping("/get-by-id")
    public Optional<Product> getProductById(@RequestParam String id){
        return productService.findById(id);
    }

    @CrossOrigin
    @PostMapping("/create-product")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product createdProduct = productService.create(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
    }

    @CrossOrigin
    @DeleteMapping("/delete-by-id")
    public ResponseEntity delete(@PathVariable String id){
        productService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
