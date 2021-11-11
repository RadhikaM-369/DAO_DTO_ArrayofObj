package com.xworkz.Mobile.MobileDao;
import com.xworkz.Mobile.MobileDto.MobileDto;

public class MobileDao {

	public MobileDao() {
		System.out.println("Inside the mobile DAO");
	}
	public MobileDto createMobile(String brand, int price, int ramSize, String color) {
		System.out.println("Inside create method");
		MobileDto mobileDto=new MobileDto( brand, price, ramSize, color);
		return mobileDto;
	}	
	public void displayMobileDto(MobileDto mdto) {
		System.out.println("Inside display method");
		System.out.println(mdto.getBrand());
		System.out.println(mdto.getPrice());
		System.out.println(mdto.getRamSize());
		System.out.println(mdto.getColor());
	}
	
	public void displayMobileDto(MobileDto mdtoArray[]) {
		for (int i = 0; i < mdtoArray.length; i++) {
			System.out.println(mdtoArray[i].getBrand());
			System.out.println(mdtoArray[i].getPrice());
			System.out.println(mdtoArray[i].getRamSize());
			System.out.println(mdtoArray[i].getColor());
		}
	}
}
