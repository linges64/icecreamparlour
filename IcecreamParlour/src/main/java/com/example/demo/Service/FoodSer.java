package com.example.demo.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.FoodDetails;
import com.example.demo.Repositary.FoodRepo;


@Service
public class FoodSer {
	@Autowired
	FoodRepo repo;
	
	public String saveFood(FoodDetails fooddtl)
	{
		repo.save(fooddtl);
		return "Value Added Successfully";
	}
	public List<FoodDetails>getCustomer()
	{
		return repo.findAll();
	}
	public Optional<FoodDetails>getCustomerById(int id)
	{
		return repo.findById(id);
	}
	public String getSave(FoodDetails fooddtl)
	{
		repo.save(fooddtl);
		return "UPDATED!!!";
	}
	public void deleteById(int id)
	{
		repo.deleteById(id);
	}
}

