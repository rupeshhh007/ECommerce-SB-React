package com.rupesh.e_commerce.Services;

import com.rupesh.e_commerce.Models.Product;
import com.rupesh.e_commerce.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product());
    }

    public Product addProduct(Product product, MultipartFile imageFile) {
        product.setImageName(imageFile.getOriginalFilename());
        repo.save(product);
        return product;
    }
}
