package sooper.containers;
import java.util.Set;

import sooper.enums.ContainerType;
import sooper.products.IProduct;

public interface IContainer {
	String getReference();
	
	int getVolume();
	int avalibleVolume();
	int getEndurance();
	int getSurface();
	
	Set<IProduct> getProducts();
	
	ContainerType getType();
	
	boolean addProduct(IProduct product);
	boolean containerWithstand(IProduct product);
}
