package sooper;
import sooper.orders.Order;
import sooper.containers.*;

public class SuperMarket {
	public static void main(String[] args) {
		Order myOrder = new Order("myOrder_01");
		System.out.println(myOrder.toString());
		
		Container bag = new Bag("B01", 35, 12);
		Container box = new Box("B012", 20, 20, 20);
		
		myOrder.addContainer(box);
		myOrder.addContainer(bag);
		
		System.out.println(myOrder.toString());
	}
}
