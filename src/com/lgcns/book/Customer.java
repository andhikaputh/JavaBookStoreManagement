package com.lgcns.book;

import com.lgcns.util.MissionUtill;

public class Customer {

		private int totalPrice;
		private String name;
		
		public Customer(String name) {
			super();
			this.name = name;
		}

		public int getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(int totalPrice) {
			this.totalPrice = totalPrice;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public void buyBook(Book book, int quantity) {
			if(book.getStockQuantity() < quantity) {
				System.out.println("[Error] Persediaannya kurang. jumlah persediaan saat ini :" + book.getStockQuantity() + " jilid");
				return;
			}else if (quantity ==0) {
				System.out.println("[Error]" + quantity+ " jilid Kurang, tidak dapat dibeli" );
			}else {
				book.setStockQuantity(book.getStockQuantity()-quantity);
				totalPrice += book.getPrice() * quantity;
				System.out.println(name + " membeli " + book.getTitle() + " jumlah total :" + MissionUtill.moneyFormat(totalPrice));
			}
			
			
		}
		
		public void buyBook(SecondBook book) {
			if(book.getStockQuantity()<1) {
				System.out.println("[Error] Persediaannya kurang. Jumlah pesediaan saat ini :" +book.getStockQuantity() + " jilid" );
				return;
			}
			
			book.setStockQuantity(0);
			int hargadiskon = book.getPrice()-(book.getPrice() * book.getDiscountRate()/100);
			totalPrice += hargadiskon;
			System.out.println(name + " membeli "+ book.getTitle() + " jumlah total : "+MissionUtill.moneyFormat(totalPrice));
		}
		
		
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return "Nama Pelanggan : " +getName() + "Jumlah total : " + MissionUtill.moneyFormat(totalPrice);
		}
		
}
