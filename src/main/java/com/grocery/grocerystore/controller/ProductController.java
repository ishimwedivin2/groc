package com.grocery.grocerystore.controller;

import com.grocery.grocerystore.model.Product;
import com.grocery.grocerystore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String listProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "productList";
    }

    @GetMapping("/products/new")
    public String showCreateForm(Model model) {
        model.addAttribute("product", new Product());
        return "productForm";
    }

    @PostMapping("/products")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "redirect:/products";  // After saving, redirect to the product list page
    }

    @GetMapping("/products/edit")
    public String showEditForm(@RequestParam("id") Long id, Model model) {
        Product product = productService.getProductById(id);
        if (product == null) {
            return "redirect:/products"; // Redirect back to the list if product is not found
        }
        model.addAttribute("product", product);
        return "productForm";
    }

    @GetMapping("/products/delete")
    public String deleteProduct(@RequestParam("id") Long id) {
        productService.deleteProductById(id);
        return "redirect:/products";
    }
}
