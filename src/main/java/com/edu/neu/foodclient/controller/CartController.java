package com.edu.neu.foodclient.controller;

import com.edu.neu.foodclient.entity.Cart;
import com.edu.neu.foodclient.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartService cartService;

    @RequestMapping("/insertCart")
    public int insertCart(@RequestBody Cart cart){
        System.out.println(cart);
        return cartService.insertCart(cart);
    }

    @RequestMapping("/selectCart")
    public Cart selectCart(@RequestBody Cart cart){
        return cartService.selectCart(cart);
    }

    @RequestMapping("/getCartTypeNum")
    public int getNum(){
        return cartService.getCartTypeNum();
    }

    @RequestMapping("/getCart")
    public List<Cart> getCarts(){
        return cartService.getCarts();
    }

    @RequestMapping("/deleteCartItems")
    public int deleteCartItems(@RequestBody List<Cart> carts){
        System.out.println(carts);
        return 0;
    }
    @RequestMapping("/deleteCartItem")
    public int deleteCartItem(@RequestBody Cart cart){
        System.out.println(cart);
        cartService.deleteCartItem(cart);
        return 0;
    }

}
