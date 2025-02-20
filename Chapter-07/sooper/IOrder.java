package sooper;

import java.util.Set;

import sooper.containers.IContainer;
import sooper.products.IProduct;

public interface IOrder {
	
	String getReference();
	
	Set<IProduct> getProducts();
	
	Set<IContainer> getContainers();
	
	void addContainer(IContainer container);
	
	IContainer addProduct(IProduct product);
}
