package com.tyss.stock_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.stock_management.dto.Product_Info;
import com.tyss.stock_management.service.StockService;

@RestController
public class StockController 
{
	@Autowired
	private StockService service;
	
	@PostMapping(path="/add-product",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	 public  boolean addProduct(@RequestBody Product_Info product) {
		if(service.addProduct(product)) {
			return true;
		}else {
			return false;
		}
	 }//end of addProduct()
	@PutMapping(path="/modify-product",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces =MediaType.APPLICATION_JSON_VALUE )
	 public boolean modifyEmployee(@RequestBody Product_Info product){
		
		if(service.modifyProduct(product)) {
			return true;
		}else {
			return false;
		}
	 }//end of modifyProduct() method
	@DeleteMapping(path="/delete/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	 public boolean deleteProductById(@PathVariable("id")int id) {
		if(service.deleteProductById(id)) {
			return true;
		}else {
			return false;
		}
	 }//end of deleteProductById() method
	@GetMapping(path="/get-all",produces = MediaType.APPLICATION_JSON_VALUE)
	 public  List<Product_Info> getAllEmployee(){
		List<Product_Info>  info=service.getAllProduct();
			if(!info.isEmpty()) {
				return info;
			}else {
				return null;
			}
	 }//end of getAllProduct() method
	 @GetMapping(path="/search-name/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
	 public Product_Info searchProductByName(@PathVariable("name")String name) {
		 Product_Info  info=service.searchProductByName(name);
		if(info!=null) {
			return info;
		}else {
			return null;
		}
	 }//end of getProductByName() method
	 
	 @GetMapping(path="/search-company/{company}",produces = MediaType.APPLICATION_JSON_VALUE)
	 public Product_Info searchProductByCompany(@PathVariable("company")String company) {
		 Product_Info  info=service.searchProductByCompany(company);
		if(info!=null) {
			return info;
		}else {
			return null;
		}
	 }//end of getProductByCompany() method
	 
	 @GetMapping(path="/search-category/{category}",produces = MediaType.APPLICATION_JSON_VALUE)
	 public List<Product_Info> searchProductByCategory(@PathVariable("category")String category) {
		 List<Product_Info>  info=service.searchProductByCategory(category);
		if(info!=null) {
			return info;
		}else {
			return null;
		}
	 }//end of getProductByCompany() method
}
