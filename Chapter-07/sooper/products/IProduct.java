package sooper.products;

import sooper.containers.IContainer;
import sooper.enums.ProductCategory;

public interface IProduct {
	String getRefence();
	
	int getWeight();
	int getVolume();
	
	ProductCategory getCategory();
	
	boolean isCompatible(IProduct product);
	boolean hasSpace(IContainer container);
	
	void addToContainer(IContainer container);
	
}
