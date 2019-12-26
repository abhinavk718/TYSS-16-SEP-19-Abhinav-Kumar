package com.tyss.assetmanagement_backend.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.assetmanagement_backend.dto.Asset;
import com.tyss.assetmanagement_backend.dto.EmployeeBean;
import com.tyss.assetmanagement_backend.dto.Registration;
import com.tyss.assetmanagement_backend.service.AssetService;
import com.tyss.assetmanagement_backend.service.EmployeeService;
import com.tyss.assetmanagement_backend.service.RegisterService;

@CrossOrigin(origins ="*",allowCredentials = "true")
@RestController
public class EmployeeController
{
	@Autowired
	private EmployeeService service;
	@Autowired
	private AssetService service3;
	@Autowired
	private RegisterService service1;
	
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor=new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class,editor);
	}
	
	@PostMapping(path="/add",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	 public  boolean addEmployee(@RequestBody EmployeeBean bean) {
		
		 return service.addEmployee(bean);
	 }//end of addEmployee() method
	@PostMapping(path="/addasset",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean addAsset(@RequestBody Asset a)
	{
		return service3.addAsset(a);
	}
	@PostMapping(path="/register",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean register(@RequestBody Registration register)
	{
		return service1.register(register);
	}
	
	@PostMapping(path="/login",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean login(@RequestBody Registration bean)
	{
		String email = bean.getEmail();
		String password = bean.getPassword();
		return service1.login(email,password);
	}
	@PutMapping(path="/modify", consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean modifyAsset(@RequestBody Asset asset) {
		if(service3.modifyAsset(asset)) {
			return true;
		}else {
			return false;
		}
	} //end of modifyAsset
	@DeleteMapping(path="/deleteProduct/{assetName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean deleteAsset(@PathVariable("assetName")String assetName) {
		if(service3.deleteAsset(assetName)) {
			return true;
		}else {
			return false;
		}
	}//end of deleteAsset
	@GetMapping(path="/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public Asset getAsset(@RequestParam("assetName")String assetName) {
		Asset bean = service3.getAsset(assetName);
		if(bean!=null) {
			return bean;
		}else {
			return null;
		}
	}//end of getAsset
	@GetMapping(path="/get-all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Asset> getAllAsset() {
		List<Asset> beans = service3.getAllAsset();
		if(!beans.isEmpty()) {
			return beans;
		}else {
			return  null;
		}
	}//end of getAllAsset
}