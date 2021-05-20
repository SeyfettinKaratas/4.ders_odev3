package bussines.concretes;

import bussines.abstracts.DiscountService;
import entities.concretes.Discount;

public class DiscountManager implements DiscountService {

	@Override
	public void add(Discount discount) {
		System.out.println("Ýndirim eklendi : "+ discount.getDiscountName());
		
	}

	@Override
	public void delete(Discount discount) {
		
		System.out.println("Ýndirim silindi");
	}

	@Override
	public void update(Discount discount) {
		
		System.out.println("Ýndirim güncellendi");
	}

}
