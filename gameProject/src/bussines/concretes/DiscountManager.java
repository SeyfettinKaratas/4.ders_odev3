package bussines.concretes;

import bussines.abstracts.DiscountService;
import entities.concretes.Discount;

public class DiscountManager implements DiscountService {

	@Override
	public void add(Discount discount) {
		System.out.println("�ndirim eklendi : "+ discount.getDiscountName());
		
	}

	@Override
	public void delete(Discount discount) {
		
		System.out.println("�ndirim silindi");
	}

	@Override
	public void update(Discount discount) {
		
		System.out.println("�ndirim g�ncellendi");
	}

}
