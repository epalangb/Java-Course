package sooper.orders;

import java.util.Set;

import sooper.containers.IContainer;
import sooper.products.IProduct;

public abstract class Order implements IOrder {

	protected String reference;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addContainer(IContainer container) {
		// TODO Auto-generated method stub

	}

	@Override
	public IContainer addProduct(IProduct product) {
		// TODO Auto-generated method stub
		return null;
	}

}
