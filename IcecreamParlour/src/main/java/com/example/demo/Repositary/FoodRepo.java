package com.example.demo.Repositary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.FoodDetails;

@Repository
public interface FoodRepo extends JpaRepository<FoodDetails, Integer>{

}

