package com.xworkz.Mobile;
import com.xworkz.Mobile.MobileDto.MobileDto;
import com.xworkz.Mobile.MobileDao.MobileDao;

public class MobileTester {
	

	public static void main(String[] args) {
		
		MobileDao mDao=new MobileDao();
		
		MobileDto m1= new MobileDto("Samsung", 42000, 8, "Black");
		MobileDto m2= new MobileDto("Mi", 15000, 6, "Blue");
		MobileDto m3= new MobileDto("Vivo", 12000, 4, "Red");
		MobileDto m4= new MobileDto("Oppo", 20000, 4, "Black");
		MobileDto m5= new MobileDto("iPhone", 85000, 6, "MidnightGreen");
		MobileDto m6= new MobileDto("OnePlus", 25000, 6, "Black");
		
		MobileDto mdtoArray[]= {m1,m2,m3,m4,m5,m6};
		mDao.displayMobileDto(mdtoArray);
		
	}
}
