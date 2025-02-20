package sooper.containers;

import java.util.Set;

import sooper.products.IProduct;

public abstract class Container implements IContainer {

	protected String reference;
	
	protected int height;
	
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
	public int getResistance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSurface() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<IProduct> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
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
