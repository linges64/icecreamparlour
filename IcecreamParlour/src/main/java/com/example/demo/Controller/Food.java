package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.FoodDetails;
import com.example.demo.Service.FoodSer;

@RestController
@RequestMapping("/food")

public class Food {
	@Autowired
	FoodSer food;
	
	@PostMapping("/pull")
	public String addDetails(@RequestBody FoodDetails fooddtl)
	{
		return food.saveFood(fooddtl);
	}
	@GetMapping("")
	public List<FoodDetails>read()
	{
		return food.getCustomer();
	}
	@PutMapping("/pum")
	public String update(@RequestBody FoodDetails fooddtl)
	{
		return food.getSave(fooddtl);
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id)
	{
		food.deleteById(id);
		return "deleted";
	}
	

}

