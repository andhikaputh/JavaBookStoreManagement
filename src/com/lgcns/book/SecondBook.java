package com.lgcns.book;

public class SecondBook extends Book {
	private String seller;
	private int discountRate;
	
	public SecondBook (String title, String author, int price, int discountRate,String seller) {
		super(title,author,price, 1);
		
		this.seller = seller;
		this.discountRate = discountRate;
	}
	
	public int getDiscountRate() {
		return discountRate;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Tingkat diskon : "+ discountRate  +"%"+ " Penjual : " +seller;
	}
	
	
}
