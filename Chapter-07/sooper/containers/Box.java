package sooper.containers;

import sooper.enums.ContainerType;

public class Box extends Container {
	
	private int length;
	private int width;
	
	
	public Box(String reference, int height, int width, int length) {
		super(reference, height);
		this.width = width;
		this.length = length;
		this.type = ContainerType.BOX;
	}

	@Override
	public int getSurface() {
		return width * length;
	}

}
