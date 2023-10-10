package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order order = new Order(1080, new Date(), OrderStatus.PROCESSING);
		
		System.out.println(order);
		
		
		OrderStatus os1 = OrderStatus.SHIPPED;
		
		OrderStatus os2 = OrderStatus.DELIVERED;
		
		System.out.println("order " + os1);
		System.out.println("order " + os2);
				
	}

}
