package com.daniel.cart.resource;

import com.daniel.cart.bean.Cart;
import com.daniel.cart.bean.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/cart")
public class CartController {

    @GetMapping("/{userId}")
    public Cart getCart(@Valid @PathVariable long userId) {

        // For simplicity we are returning a hard coded value
        List<Product> products = new ArrayList<>();
        Product p1 = new Product(1, "keyboard", 250, 2);

        p1.setTotalPrice(p1.getBasePrice()*p1.getQuantity());
        products.add(p1);

        Product p2 = new Product(2, "mouse", 150, 2);
        p2.setTotalPrice(p2.getBasePrice()*p2.getQuantity());
        products.add(p2);

        double totalPrice = products.stream().mapToDouble(p->p.getTotalPrice()).sum();

        Cart cart = new Cart(products.size(), totalPrice, products);
        return cart;
    }
}
