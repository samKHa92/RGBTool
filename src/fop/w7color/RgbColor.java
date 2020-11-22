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
		if(bitDepth <= 0 || bitDepth > 31)
			ExceptionUtil.unsupportedOperation("Wrong value for bitDepth.");
		if(red > IntMath.powerOfTwo(bitDepth)-1 || red < 0)
			ExceptionUtil.unsupportedOperation("Wrong value for red.");
		if(green > IntMath.powerOfTwo(bitDepth)-1 || green < 0)
			ExceptionUtil.unsupportedOperation("Wrong value for green.");
		if(blue > IntMath.powerOfTwo(bitDepth)-1 || blue < 0)
			ExceptionUtil.unsupportedOperation("Wrong value for blue.");
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
