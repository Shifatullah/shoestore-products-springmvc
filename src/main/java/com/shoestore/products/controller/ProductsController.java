package com.shoestore.products.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ProductsController {

	@RequestMapping(value= "products", method = RequestMethod.GET)
	public List<String> list(){
		List<String> products = new ArrayList<String>();
		products.add("iPhone");
		products.add("Lenovo");
		products.add("Ice Cream");
		products.add("Chocolate");
		return products;
	}
	
}
