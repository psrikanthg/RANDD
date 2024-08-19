package com.java.designpatterns;

public class ShopKeeper {
	
	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop  blackberry;
	
	
	public ShopKeeper() {
		iphone = new Iphone();
		samsung = new SamsungF();
		blackberry = new BlackBerry();
	}
	
	public void iphoneSale() {
		iphone.mobileNo();
		iphone.price();
		
	}
	
	public void samsungSale() {
		samsung.mobileNo();
		samsung.price();
	}
	
	public void blacBerry() {
		blackberry.mobileNo();
		blackberry.price();
	}
	
	

}
