package com.capg.jse.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test17 {

	
	 public static void main(String[] args) {
		
		 ArrayList<Product> productsList = new ArrayList<Product>();
		 
		 //adding products
		 
		 productsList.add(new Product(1,"hplaptop",25000f));
		 productsList.add(new Product(2,"dell",30000f));
		 productsList.add(new Product(3,"lenovo",28000f));
		 
		 productsList.add(new Product(4,"sony",40000f));
		 
		 productsList.add(new Product(5,"apple",90000f));
		 
		 
		 /*productsList.stream().filter(product->product.getPrice()==30000)
		 .forEach(product -> System.out.println(product.getName()));	
		 */
		 
		 /*Float totalPrice = productsList.stream()
		 .map(product->product.price)
		 .reduce(0.0f,(sum,price)->sum+price);
		
		 System.out.println(totalPrice);*/
		 
		 
		 //using Collector's method to sum the prices
		 
		 Double totalPrice = productsList.stream()
		 .collect(Collectors.summingDouble(product->product.price));
		
		 System.out.println(totalPrice);
		 
		 
		 
		 
	 
	 }
		 
}
