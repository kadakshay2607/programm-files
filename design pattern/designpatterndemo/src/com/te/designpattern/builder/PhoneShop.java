package com.te.designpattern.builder;

public class PhoneShop {

	public static void main(String[] args) {
//		Phone phone = new Phone("android", 2, "mediatek", 80, 5.5);
//        System.out.println(phone);
        Phone phone2 = new PhoneSpec().setOs("android").setProcessor("snapdragon").getPhone();
        System.out.println(phone2);
	}

}
