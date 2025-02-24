package sooper.products;

import sooper.containers.IContainer;
import sooper.enums.ProductCategory;

public abstract class Product implements IProduct {
	
	protected String reference;
	
	protected ProductCategory category;
	
	protected int weight;
	protected int volume;
	
	public Product(String reference, int weight, int volume) {
		this.reference = reference;
		this.weight = weight;
		this.volume = volume;
	}

	@Override
	public String getRefence() {
		return this.reference;
	}

	@Override
	public int getWeight() {
		return this.weight;
	}

	@Override
	public int getVolume() {
		return this.volume;
	}

	@Override
	public ProductCategory getCategory() {
		return this.category;
	}

	@Override
	public boolean isCompatible(IProduct product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasSpace(IContainer container) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addToContainer(IContainer container) {
		// TODO Auto-generated method stub

	}

}
