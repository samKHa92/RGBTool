package fop.w7color;

public class RgbColor 
{
	private final int red;
	private final int green;
	private final int blue;
	private final int bitDepth;
	
	public RgbColor(int bitDepth, int red, int green, int blue)
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.bitDepth = bitDepth;
	}

	public int getRed() 
	{
		return red;
	}

	public int getGreen() 
	{
		return green;
	}

	public int getBlue() 
	{
		return blue;
	}

	public int getBitDepth() 
	{
		return bitDepth;
	}
	
	public RgbColor8Bit toRgbColor8Bit()
	{
		RgbColor8Bit temp = null;
		return temp;
	}

}
