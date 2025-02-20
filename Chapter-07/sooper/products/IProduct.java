package sooper.products;

import sooper.containers.IContainer;

public interface IProduct {
	String getRefence();
	int getWeight();
	int getVolume();
	String getCategorie();
	
	boolean isCompatible(IProduct product);
	boolean hasSpace(IContainer container);
	
	void addToContainer(IContainer container);
	
}
