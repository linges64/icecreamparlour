package com.example.demo.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FoodDetails {
@Id
private int no;
private String flavor;
private String topings;
private String size;
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getFlavor() {
	return flavor;
}
public void setFlavor(String flavor) {
	this.flavor = flavor;
}
public String getTopings() {
	return topings;
}
public void setTopings(String topings) {
	this.topings = topings;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
@Override
public String toString() {
	return "FoodDetails [no=" + no + ", flavor=" + flavor + ", topings=" + topings + ", size=" + size + "]";
}
}