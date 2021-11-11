package com.xworkz.Mobile.MobileDto;

public class MobileDto {
private String brand;
private int price;
private int ramSize;
private String color;
public MobileDto(String brand, int price, int ramSize, String color) {
	super();
	this.brand = brand;
	this.price = price;
	this.ramSize = ramSize;
	this.color = color;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getRamSize() {
	return ramSize;
}
public void setRamSize(int ramSize) {
	this.ramSize = ramSize;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}}
