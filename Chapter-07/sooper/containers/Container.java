package sooper.containers;

import java.util.Set;

import sooper.enums.ContainerType;
import sooper.products.IProduct;

public abstract class Container implements IContainer {

	protected String reference;
	protected ContainerType type;

	protected int endurance;
	protected int height;

	protected Set<IProduct> products;

	public Container(String reference, int height) {
		this.reference = reference;
		this.height = height;
	}

	@Override
	public String getReference() {
		return this.reference;
	}

	@Override
	public int getVolume() {
		return this.height * getSurface();
	}

	@Override
	public int avalibleVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEndurance() {
		return this.endurance;
	}

	@Override
	public abstract int getSurface();

	@Override
	public Set<IProduct> getProducts() {
		return this.products;
	}

	@Override
	public ContainerType getType() {
		return this.type;
	}

	@Override
	public boolean addProduct(IProduct product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containerWithstand(IProduct product) {
		// TODO Auto-generated method stub
		return false;
	}

}
