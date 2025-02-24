package sooper.containers;

import sooper.enums.ContainerType;

public class Bag extends Container {
	
	private int width;
	
	public Bag(String reference, int height, int width) {
		super(reference, height);
		this.width = width;
		this.type = ContainerType.BAG;
	}

	@Override
	public int getSurface() {
		int radius = getDiameter() / 2;
		return (int)(Math.PI * radius * radius);
	}

	private int getDiameter() {
		return (int)((width * 2) / Math.PI);
	}
}
