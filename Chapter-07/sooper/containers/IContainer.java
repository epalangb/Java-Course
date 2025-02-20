package sooper.containers;
import java.util.Set;
import sooper.products.IProduct;

public interface IContainer {
	String getReference();
	
	int getVolume();
	int avalibleVolume();
	int getResistance();
	int getSurface();
	
	Set<IProduct> getProducts();
	
	String getType();
	
	boolean addProduct(IProduct product);
	boolean containerWithstand(IProduct product);
}
