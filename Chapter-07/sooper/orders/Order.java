package sooper.orders;

import java.util.HashSet;
import java.util.Set;

import sooper.containers.IContainer;
import sooper.products.IProduct;

public class Order implements IOrder {

	protected String reference;
	protected Set<IContainer> containers;

	
	public Order(String reference) {
		this.reference = reference;
		this.containers = new HashSet<>();
	}

	@Override
	public String getReference() {
		return this.reference;
	}

	@Override
	public Set<IProduct> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<IContainer> getContainers() {
		return this.containers;
	}

	@Override
	public void addContainer(IContainer container) {
		this.containers.add(container);
	}

	@Override
	public IContainer addProduct(IProduct product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Order [reference=" + reference + ", containers=" + containers + "]";
	}
	
	

}
